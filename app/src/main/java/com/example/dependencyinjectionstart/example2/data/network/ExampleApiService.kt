package com.example.dependencyinjectionstart.example2.data.network

import android.util.Log
import javax.inject.Inject

/**
 * @Singleton парцює корректно лише якщо ми будемо викликати дагер не в activity
 * Цей компонент буде жити рівно стільки, скільки буде жити компонент, який його стоврив, що помічений такою самойю анотацією,
 * саме тому @Singleton на практиці не використовують, а роблять свої воасні scope
 */
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
