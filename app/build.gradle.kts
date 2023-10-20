plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    compileSdkVersion(33)
    namespace = "com.example.personatgesmis"
    defaultConfig {
        applicationId = "com.example.personatgesmis"
        minSdkVersion(24)
        targetSdkVersion(33)
        versionCode = 1
        versionName = "1.0"
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }

    buildFeatures {
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.2" // Utilizando la versión estable
    }

    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
    implementation("androidx.core:core-ktx:1.7.0")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.4.0")
    implementation("androidx.activity:activity-compose:1.4.0")

    implementation("androidx.compose.ui:ui:1.0.0") // Utilizando la versión estable
    implementation("androidx.compose.material:material:1.0.0") // Utilizando la versión estable
    implementation("androidx.compose.material3:material3:1.0.0-beta02")

    testImplementation("junit:junit:1.5.0")
    androidTestImplementation("androidx.test.ext:junit:1.5.0")
    androidTestImplementation("androidx.test.espresso:espresso-core:1.5.0")

    debugImplementation("androidx.compose.ui:ui-tooling:1.0.0") // Utilizando la versión estable
}

