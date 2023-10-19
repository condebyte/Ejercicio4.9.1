package com.example.ejercicio491

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.example.ejercicio491.databinding.ChuchesItemBinding

class ChuchesAdapter:BaseAdapter {
    private val context: Context
    constructor(context: Context){
        this.context = context

    }
    override fun getCount(): Int {
        return 10
    }

    override fun getItem(p0: Int): Any {
        return p0
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        val inflator = context!!.getSystemService(
            Context.LAYOUT_INFLATER_SERVICE
        ) as LayoutInflater
        val binding = ChuchesItemBinding.inflate(inflator)

        return binding.root

    }
}