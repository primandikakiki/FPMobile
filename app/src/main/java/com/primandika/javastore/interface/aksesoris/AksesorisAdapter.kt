package com.primandika.javastore.`interface`.aksesoris

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.primandika.javastore.R
import kotlinx.android.synthetic.main.aksesoris_list_item.view.*

class AksesorisAdapter (val AksesorisItemList: List<AksesorisData>, val clickListener: (AksesorisData) -> Unit) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.aksesoris_list_item, parent, false)
        return PartViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as PartViewHolder).bind(AksesorisItemList[position], clickListener)
    }

    override fun getItemCount() = AksesorisItemList.size

    class PartViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(Aksesoris: AksesorisData, clickListener: (AksesorisData) -> Unit) {
            itemView.NamaAksesoris.text = Aksesoris.NamaAksesoris.toString()
            itemView.PhotoAksesoris.setImageResource(Aksesoris.PhotoAksesoris)
            itemView.setOnClickListener { clickListener(Aksesoris) }
        }
    }
}