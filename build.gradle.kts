plugins {
    kotlin("jvm") version "1.9.21"
    application
}

group = "cz.kousalik"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

application {
    mainClass = "cz.kousalik.MainKt"
}

dependencies {
    implementation("org.springframework:spring-context:6.1.6")

    testImplementation("org.jetbrains.kotlin:kotlin-test")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}