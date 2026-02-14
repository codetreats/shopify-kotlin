plugins {
    kotlin("jvm") version "1.9.0"
    `maven-publish`
    id("signing")
}

group = "net.codetreats"
version = "0.0.1"

repositories {
    mavenCentral()
}

dependencies {
    api("org.apache.logging.log4j:log4j-api:2.24.1")
    implementation("net.codetreats:kotlin-rest-client:3.0.0")
    implementation("com.squareup.moshi:moshi-kotlin:1.15.1")
    implementation("com.squareup.moshi:moshi-adapters:1.15.1")
    testImplementation("org.junit.jupiter:junit-jupiter:5.8.1")
    implementation("org.slf4j:slf4j-simple:2.0.9")
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(17)
}

signing {
    sign(publishing.publications)
}

publishing {
    publications {
        create<MavenPublication>("mavenJava") {
            from(components["java"])

            groupId = "net.codetreats"
            artifactId = "shopify-kotlin"
            version = project.version as String

            pom {
                name = "shopify-kotlin"
                packaging = "jar"
                description = "a kotlin library for the Shopify Rest-API"
                url = "https://github.com/codetreats/shopify-kotlin"
                licenses {
                    license {
                        name = "MIT License"
                        url = "https://opensource.org/licenses/MIT"
                    }
                }
                developers {
                    developer {
                        id = "martin"
                        name = "Martin"
                        email = "mail@codetreats.net"
                    }
                }
                scm {
                    connection = "scm:git:git://github.com/codetreats/shopify-kotlin.git"
                    developerConnection = "scm:git:git://github.com/codetreats/shopify-kotlin.git"
                    url = "https://github.com/codetreats/shopify-kotlin.git"
                }
            }
        }
    }

    repositories {
        maven {
            this.name = "repo"
            this.url = uri(project.findProperty("repo.url")?.toString() ?: "")
            this.isAllowInsecureProtocol = true
        }
    }
}

java {
    withSourcesJar()
    withJavadocJar()
}
