package com.example.aleksandrtumanov.simpledaggerandroidexample.di

import android.app.Activity
import com.example.aleksandrtumanov.simpledaggerandroidexample.MainActivity
import com.example.aleksandrtumanov.simpledaggerandroidexample.di.component.MovieActivityComponent
import dagger.Binds
import dagger.Module
import dagger.android.AndroidInjector
import dagger.multibindings.ClassKey
import dagger.multibindings.IntoMap

@Module(subcomponents = arrayOf(MovieActivityComponent::class))
internal abstract class MovieActivityBinder {

    @Binds
    @IntoMap
    @ClassKey(MainActivity::class)
    internal abstract fun bindMainActivityInjectorFactory(builder: MovieActivityComponent.Builder):
            AndroidInjector.Factory<out Activity>
}