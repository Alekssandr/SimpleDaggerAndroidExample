package com.example.aleksandrtumanov.simpledaggerandroidexample.di.component

import com.example.aleksandrtumanov.simpledaggerandroidexample.di.scopes.ActivityScope
import com.example.aleksandrtumanov.simpledaggerandroidexample.MainActivity
import com.example.aleksandrtumanov.simpledaggerandroidexample.di.ActivityModule
import dagger.Subcomponent
import dagger.android.AndroidInjector

@ActivityScope
@Subcomponent(modules = arrayOf(ActivityModule::class))
interface MovieActivityComponent : AndroidInjector<MainActivity> {

    @Subcomponent.Builder
    abstract class Builder : AndroidInjector.Builder<MainActivity>()

}