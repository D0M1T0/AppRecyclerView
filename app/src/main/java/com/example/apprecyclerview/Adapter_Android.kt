package com.example.apprecyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.apprecyclerview.databinding.ActivityMainBinding
import com.example.apprecyclerview.databinding.AndroidItemBinding
import kotlin.coroutines.coroutineContext

class Adapter_Android (val ListaAndroid:List<Android>, val context:Context)
    : RecyclerView.Adapter<Adapter_Android.ViewHolder>() {
    inner class ViewHolder(val binding: AndroidItemBinding)
        :RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = AndroidItemBinding
            .inflate(LayoutInflater.from(parent.context),parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount() = ListaAndroid.size
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        with(holder){
            with(ListaAndroid[position]){
                binding.tvnomversion.text = nombre
                binding.tvnumversion.text = version
                binding.ivandroid.setImageResource(img)
                binding.cvandroid.setOnClickListener(View.OnClickListener {
                    Toast.makeText(context, "Click Item Android $nombre",
                        Toast.LENGTH_LONG).show()
                })
            }
        }
    }

}