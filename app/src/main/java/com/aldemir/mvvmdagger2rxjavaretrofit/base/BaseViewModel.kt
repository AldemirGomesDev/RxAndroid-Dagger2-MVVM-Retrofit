package com.aldemir.mvvmdagger2rxjavaretrofit.base

import androidx.lifecycle.ViewModel
import com.aldemir.mvvmdagger2rxjavaretrofit.injection.component.DaggerViewModelInjector
import com.aldemir.mvvmdagger2rxjavaretrofit.injection.component.ViewModelInjector
import com.aldemir.mvvmdagger2rxjavaretrofit.injection.module.NetworkModule
import com.aldemir.mvvmdagger2rxjavaretrofit.ui.main.PostListViewModel
import com.aldemir.mvvmdagger2rxjavaretrofit.ui.main.PostViewModel

abstract class BaseViewModel: ViewModel() {

    private val injector: ViewModelInjector = DaggerViewModelInjector
        .builder()
        .networkModule(NetworkModule)
        .build()

    init {
        inject()
    }

    /**
     * Injects the required dependencies
     */
    private fun inject() {
        when (this) {
            is PostListViewModel -> injector.inject(this)
            is PostViewModel -> injector.inject(this)
        }
    }
}