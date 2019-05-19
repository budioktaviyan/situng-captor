plugins {
    id("org.jetbrains.kotlin.jvm").version("1.3.31")
    application
}

repositories {
    jcenter()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    implementation("org.seleniumhq.selenium:selenium-java:3.141.59")
    implementation("org.seleniumhq.selenium:selenium-firefox-driver:3.141.59")
    implementation("org.seleniumhq.selenium:htmlunit-driver:2.35.1")
    implementation("commons-io:commons-io:2.5")
}

application {
    mainClassName = "id.kotlin.situng.AppKt"
}
