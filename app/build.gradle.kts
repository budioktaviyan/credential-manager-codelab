plugins {
  alias(libs.plugins.android.application)
  alias(libs.plugins.kotlin.android)
}

android {
  namespace = "id.android.demo.credman"
  compileSdk = 35
  buildToolsVersion = "35.0.0"

  defaultConfig {
    applicationId = namespace
    minSdk = 35
    targetSdk = 35
    versionCode = 1
    versionName = "1.0.0"

    testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
  }

  buildTypes {
    release {
      isMinifyEnabled = false
      proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
    }
  }
  compileOptions {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
  }
  kotlinOptions {
    jvmTarget = "${JavaVersion.VERSION_17}"
  }
  buildFeatures.compose = true
  composeOptions.kotlinCompilerExtensionVersion = "1.5.15"
}

dependencies {
  implementation(libs.androidx.core.ktx)
  implementation(libs.bundles.androidx.lifecycle)
  implementation(libs.androidx.activity.compose)
  implementation(platform(libs.androidx.compose.bom))
  implementation(libs.bundles.compose)

  testImplementation(libs.junit)

  androidTestImplementation(libs.androidx.junit)
  androidTestImplementation(libs.androidx.espresso.core)
  androidTestImplementation(platform(libs.androidx.compose.bom))
  androidTestImplementation(libs.androidx.ui.test.junit4)

  debugImplementation(libs.bundles.compose.debug)
}
