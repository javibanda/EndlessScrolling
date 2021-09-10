package com.example.endlessscrolling.adapter.strings

import android.view.View
import android.widget.TextView
import com.example.endlessscrolling.R
import com.example.endlessscrolling.adapter.base.BaseViewHolder

class ListStringsViewHolder(itemView: View) : BaseViewHolder(itemView) {
    private val number = itemView.findViewById<TextView>(R.id.textView)
    fun bindStrings(string: String){
        number.text = string
    }
}