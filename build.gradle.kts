plugins {
    id("org.jetbrains.kotlin.jvm").version("1.3.31")
    application
}

repositories {
    jcenter()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
}

application {
    mainClassName = "id.kotlin.situng.AppKt"
}
