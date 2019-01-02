package com.example.aleksandrtumanov.simpledaggerandroidexample.di

import com.example.aleksandrtumanov.simpledaggerandroidexample.MainApplication
import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(
    AndroidInjectionModule::class,
    ActivityModule::class))
interface MovieAppComponent {

    fun inject(application: MainApplication)

}