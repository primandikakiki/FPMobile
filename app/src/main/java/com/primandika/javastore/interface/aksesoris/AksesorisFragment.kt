package com.primandika.javastore.`interface`.aksesoris

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.primandika.javastore.R

class AksesorisFragment : Fragment() {

    private lateinit var AksesorisViewModel: AksesorisViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {
        val root = inflater.inflate(R.layout.aksesoris_fragment, container, false)
        val testData = createAksesorisData()
        root.findViewById<RecyclerView>(R.id.aksesorisRV).layoutManager = LinearLayoutManager(context)
        root.findViewById<RecyclerView>(R.id.aksesorisRV).setHasFixedSize(true)
        root.findViewById<RecyclerView>(R.id.aksesorisRV).adapter = AksesorisAdapter(testData, { AksesorisItem: AksesorisData ->AksesorisItemClicked(AksesorisItem)})
        return root
    }

    private fun AksesorisItemClicked(AksesorisData: AksesorisData) {
        val showDetailActivity = Intent(context, AksesorisDetailActivity::class.java)
        showDetailActivity.putExtra(Intent.EXTRA_SPLIT_NAME, AksesorisData.PhotoAksesoris.toString())
        showDetailActivity.putExtra(Intent.EXTRA_COMPONENT_NAME, AksesorisData.NamaAksesoris.toString())
        showDetailActivity.putExtra(Intent.EXTRA_INSTALLER_PACKAGE_NAME, AksesorisData.HargaAksesoris.toString())
        showDetailActivity.putExtra(Intent.EXTRA_EXCLUDE_COMPONENTS, AksesorisData.SpesifikasiAksesoris.toString())
        showDetailActivity.putExtra(Intent.EXTRA_REFERRER_NAME, AksesorisData.WebsiteAksesoris.toString())
        startActivity(showDetailActivity)
    }


    private fun createAksesorisData() : List<AksesorisData> {
        val partList = ArrayList<AksesorisData>()
        partList.add(AksesorisData(R.drawable.typec,
        "Kabel Data Type-C",
        "Rp30.000",
        "Kabel data type-c original Sony, bisa untuk Samsung, Xiaomi, Huawei, HTC, dll.\n" +
                "Bisa untuk merk lain\n" +
                "Support fast charging\n" +
                "Loss pack tanpa packing",
        "https://www.tokopedia.com/javastorehp/kabel-data-type-c-original-sony-bisa-untuk-samsung-xiaomi-huawei-htc")
        )

        partList.add(AksesorisData(R.drawable.lightningearpod,
        "Handsfree iPhone 7 / Earpod Lightning Jack with Box",
        "Rp190.000",
        "Handsfree iPhone 7 Original\n" +
                "Bisa digunakan Untuk Iphone 7 / 7+ / 8 / 8+ / X / X\n" +
                "Di Jamin Original Tidak perlu Menggunakan Bluetooth Untuk Menggunakan",
        "https://www.tokopedia.com/javastorehp/handsfree-iphone-7-earpod-lightning-jack-with-box")
        )

        partList.add(AksesorisData(R.drawable.jackearpod,
        "Handsfree iPhone 5 / Earpod 3.5mm Jack with Box",
        "Rp100.000",
        "Kompatibel Dengan :\n" +
                "iPhone : Semua jenis iPhone\n" +
                "iPad : Semua jenis iPad (Tidak semua model iPad support fitur Volume Up / Down)\n" +
                "iPod : Semua jenis iPod\n" +
                "\n" +
                "Deskripsi barang :\n" +
                "1. Kompatibel dengan handset lain yang memiliki jack 3,5mm\n" +
                "2. Suara oke dan detail\n" +
                "3. Jaring terbuat dari kawat\n" +
                "4. Tulisan pada mic sangat rapih",
        "https://www.tokopedia.com/javastorehp/handsfree-iphone-5-earpod-3-5mm-jack-with-box")
        )

        partList.add(AksesorisData(R.drawable.adaptorip,
        "Adaptor Charger Set iPhone Original",
        "Rp185.000",
        "Charger Iphone 7 Keatas Original 100%\n" +
                "model : A1400\n" +
                "Input:100-240v\n" +
                "50-60HZ\n" +
                "0,15A\n" +
                "Output:5V 1A\n" +
                "Kabel USB: Lightning Type 1 Meter\n" +
                "HARGA DIATAS SUDAH TERMASUK ADAPTOR CHARGER DAN KABEL DATA\n" +
                "JADI ANDA DAPAT 1 set\n" +
                "Barang sudah tested menggunakan special tools bosku jadi bukan hanya sededar omong original tapi kita sudah test !!",
        "https://www.tokopedia.com/javastorehp/adaptor-charger-set-iphone-original-100")
        )

        partList.add(AksesorisData(R.drawable.kabelip,
        "Kabel Data iPhone 7 Original",
        "Rp85.000",
        "1. Support utk semua Apple Products yang memakai Lightning Port 8pin (iphone 5/phone6/iphone 7 / ipad mini)\n" +
                "2. Support Synch iTunes, Sync Data, Charging\n" +
                "3. Sangat disarankan sebagai pengganti kabel data Iphone anda yang sudah rusak, atau sebagai kabel cadangan untuk berpergian atau powerbank anda",
        "https://www.tokopedia.com/javastorehp/kabel-data-iphone-7-original-100")
        )

        partList.add(AksesorisData(R.drawable.microusb,
        "Kabel Data Original Samsung Micro USB",
        "Rp27.500",
        "Kabel data Samsung Micro USB original\n" +
                "Bisa juga dipakai untuk merk Xiaomi, Sony, Huawei, dll\n" +
                "Warna putih\n" +
                "Loss pack tanpa packing\n" +
                "Support fast charging kalau adaptornya fast gan",
        "https://www.tokopedia.com/javastorehp/kabel-data-original-samsung-micro-usb-bisa-xiaomi-sony-huawei")
        )

        return partList
    }
}