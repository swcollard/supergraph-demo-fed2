plugins {
  id("org.springframework.boot") version "2.7.1"
  id("io.spring.dependency-management") version "1.0.11.RELEASE"
  id("org.jetbrains.kotlin.jvm") version "1.7.0"
  id("org.jetbrains.kotlin.plugin.spring") version "1.7.0"
}


repositories {
  mavenCentral()
}

dependencies {
  implementation("com.graphql-java:graphql-java:18.2")
  implementation("com.graphql-java:graphql-java-spring-boot-starter-webmvc:2021-10-25T04-50-54-fbc162f")
  implementation("org.springframework.boot:spring-boot-starter-web")
  implementation("com.apollographql.federation:federation-graphql-java-support:2.0.3")
  implementation("org.jetbrains.kotlin:kotlin-reflect")
  implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
  testImplementation("org.springframework.boot:spring-boot-starter-test")
}
