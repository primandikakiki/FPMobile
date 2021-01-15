package com.primandika.javastore.`interface`.smartwatch

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.primandika.javastore.R

class SmartwatchFragment : Fragment() {

    private lateinit var SmartwatchDataViewModel: SmartwatchViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.smartwatch_fragment, container, false)
        val testData = createSmartwatchData()
        root.findViewById<RecyclerView>(R.id.smartwatchRV).layoutManager = LinearLayoutManager(context)
        root.findViewById<RecyclerView>(R.id.smartwatchRV).setHasFixedSize(true)
        root.findViewById<RecyclerView>(R.id.smartwatchRV).adapter = SmartwatchAdapter(testData, { SmartwatchItem: SmartwatchData -> smartwatchItemClicked(SmartwatchItem)})
        return root
    }

    private fun smartwatchItemClicked(SmartwatchData: SmartwatchData) {
        val showDetailActivity = Intent(context, SmartwatchDetailActivity::class.java)
        showDetailActivity.putExtra(Intent.EXTRA_SPLIT_NAME, SmartwatchData.PhotoSmartwatch.toString())
        showDetailActivity.putExtra(Intent.EXTRA_COMPONENT_NAME, SmartwatchData.NamaSmartwatch.toString())
        showDetailActivity.putExtra(Intent.EXTRA_INSTALLER_PACKAGE_NAME, SmartwatchData.HargaSmartwatch.toString())
        showDetailActivity.putExtra(Intent.EXTRA_EXCLUDE_COMPONENTS, SmartwatchData.SpesifikasiSmartwatch.toString())
        showDetailActivity.putExtra(Intent.EXTRA_REFERRER_NAME, SmartwatchData.WebsiteSmartwatch.toString())
        startActivity(showDetailActivity)
    }


    private fun createSmartwatchData() : List<SmartwatchData> {
        val partList = ArrayList<SmartwatchData>()
        partList.add(SmartwatchData(R.drawable.watch2,
                "Apple Watch 2 42mm",
                "Rp2.750.000",
                "Screen AMOLED 1.65 inch (390 x 312 px)\n" +
                        "watchOS\n" +
                        "Chipset Apple S2 Dual Core 0.78 Ghz\n" +
                        "Internal 8GB, RAM 512MB\n" +
                        "Battery 334 mAh\n" +
                        "Waterproof, Sleeptracker, GPS built-in, Pedometer, Heart rate monitor\n" +
                        "Kelengkapan unit dan charger\n",
                "https://www.tokopedia.com/javastorehp/apple-watch-2-42mm")
        )

        partList.add(SmartwatchData(R.drawable.amazfit,
        "Smartwatch Amazfit Bip",
        "Rp950.000",
        "Screen Transflective, 1.28”, 176x176 pixels 2.5D Corning gorilla glass\n" +
                        "Chipset Mediatek\n" +
                        "Battery 200 mAh\n" +
                        "IP68 Water resist, GPS + GLONASS, heart rate sensor, acceleration sensor, geomagnetic sensor, barometric pressure sensor",
        "https://www.tokopedia.com/javastorehp/amazfit")
        )

        partList.add(SmartwatchData(R.drawable.galaxywatch,
        "Samsung Galaxy Watch 42mm",
        "Rp2.350.000",
        "Screen Circular Super AMOLED Display 1.2 Inch\n" +
                        "Tizen Based Wearable OS 4.0\n" +
                        "Chipset Exynos 9110 Dual core 1.15GHz\n" +
                        "Internal 4GB, RAM 768MB\n" +
                        "Battery 270 mAh\n" +
                        "Durability : 5 ATM + IP68 / MIL-STD-810G, heart rate sensor, sleeptracking, activities tracking\n" +
                        "Second original Like new 99%\n" +
                        "Garansi resmi sein\n" +
                        "Kelengkapan fullset\n" +
                        "Mesin normal jaya 100%",
        "https://www.tokopedia.com/javastorehp/samsung-galaxy-watch-42mm")
        )

        partList.add(SmartwatchData(R.drawable.zte,
        "ZTE Smartwatch",
        "Rp1.212.000",
        "Screen OLED 1.4 Inch\n" +
                        "OS Android Wear\n" +
                        "Chipset Qualcomm Snapdragon W2100\n" +
                        "Internal 4GB, RAM 768MB\n" +
                        "Battery 500mAh\n" +
                        "IP: IP67 Waterproof Level, data cellular standalone, built-in speaker\n" +
                        "Kondisi mulus original second, 98% ga ada dent\n" +
                        "Lecet halus ada tapi minim dijamin masih buagus\n" +
                        "Kelengkapan Unit + Cas\n" +
                        "Kondisi normal tidak ada minus\n" +
                        "Garansi toko 7 hari",
        "https://www.tokopedia.com/javastorehp/zte-smartwatch")
        )

        partList.add(SmartwatchData(R.drawable.gears2,
        "Samsung Gear S2",
        "Rp1.270.000",
        "Screen AMOLED 1.2 Inch\n" +
                        "Tizen Based Wearable OS\n" +
                        "Chipset Exynos Dual Core 1GHz\n" +
                        "Internal 4GB, RAM 512MB\n" +
                        "Battery 250mAh\n" +
                        "IP: IP68 Waterproof Level, WiFi, Bluetooth, NFC, heart rate sensor\n" +
                        "Kondisi Fisik mulus 98-99% no dent hanya lecet halus karna pemakaian\n" +
                        "Mesin jormal jaya 100% no kendala sama sekali baterai pun masih sehat gan\n" +
                        "Kelengkapan jam dan charger saja",
        "https://www.tokopedia.com/javastorehp/samsung-gear-s2-original")
        )

        return partList
    }
}