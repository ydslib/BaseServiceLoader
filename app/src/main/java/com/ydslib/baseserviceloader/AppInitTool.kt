package com.ydslib.baseserviceloader

import java.util.ServiceLoader

object AppInitTool {

    private val loader: ServiceLoader<AppInit> by lazy {
        ServiceLoader.load(AppInit::class.java)
    }

    fun initAllModuleSdk() {
        val iterator = loader.iterator()
        while (iterator.hasNext()) {
            iterator.next().initAllModuleSdk()
        }
    }
}