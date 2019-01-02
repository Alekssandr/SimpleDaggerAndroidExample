package com.example.aleksandrtumanov.simpledaggerandroidexample.di.component

import com.example.aleksandrtumanov.simpledaggerandroidexample.MainApplication
import com.example.aleksandrtumanov.simpledaggerandroidexample.di.MovieActivityBinder
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(AndroidInjectionModule::class, MovieActivityBinder::class))
interface MovieAppComponent {

    fun inject(application: MainApplication)

}