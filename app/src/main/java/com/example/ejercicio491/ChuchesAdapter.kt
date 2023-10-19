package com.example.ejercicio491

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.example.ejercicio491.databinding.ChuchesItemBinding

class ChuchesAdapter:BaseAdapter {
     val context: Context
     val chuchesArray: ArrayList<chuches>
    constructor(context: Context, chuchesArray: ArrayList<chuches>){
        this.context = context
        this.chuchesArray = chuchesArray

    }
    override fun getCount(): Int {
        return this.chuchesArray.size
    }

    override fun getItem(p0: Int): Any {
        return p0
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getView(position: Int, p1: View?, p2: ViewGroup?): View {
        val inflator = context!!.getSystemService(
            Context.LAYOUT_INFLATER_SERVICE
        ) as LayoutInflater
        val binding = ChuchesItemBinding.inflate(inflator)
        val chuches = this.chuchesArray.get(position)

        binding.textView.setText(chuches.name)
        binding.imageView.setImageResource(chuches.icon)

        return binding.root

    }
}