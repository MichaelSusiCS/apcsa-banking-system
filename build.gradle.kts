plugins {
  application
  jacoco
}
repositories { mavenCentral() }
java { toolchain { languageVersion.set(JavaLanguageVersion.of(17)) } }
application { mainClass.set("bank.BankCli") }
dependencies { testImplementation("org.junit.jupiter:junit-jupiter:5.11.0") }
tasks.test { useJUnitPlatform() }
tasks.jacocoTestReport { reports { xml.required.set(true); html.required.set(true) } }
sourceSets {
  named("main") { java.srcDirs("src") }
  named("test") { java.srcDirs("src/test/java") }
}
tasks.jar {
  manifest { attributes["Main-Class"] = "bank.BankCli" }
  duplicatesStrategy = DuplicatesStrategy.EXCLUDE
}
