 package com.alperen.intentskotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.alperen.intentskotlin.databinding.ActivityNextBinding

 class NextActivity : AppCompatActivity() {
    private lateinit var binding: ActivityNextBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityNextBinding.inflate(layoutInflater)
        val view=binding.root
        setContentView(view)
        val intentFromMain= intent
        //getintent desen de çalışır
        val name= intentFromMain.getStringExtra("name")
        binding.nameText.text= "name:$name"
    }
}