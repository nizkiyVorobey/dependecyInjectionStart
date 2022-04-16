package com.example.dependencyinjectionstart.example2

import android.app.Application
import com.example.dependencyinjectionstart.example2.data.di.DaggerApplicationComponent

class ExampleApp : Application() {
//     val component by lazy {
//        DaggerApplicationComponent.builder()
//            .currentTimeMillis(System.currentTimeMillis())
//            .context(this)
//            .build()
//    }

    val component by lazy {
        DaggerApplicationComponent.factory()
            .create(
                context = this,
                currentTimeMillis = System.currentTimeMillis()
            )
    }

}