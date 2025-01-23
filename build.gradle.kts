plugins {
    id("java-library")
    id("maven-publish")
    kotlin("jvm") version "1.9.25"
}

group = "ecowind.ru"
version = "1.0.0"

publishing {
    publications {
        create<MavenPublication>("maven") {
            from(components["java"])
        }
    }
}

repositories {
    mavenCentral()
    mavenLocal()
}

dependencies {
    testImplementation(kotlin("test"))
}

kotlin {
    jvmToolchain(17)
}