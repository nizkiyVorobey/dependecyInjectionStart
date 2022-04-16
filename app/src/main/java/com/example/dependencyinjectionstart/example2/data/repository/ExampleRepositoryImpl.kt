package com.example.dependencyinjectionstart.example2.data.repository

import com.example.dependencyinjectionstart.example2.data.datasource.ExampleLocalDataSource
import com.example.dependencyinjectionstart.example2.data.datasource.ExampleRemoteDataSource
import com.example.dependencyinjectionstart.example2.data.di.ProdQualifier
import com.example.dependencyinjectionstart.example2.data.di.TestQualifier
import com.example.dependencyinjectionstart.example2.data.mapper.ExampleMapper
import com.example.dependencyinjectionstart.example2.domain.ExampleRepository
import javax.inject.Inject

/**
 *  За допомогою @ProdQualifier ми говоримо завантажити дані з сервата, а якщо поставимо @TestQualifier
 *  то отримаэмо TestRemoteDataSourceImpl і там можемо поставити свої тестові дані
 */
class ExampleRepositoryImpl @Inject constructor(
    private val localDataSource: ExampleLocalDataSource,
    @ProdQualifier private val remoteDataSource: ExampleRemoteDataSource,
    private val mapper: ExampleMapper
) : ExampleRepository {

    override fun method() {
        mapper.map()
        localDataSource.method()
        remoteDataSource.method()
    }
}
