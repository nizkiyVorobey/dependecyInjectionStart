package com.example.dependencyinjectionstart.example2.data.network

import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton

// Singleton парцює корректно лише якщо ми будемо викликати дагер не в activity
@Singleton
class ExampleApiService @Inject constructor(
    private val currentTimeMillis: Long,
) {

    fun method() {
        Log.d(LOG_TAG, "ExampleApiService $currentTimeMillis $this")
    }

    companion object {

        private const val LOG_TAG = "EXAMPLE_TEST"
    }
}
