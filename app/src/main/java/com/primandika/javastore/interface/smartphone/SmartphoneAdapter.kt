package com.primandika.javastore.`interface`.smartphone

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.primandika.javastore.R
import kotlinx.android.synthetic.main.smartphone_list_item.view.*

class SmartphoneAdapter (val smartphoneItemList: List<SmartphoneData>, val clickListener: (SmartphoneData) -> Unit) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.smartphone_list_item, parent, false)
        return PartViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as PartViewHolder).bind(smartphoneItemList[position], clickListener)
    }

    override fun getItemCount() = smartphoneItemList.size

    class PartViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(smartphone: SmartphoneData, clickListener: (SmartphoneData) -> Unit) {
            itemView.NamaSmartphone.text = smartphone.NamaSmartphone.toString()
            itemView.PhotoSmartphone.setImageResource(smartphone.PhotoSmartphone)
            itemView.setOnClickListener { clickListener(smartphone) }
        }
    }
}