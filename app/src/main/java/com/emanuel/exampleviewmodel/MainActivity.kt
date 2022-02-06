package com.emanuel.exampleviewmodel

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.emanuel.exampleviewmodel.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val mViewModel: MainViewModel by viewModels()

        binding.buttonClick.setOnClickListener {
            mViewModel.editTexts.value = binding.editTexts.text.toString()
        }

        mViewModel.editTexts.observe(this, Observer {
            binding.textExhibition.text = it
        })

    }
}