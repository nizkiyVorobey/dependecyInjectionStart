package com.example.dependencyinjectionstart.example1

import javax.inject.Inject
import kotlin.properties.Delegates.notNull

class Activity {


    // // Спосіб з гетерами
//    val component = DaggerNewComponent.create()
//
//    val keyboard: Keyboard = component.getKeyboard()
//    val mouse: Mouse = component.getMouse()
//    val monitor: Monitor = component.getMonitor()


//    // // Спосіб з інжектом
//    @Inject
//    lateinit var keyboard: Keyboard
//
//    @Inject
//    lateinit var mouse: Mouse
//
//    @Inject
//    lateinit var monitor: Monitor


    @Inject
    lateinit var computer: Computer

    init {
        DaggerNewComponent.create().inject(this)
    }
}