plugins {
    java
    application
    jacoco
}

repositories { mavenCentral() }

java { toolchain { languageVersion.set(JavaLanguageVersion.of(17)) } }

application {
    // change this if your CLI main class is different
    mainClass.set("bank.BankCli")
}

dependencies {
    // BOM + Jupiter API/Engine
    testImplementation(platform("org.junit:junit-bom:5.11.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")

    // REQUIRED for Gradle 8.7+ to start the JUnit Platform
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.test { useJUnitPlatform() }

tasks.jacocoTestReport {
    reports {
        xml.required.set(true)
        html.required.set(true)
    }
}

tasks.jar {
    manifest { attributes["Main-Class"] = "bank.BankCli" }
    duplicatesStrategy = DuplicatesStrategy.EXCLUDE
}
