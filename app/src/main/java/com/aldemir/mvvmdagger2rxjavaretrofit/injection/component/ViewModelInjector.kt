package com.aldemir.mvvmdagger2rxjavaretrofit.injection.component

import com.aldemir.mvvmdagger2rxjavaretrofit.injection.module.NetworkModule
import com.aldemir.mvvmdagger2rxjavaretrofit.ui.main.PostListViewModel
import com.aldemir.mvvmdagger2rxjavaretrofit.ui.main.PostViewModel
import dagger.Component
import javax.inject.Singleton

/**
 * Component providing inject() methods for presenters.
 */
@Singleton
@Component(modules = [(NetworkModule::class)])
interface ViewModelInjector {
    /**
     * Injects required dependencies into the specified PostListViewModel.
     * @param postListViewModel PostListViewModel in which to inject the dependencies
     */
    fun inject(postListViewModel: PostListViewModel)
    /**
     * Injects required dependencies into the specified PostViewModel.
     * @param postViewModel PostViewModel in which to inject the dependencies
     */
    fun inject(postViewModel: PostViewModel)

    @Component.Builder
    interface Builder {
        fun build(): ViewModelInjector

        fun networkModule(networkModule: NetworkModule): Builder
    }
}