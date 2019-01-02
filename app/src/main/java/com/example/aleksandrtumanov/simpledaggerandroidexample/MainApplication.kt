package com.example.aleksandrtumanov.simpledaggerandroidexample

import android.app.Activity
import android.app.Application
import com.example.aleksandrtumanov.simpledaggerandroidexample.di.component.DaggerMovieAppComponent
import com.example.aleksandrtumanov.simpledaggerandroidexample.di.component.MovieAppComponent
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import javax.inject.Inject

class MainApplication : Application(), HasActivityInjector {

    lateinit var component: MovieAppComponent

    @Inject
    lateinit var dispatchingActivityInjector: DispatchingAndroidInjector<Activity>


    override fun onCreate() {
        super.onCreate()
        setup()
    }

    fun setup() {
        component = DaggerMovieAppComponent.create().apply {
            inject(this@MainApplication)
        }
    }

    override fun activityInjector(): AndroidInjector<Activity> {
        return dispatchingActivityInjector
    }

}