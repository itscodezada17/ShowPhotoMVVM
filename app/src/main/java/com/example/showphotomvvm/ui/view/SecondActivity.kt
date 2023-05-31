package com.example.showphotomvvm.ui.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.showphotomvvm.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.ChangeActivity.setOnClickListener(
            View.OnClickListener {
                val i = Intent(this@SecondActivity, MainActivity::class.java)
                startActivity(i)
            }
        )
    }
}