package com.rizkyarifnur.dicodingandroidbeginner.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

open class BaseRecyclerAdapter<T>(private val resourceItem: Int) :
    RecyclerView.Adapter<BaseRecyclerAdapter<T>.ViewHolder>() {
    protected var items: ArrayList<T> = arrayListOf()
    override fun getItemCount(): Int {
        return items.size
    }

    fun setItem(items: ArrayList<T>) {
        this.items = items
        notifyDataSetChanged()
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        onBindView(holder.itemView, position, holder)
    }

    open fun onBindView(holderView: View, position: Int, holder: ViewHolder) {
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(viewGroup.context).inflate(resourceItem, viewGroup, false)
        return ViewHolder(view)
    }

    open inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

}

open class BaseRecyclerOnClickAdapter<T>(resourceItem: Int, private val onItemClick: (T) -> Unit = {}) :
    BaseRecyclerAdapter<T>(resourceItem) {
    override fun onBindView(holderView: View, position: Int, holder: ViewHolder) {
        super.onBindView(holderView, position, holder)
        holderView.setOnClickListener {
            onItemClick(items[position])
        }
    }
}


