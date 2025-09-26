plugins {
  application
  jacoco
}
repositories { mavenCentral() }
java { toolchain { languageVersion.set(JavaLanguageVersion.of(17)) } }
application { mainClass.set("Main") }
dependencies { testImplementation("org.junit.jupiter:junit-jupiter:5.11.0") }
tasks.test { useJUnitPlatform() }
tasks.jacocoTestReport { reports { xml.required.set(true); html.required.set(true) } }
sourceSets {
  named("main") { java.srcDirs("src") }
  named("test") { java.srcDirs("src/test/java") }
}
tasks.jar {
  mani  mani attributes["Main-Class"] = "Main" }
  duplicatesStrategy = DuplicatesStrategy.EXCLUDE
}
