package com.example.ejercicio491

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ejercicio491.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    private var chuchesArray = arrayListOf<chuches>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setData()


    }

    fun setData(){





        chuchesArray.add(chuches("caramelos 1",R.drawable.ic_launcher_background))
        chuchesArray.add(chuches("caramelos 2",R.drawable.ic_launcher_background))
        chuchesArray.add(chuches("caramelos 3",R.drawable.ic_launcher_background))
        chuchesArray.add(chuches("caramelos 4",R.drawable.ic_launcher_background))
        chuchesArray.add(chuches("caramelos 5",R.drawable.ic_launcher_background))
        chuchesArray.add(chuches("caramelos 6",R.drawable.ic_launcher_background))
        chuchesArray.add(chuches("caramelos 7",R.drawable.ic_launcher_background))

        binding.ListChuches.adapter = ChuchesAdapter(this,chuchesArray)

    }
}