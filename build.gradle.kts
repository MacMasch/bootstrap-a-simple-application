plugins {
    id("org.sonarqube") version "6.0.1.5171"
    id("com.vanniktech.maven.publish") version "0.30.0"
    id("pl.allegro.tech.build.axion-release") version "1.18.17"
}

allprojects {
    // Apply the common 'java' plugin to all projects (including the root)
    plugins.apply("java")

    repositories {
        mavenCentral()
    }
}

//subprojects {
//    // Apply the 'java-library' plugin to all subprojects (excluding the root)
//    plugins.apply("java-library")
//}

version = "0.0.1"

tasks.named<Jar>("jar") {
    enabled = false
}

repositories {
    mavenCentral()
}

buildscript {
    repositories {
        mavenCentral() // or gradlePluginPortal()
    }
    dependencies {
        classpath("com.dipien:semantic-version-gradle-plugin:2.0.0")
    }
}
apply(plugin = "com.dipien.semantic-version")


sonar {
    properties {
        property("sonar.projectKey", "MacMasch_bootstrap-a-simple-application")
        property("sonar.organization", "macmasch")
        property("sonar.host.url", "https://sonarcloud.io")
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}