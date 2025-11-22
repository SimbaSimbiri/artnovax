import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.compose.compiler)
    alias(libs.plugins.ksp)
    alias(libs.plugins.room)
    alias(libs.plugins.kotlinx.serialization)
}

android {
    namespace = "com.simbiri.artnovax"
    compileSdk {
        version = release(36)
    }

    defaultConfig {
        applicationId = "com.simbiri.artnovax"
        minSdk = 24
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    buildFeatures {
        compose = true
    }
    room {
        schemaDirectory("$projectDir/schemas")
    }
}
kotlin {
    compilerOptions {
        jvmTarget.set(JvmTarget.JVM_17)
    }
}


dependencies {
    // Core + lifecycle + activity
    implementation(libs.bundles.androidx.core)

    // Compose BOM
    implementation(platform(libs.androidx.compose.bom))

    //UI toolkit
    implementation(libs.bundles.androidx.compose)

    // App-common AndroidX / Kotlin utilities e.g serialization/date time
    implementation(libs.bundles.androidx.app.common)

    // Ktor / Coil / Koin (existing bundles)
    implementation(libs.bundles.koin)
    implementation(libs.bundles.ktor)
    implementation(libs.bundles.coil)

    // Room
    implementation(libs.bundles.room)
    ksp(libs.room.compiler)

    // Unit tests
    testImplementation(libs.bundles.test.unit)

    // Android instrumented tests
    androidTestImplementation(libs.bundles.test.android)
    androidTestImplementation(platform(libs.androidx.compose.bom))

    // Debug tooling
    debugImplementation(libs.bundles.debug.android)
}