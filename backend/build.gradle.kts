plugins {
    java
    id("spring-conventions")
}

repositories {
    mavenCentral()
}

tasks.named<Jar>("jar") {
    enabled = true
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-security")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("org.liquibase:liquibase-core")

    runtimeOnly("com.h2database:h2")
    runtimeOnly("org.postgresql:postgresql")
}
