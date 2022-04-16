package com.example.dependencyinjectionstart.example2.data.di

import android.content.Context
import com.example.dependencyinjectionstart.example2.presentation.MainActivity
import com.example.dependencyinjectionstart.example2.presentation.MainActivity2
import dagger.BindsInstance
import dagger.Component

@ApplicationScope
@Component(modules = [DataModule::class, DomainModule::class])
interface ApplicationComponent {

    fun activityComponentFactory(): ActivityComponent.Factory

//    /**
//     * Тут ми додажмо метод для додавання контекста.
//     * Отже якщо нам потрібно передати якусь залежніть у граф залежностей, то треба використовувати @Component.Builder
//     */
//    @Component.Builder
//    interface ApplicationComponentBuilder {
//
//        @BindsInstance // Ця анотація показує, що цей контекст потрібно закинути у граф залежностей
//        fun context(context: Context): ApplicationComponentBuilder
//
//        @BindsInstance
//        fun currentTimeMillis(currentTimeMillis: Long): ApplicationComponentBuilder
//
//        fun build(): ApplicationComponent
//    }

    /**
     * Теж саме, що і @Component.Builder, просто новий спосіб, використовують обидва
     */
    @Component.Factory
    interface ApplicationComponentFactory {
        fun create(
            @BindsInstance context: Context,
            @BindsInstance currentTimeMillis: Long
        ): ApplicationComponent
    }
}