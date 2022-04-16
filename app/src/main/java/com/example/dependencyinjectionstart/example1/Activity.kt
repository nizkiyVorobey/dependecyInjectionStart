package com.example.dependencyinjectionstart.example1

import kotlin.properties.Delegates.notNull

class Activity {
    var computer by notNull<Computer>()
    var keyboard by notNull<Keyboard>()

    init {
        Component().inject(this)
    }
}