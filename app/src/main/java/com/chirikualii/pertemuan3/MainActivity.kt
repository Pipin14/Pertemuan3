package com.chirikualii.pertemuan3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.chirikualii.pertemuan3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding

    var teamA=""

    var teamB=""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.btnStart.setOnClickListener {
            //Menghubungkan variable teamA dan teamB ke edit text
            teamA = binding.etTeamA.text.toString()
            teamB = binding.etTeamB.text.toString()

            val intent = Intent(this, MatchActivity::class.java)
            intent.putExtra("teamA", teamA)
            intent.putExtra("teamB", teamB)
            startActivity(intent)

        }
    }
}