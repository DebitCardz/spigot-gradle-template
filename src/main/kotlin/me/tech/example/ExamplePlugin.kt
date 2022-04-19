package me.tech.example

import com.github.shynixn.mccoroutine.SuspendingJavaPlugin

class ExamplePlugin: SuspendingJavaPlugin() {
	override suspend fun onLoadAsync() {
		logger.info("Plugin loaded.")
	}

	override suspend fun onEnableAsync() {
		logger.info("Plugin enabled.")
	}

	override suspend fun onDisableAsync() {
		logger.info("Plugin disabled.")
	}
}