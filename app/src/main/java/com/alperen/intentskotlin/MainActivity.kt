package com.alperen.intentskotlin

import android.content.Intent
import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.alperen.intentskotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }

    override fun onStart() {
        super.onStart()
        binding.editText.setText("")
        //sayfa finish olduğu için bunu silmenin manası yok biliyorum
        
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onPause() {
        super.onPause()
    }

    override fun onDestroy() {
        super.onDestroy()
    }
    fun next(view:View){
        val intent = Intent(this@MainActivity,NextActivity::class.java)
        intent.putExtra("name",binding.editText.text.toString())
        //sanırım bunun yerine burada ifle kontrol edilip de dönüt de yapılabilir ya da orada değeri alırken intent? mi yazcaz?
        startActivity(intent)
        finish()
    }
}