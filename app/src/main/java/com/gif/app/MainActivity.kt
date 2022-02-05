package com.gif.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.gif.app.databinding.ActivityMainBinding
import com.gif.app.presentation.adapter.PageAdapter
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        with(binding) {
            setContentView(root)
            viewPager.adapter = PageAdapter(this@MainActivity)
            TabLayoutMediator(tabLayout, viewPager) {
                tab, position -> tab.text = resources.getStringArray(R.array.pages_name)[position]
            }.attach()
        }

    }
}