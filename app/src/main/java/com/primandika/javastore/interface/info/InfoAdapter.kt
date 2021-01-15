package com.primandika.javastore.`interface`.info

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.primandika.javastore.R
import kotlinx.android.synthetic.main.info_content_detail.view.*
import kotlinx.android.synthetic.main.info_list_item.view.*
import kotlinx.android.synthetic.main.smartphone_list_item.view.*

class InfoAdapter (val InfoItemList: List<InfoData>, val clickListener: (InfoData) -> Unit) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.info_list_item, parent, false)
        return PartViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as PartViewHolder).bind(InfoItemList[position], clickListener)
    }

    override fun getItemCount() = InfoItemList.size

    class PartViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(info: InfoData, clickListener: (InfoData) -> Unit) {
            itemView.InfoNama.text = info.InfoNama.toString()
            itemView.InfoPhoto.setImageResource(info.InfoPhoto)
            itemView.setOnClickListener { clickListener(info) }
        }
    }
}