plugins {
    java
}

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

tasks.withType<Test> {
    useJUnitPlatform()
}