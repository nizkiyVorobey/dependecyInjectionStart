package com.example.dependencyinjectionstart.example2.data.network

import android.util.Log
import javax.inject.Inject

class ExampleApiService @Inject constructor(
    private val currentTimeMillis: Long,
) {

    fun method() {
        Log.d(LOG_TAG, "ExampleApiService $currentTimeMillis")
    }

    companion object {

        private const val LOG_TAG = "EXAMPLE_TEST"
    }
}
