package com.primandika.javastore.`interface`.info

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.primandika.javastore.R

class InfoFragment : Fragment() {

    private lateinit var InfoDataViewModel: InfoViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.info_fragment, container, false)
        val testData = createInfoData()
        root.findViewById<RecyclerView>(R.id.infoRV).layoutManager = LinearLayoutManager(context)
        root.findViewById<RecyclerView>(R.id.infoRV).setHasFixedSize(true)
        root.findViewById<RecyclerView>(R.id.infoRV).adapter = InfoAdapter(testData, { InfoItem: InfoData -> InfoItemClicked(InfoItem)})
        return root
    }

    private fun InfoItemClicked(InfoData: InfoData) {
        val showDetailActivity = Intent(context, InfoDetailActivity::class.java)
        showDetailActivity.putExtra(Intent.EXTRA_SPLIT_NAME, InfoData.InfoPhoto.toString())
        showDetailActivity.putExtra(Intent.EXTRA_COMPONENT_NAME, InfoData.InfoNama.toString())
        showDetailActivity.putExtra(Intent.EXTRA_EXCLUDE_COMPONENTS, InfoData.InfoDeskripsi.toString())
        startActivity(showDetailActivity)
    }


    private fun createInfoData() : List<InfoData> {
        val partList = ArrayList<InfoData>()
        partList.add(InfoData(R.drawable.kiki,
                "Primandika Hakiki",
                "Saya adalah mahasiswa jurusan Sistem Informasi di Fakultas Ilmu Komputer UPN Veteran Jawa Timur. Umur saya 20 tahun dan saya adalah seorang Gadget Enthusiast yang juga hobi bermain futsal")
        )
        return partList
    }
}