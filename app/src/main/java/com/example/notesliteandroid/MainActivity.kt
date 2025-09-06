package com.example.notesliteandroid


import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.notesliteandroid.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val tag = "Day1"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Log.d(tag, "onCreate")

        // Simple RecyclerView placeholder (no Adapter yet)
        binding.rvNotes.layoutManager = LinearLayoutManager(this)

        binding.btnAdd.setOnClickListener {
            val text = binding.etNote.text.toString().trim()
            if (text.isEmpty()) {
                Toast.makeText(this, "Enter text", Toast.LENGTH_SHORT).show()
            } else {
                // For now just clear and show toast
                binding.etNote.text?.clear()
                Toast.makeText(this, "Saved: $text", Toast.LENGTH_SHORT).show()
                Log.d(tag, "Added note: $text")
            }
        }
    }

    override fun onStart() {
        super.onStart(); Log.d(tag, "onStart")
    }

    override fun onResume() {
        super.onResume(); Log.d(tag, "onResume")
    }

    override fun onPause() {
        super.onPause(); Log.d(tag, "onPause")
    }

    override fun onStop() {
        super.onStop(); Log.d(tag, "onStop")
    }

    override fun onDestroy() {
        super.onDestroy(); Log.d(tag, "onDestroy")
    }
}
