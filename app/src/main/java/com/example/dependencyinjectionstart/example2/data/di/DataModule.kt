package com.example.dependencyinjectionstart.example2.data.di

import com.example.dependencyinjectionstart.example2.data.datasource.*
import dagger.Binds
import dagger.Module

//@Module
//abstract class DataModule {
//
//    /**
//     * Якщо нам метод лише повертає імплементацію, то краще використтати @Binds заміть @Provides,
//     * длґ цього сам метод і клас робимо абстрактими
//     */
//    @Binds
//    abstract fun bindLocalDataSourceImpl(impl: ExampleLocalDataSourceImpl): ExampleLocalDataSource
//
//    @Provides
//    fun provideRemoteDataSourceImpl(impl: ExampleRemoteDataSourceImpl): ExampleRemoteDataSource {
//        return impl
//    }
//}


/**
 * Якщо усі методи є @Binds, то модна прибрати abstract і зробити клас інтерфейсом
 */
@Module
interface DataModule {

    @ApplicationScope
    @Binds
    fun bindLocalDataSourceImpl(impl: ExampleLocalDataSourceImpl): ExampleLocalDataSource

    @ProdQualifier
    @ApplicationScope
    @Binds
    fun bindRemoteDataSource(impl: ExampleRemoteDataSourceImpl): ExampleRemoteDataSource

    @TestQualifier
    @ApplicationScope
    @Binds
    fun bindTestRemoteDataSource(impl: TestRemoteDataSourceImpl): ExampleRemoteDataSource
}