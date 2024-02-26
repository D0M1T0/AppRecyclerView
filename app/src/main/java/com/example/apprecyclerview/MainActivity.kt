package com.example.apprecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.apprecyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvandroid.layoutManager = LinearLayoutManager(applicationContext)
        binding.rvandroid.adapter = Adapter_Android(
            ListaAndroid(), applicationContext)
    }
    fun ListaAndroid (): List<Android>{
        var lista = ArrayList<Android>()
        lista.add(Android("Cup Cake", "Android 1.0", R.drawable.image1))
        lista.add(Android("Petit Four", "Android 1.1", R.drawable.image2))
        lista.add(Android("Apple Pie", "Android 1.5", R.drawable.image3))
        lista.add(Android("Donut", "Android 1.6", R.drawable.image4))
        lista.add(Android("Eclair", "Android 2.0 - 2.1", R.drawable.image5))
        lista.add(Android("Froyo", "Android 2.2 - 2.2.3", R.drawable.image6))
        lista.add(Android("GingerBread", "2.3 - 2.3.7", R.drawable.image7))
        lista.add(Android("HoneyComb", "Android 3.0 - 3.2.6", R.drawable.image8))
        lista.add(Android("Jelly Bean", "Android 4.1 - 4.3.1", R.drawable.image9))
        lista.add(Android("Marshmallow", "Android 6.0 - 6.0.1", R.drawable.image10))
        return lista
    }
}