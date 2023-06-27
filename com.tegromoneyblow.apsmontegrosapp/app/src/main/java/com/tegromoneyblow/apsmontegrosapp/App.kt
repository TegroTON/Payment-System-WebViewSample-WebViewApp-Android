package com.tegromoneyblow.apsmontegrosapp

import android.app.Application
import com.yandex.metrica.YandexMetrica

import com.yandex.metrica.YandexMetricaConfig


class App : Application() {
    override fun onCreate() {
        super.onCreate()

        val config =
            YandexMetricaConfig.newConfigBuilder("78ce099c-2c60-4a29-9d7e-cef6759ff88b").build()
        YandexMetrica.activate(applicationContext, config)
        YandexMetrica.enableActivityAutoTracking(this)
    }
}