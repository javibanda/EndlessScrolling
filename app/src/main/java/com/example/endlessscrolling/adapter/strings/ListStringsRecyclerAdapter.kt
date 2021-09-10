package com.example.endlessscrolling.adapter.strings

import android.view.View
import com.example.endlessscrolling.R
import com.example.endlessscrolling.adapter.base.BaseRecyclerAdapter

class ListStringsRecyclerAdapter (
    private val itemsList: List<String>
        ): BaseRecyclerAdapter<String, ListStringsViewHolder>(itemsList){
    override fun createViewHolder(view: View, viewType: Int) = ListStringsViewHolder(view)

    override fun onBindViewHolder(holder: ListStringsViewHolder, position: Int) {
        holder.bindStrings(itemsList[position])
    }

    override fun getViewHolderLayoutId(viewType: Int) = R.layout.item_list

}