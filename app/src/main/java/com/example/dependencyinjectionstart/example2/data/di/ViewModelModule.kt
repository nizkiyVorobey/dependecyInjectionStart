package com.example.dependencyinjectionstart.example2.data.di

import androidx.lifecycle.ViewModel
import com.example.dependencyinjectionstart.example2.presentation.ExampleViewModel
import com.example.dependencyinjectionstart.example2.presentation.ExampleViewModel2
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import dagger.multibindings.StringKey

@Module
interface ViewModelModule {

    @IntoMap
    @ViewModelKey(ExampleViewModel::class)
    @Binds
    fun bindExampleViewModel(impl: ExampleViewModel): ViewModel

    @IntoMap
    @ViewModelKey(ExampleViewModel2::class)
    @Binds
    fun bindExampleViewModel2(impl: ExampleViewModel2): ViewModel
}