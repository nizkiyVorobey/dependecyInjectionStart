package com.example.dependencyinjectionstart.example2.data.di

import com.example.dependencyinjectionstart.example2.presentation.MainActivity
import com.example.dependencyinjectionstart.example2.presentation.MainActivity2
import dagger.BindsInstance
import dagger.Subcomponent
import javax.inject.Named

@Subcomponent(modules = [ViewModelModule::class])
interface ActivityComponent {
    fun inject(activity: MainActivity)
    fun inject(activity: MainActivity2)

    // Нам портібно закинути id
    @Subcomponent.Factory
    interface Factory {
        fun create(
            /**
             * @Named потрібен для того, коли ми кладемо два паарметри однакового типу,
             * Dagger не буде знати яку з них класти, тод треба вказати @Named.
             *
             * Також @Named треба вказувати і в контуркторі, де ми отримуємо ці параметри
             */
            @BindsInstance @IdQualifier id: String,
            @BindsInstance @NameQualifier name: String,
        ): ActivityComponent
    }
}