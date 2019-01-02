package com.example.aleksandrtumanov.simpledaggerandroidexample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.aleksandrtumanov.simpledaggerandroidexample.databinding.ActivityMainBinding
import dagger.android.AndroidInjection
import dagger.android.DispatchingAndroidInjector
import dagger.android.support.HasSupportFragmentInjector
import javax.inject.Inject

class MainActivity : AppCompatActivity(), HasSupportFragmentInjector {
    @Inject
    lateinit var fragmentInjector: DispatchingAndroidInjector<Fragment>
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        AndroidInjection.inject(this)

        DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)    }

    override fun supportFragmentInjector() = fragmentInjector
}
