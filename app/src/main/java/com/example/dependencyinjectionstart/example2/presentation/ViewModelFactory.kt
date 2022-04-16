package com.example.dependencyinjectionstart.example2.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.dependencyinjectionstart.example2.data.di.ApplicationScope
import javax.inject.Inject
import javax.inject.Provider

///**
// * Це одна ViewModelFactory на весь додаток, ми отримаємо список viewModel
// * Тепер при перевороті viewModel буде одна і таж, а при зміні Activity - різні
// *
// * Ми обертаємо ViewModel у Provider, і коли викликаємо у нього метод get,
// * він повертає нове значення
// */
//@ApplicationScope
class ViewModelFactory @Inject constructor(
    private val viewModelProviders: @JvmSuppressWildcards Map<Class<out ViewModel>, Provider<ViewModel>>
) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return viewModelProviders[modelClass]?.get() as T
    }
}