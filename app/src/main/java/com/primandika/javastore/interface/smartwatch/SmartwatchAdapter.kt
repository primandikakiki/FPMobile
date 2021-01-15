package com.primandika.javastore.`interface`.smartwatch

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.primandika.javastore.R
import kotlinx.android.synthetic.main.smartphone_list_item.view.*
import kotlinx.android.synthetic.main.smartwatch_list_item.view.*

class SmartwatchAdapter (val smartwatchItemList: List<SmartwatchData>, val clickListener: (SmartwatchData) -> Unit) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.smartwatch_list_item, parent, false)
        return PartViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as PartViewHolder).bind(smartwatchItemList[position], clickListener)
    }

    override fun getItemCount() = smartwatchItemList.size

    class PartViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(smartwatch: SmartwatchData, clickListener: (SmartwatchData) -> Unit) {
            itemView.NamaSmartwatch.text = smartwatch.NamaSmartwatch.toString()
            itemView.PhotoSmartwatch.setImageResource(smartwatch.PhotoSmartwatch)
            itemView.setOnClickListener { clickListener(smartwatch) }
        }
    }
}