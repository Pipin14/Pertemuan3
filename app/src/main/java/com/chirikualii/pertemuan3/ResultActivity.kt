package com.chirikualii.pertemuan3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.chirikualii.pertemuan3.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {

    lateinit var binding : ActivityResultBinding

    var resultA = ""
    var resultB = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)

        resultA = intent.getStringExtra("teamA") ?: "teamA"
        resultB= intent.getStringExtra("teamB") ?: "teamB"

        binding.tvResultA.text = resultA
        binding.tvResultB.text = resultB


    }
}