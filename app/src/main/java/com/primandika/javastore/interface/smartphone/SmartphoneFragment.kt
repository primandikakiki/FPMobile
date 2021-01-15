package com.primandika.javastore.`interface`.smartphone

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.primandika.javastore.R

class SmartphoneFragment : Fragment() {

    private lateinit var SmartphoneDataViewModel: SmartphoneViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.smartphone_fragment, container, false)
        val testData = createSmartphoneData()
        root.findViewById<RecyclerView>(R.id.smartphoneRV).layoutManager = LinearLayoutManager(context)
        root.findViewById<RecyclerView>(R.id.smartphoneRV).setHasFixedSize(true)
        root.findViewById<RecyclerView>(R.id.smartphoneRV).adapter = SmartphoneAdapter(testData, { SmartphoneItem: SmartphoneData -> smartphoneItemClicked(SmartphoneItem)})
        return root
    }

    private fun smartphoneItemClicked(SmartphoneData: SmartphoneData) {
        val showDetailActivity = Intent(context, SmartphoneDetailActivity::class.java)
        showDetailActivity.putExtra(Intent.EXTRA_SPLIT_NAME, SmartphoneData.PhotoSmartphone.toString())
        showDetailActivity.putExtra(Intent.EXTRA_COMPONENT_NAME, SmartphoneData.NamaSmartphone.toString())
        showDetailActivity.putExtra(Intent.EXTRA_INSTALLER_PACKAGE_NAME, SmartphoneData.HargaSmartphone.toString())
        showDetailActivity.putExtra(Intent.EXTRA_EXCLUDE_COMPONENTS, SmartphoneData.SpesifikasiSmartphone.toString())
        showDetailActivity.putExtra(Intent.EXTRA_REFERRER_NAME, SmartphoneData.WebsiteSmartphone.toString())
        startActivity(showDetailActivity)
    }


    private fun createSmartphoneData() : List<SmartphoneData> {
        val partList = ArrayList<SmartphoneData>()
        partList.add(SmartphoneData(R.drawable.ip7_red,
            "iPhone 7+ Red",
            "Rp5.700.000",
            "Screen Retina IPS LCD 5.5 inch (1080 x 1920 px)\n" +
                    "iOS 10.0.1, upgradable to iOS 14.2\n" +
                    "Chipset Apple A10 Fusion Quad-core 2.34 GHz (16 nm)\n" +
                    "GPU PowerVR Series7XT Plus (six-core graphics)\n" +
                    "Internal 128GB, RAM 3GB\n" +
                    "Dual Camera 12 MP, f/1.8, 28mm (wide), 1/3'', PDAF, OIS + 12 MP, f/2.8, 56mm (telephoto), 1/3.6'', AF, 2x optical zoom\n" +
                    "Front Camera 7 MP, f/2.2, 32mm\n" +
                    "Battery Li-Ion 2900 mAh\n" +
                    "KONDISI FISIK : Mulus 97-98%, KONDISI MESIN : 100% SEHATT NORMALL WORL WELL 100%, ICLOUD clean aman siap masukin punya anda\n" +
                    "KELENGKAPAN APA AJA ???\n" +
                    "DOS BOOK IMEI TEMBUS SESUAI, CHARGER OEM, KABEL DATA OEM, SIM EJECTOR\n" +
                    "GARANSI TOKO 7 HARI SETELAH BARANG DITERIMA !!!",
            "https://www.tokopedia.com/javastorehp/iphone-7-plus-128gb-red")
        )

        partList.add(SmartphoneData(R.drawable.ipxr,
            "iPhone XR",
            "Rp7.100.000",
            "Screen Liquid Retina IPS LCD 6.1 inch (828 x 1792 px)\n" +
                    "iOS 12, upgradable to iOS 14.2\n" +
                    "Chipset Apple A12 Bionic Hexa-core 7nm (2x2.5GHz + 4x1.6GHz)\n" +
                    "Apple GPU (4-core graphics)\n" +
                    "Internal 64GB, RAM 3GB\n" +
                    "Back Camera 12 MP, f/1.8, 26mm (wide), 1/2.55'', 1.4µm, PDAF, OIS\n" +
                    "Front Camera 7 MP, f/2.2, 32mm\n" +
                    "Battery Li-Ion 2942 mAh\n" +
                    "KONDISI FISIK : Mulus 97-98%, KONDISI MESIN : 100% SEHATT NORMALL WORL WELL 100%, ICLOUD clean aman siap masukin punya anda\n" +
                    "KELENGKAPAN APA AJA ???\n" +
                    "DOS BOOK IMEI TEMBUS SESUAI, CHARGER OEM, KABEL DATA OEM, SIM EJECTOR\n" +
                    "GARANSI TOKO 7 HARI SETELAH BARANG DITERIMA !!!",
            "https://www.tokopedia.com/javastorehp/iphone-xr-64gb")
        )

        partList.add(SmartphoneData(R.drawable.ipx,
            "iPhone X",
            "Rp7.700.000",
            "Screen Super Retina OLED 5.8 inch (1125 x 2436 px)\n" +
                    "iOS 11.1, upgradable to iOS 14.2\n" +
                    "Chipset Apple A11 Bionic Hexa-core 2.39GHz\n" +
                    "Apple GPU (three-core graphics)\n" +
                    "Internal 256GB, RAM 3GB\n" +
                    "Dual Camera 12 MP, f/1.8, 28mm (wide) + 12 MP, f/2.4, 52mm (telephoto)\n" +
                    "Front Camera 7 MP, f/2.2, 32mm\n" +
                    "Battery Li-Ion 2716 mAh\n" +
                    "KONDISI MESIN : 100% sehat dan normal brother dan sister\n" +
                    "KELENGKAPAN APA AJA ???\n" +
                    "DOS BOOK IMEI TEMBUS SESUAI, CHARGER OEM, KABEL DATA OEM, SIM EJECTOR\n" +
                    "GARANSI TOKO 7 HARI SETELAH BARANG DITERIMA !!!",
            "https://www.tokopedia.com/javastorehp/iphone-x-256gb-original-100")
        )

        partList.add(SmartphoneData(R.drawable.ip8,
                "iPhone 8",
                "Rp5.700.000",
                "Screen Retina IPS LCD 4.7inch (750 x 1334 px)\n" +
                        "iOS 11, upgradable to iOS 14.2\n" +
                        "Chipset Apple A11 Bionic Hexa-core 2.39GHz\n" +
                        "Apple GPU (three-core graphics)\n" +
                        "Internal 256GB, RAM 3GB\n" +
                        "Back Camera 12 MP, f/1.8, 28mm (wide), PDAF, OIS\n" +
                        "Front Camera 7 MP, f/2.2, 32mm\n" +
                        "Battery Li-Ion 1821 mAh\n" +
                        "KONDISI MESIN : 100% SEHATT NORMALL WORL WELL 100%, ICLOUD clean Aman siap masukin Punya Anda\n" +
                        "KELENGKAPAN APA AJA ???\n" +
                        "DOS BOOK IMEI TEMBUS SESUAI, CHARGER OEM, KABEL DATA OEM, SIM EJECTOR\n" +
                        "GARANSI TOKO 7 HARI SETELAH BARANG DITERIMA !!!",
                "https://www.tokopedia.com/javastorehp/iphone-8-256gb")
        )

        partList.add(SmartphoneData(R.drawable.ip11pro,
                "iPhone 11 Pro",
                "Rp15.100.000",
                "Screen Super Retina XDR OLED 5.8inch (1125 x 2436 px)\n" +
                        "iOS 13, upgradable to iOS 14.2\n" +
                        "Chipset Apple A13 Bionic Hexa-core (2x2.65GHz + 4x1.8GHz)\n" +
                        "Apple GPU (4-core graphics)\n" +
                        "Internal 64GB, RAM 4GB\n" +
                        "Triple Back Camera 12 MP, f/1.8, 26mm (wide) + 12 MP, f/2.0, 52mm (telephoto) + 12 MP, f/2.4, 120˚, 13mm (ultrawide)\n" +
                        "Dual Front Camera 12 MP, f/2.2, 23mm (wide) + SL 3D, (depth/biometrics sensor)\n" +
                        "Battery Li-Ion 3046 mAh\n" +
                        "Dual sim (nano nano)\n" +
                        "Warna ready green dan gold (kofirmasi terlebih dahulu)\n" +
                        "Kondisi mulus like new, sudah tempered glass\n" +
                        "Fullset charger original handsfree original, garansi toko 1 bulan",
                "https://www.tokopedia.com/javastorehp/iphone-11-pro-64gb-dual-sim-nano-nano-fullset")
        )

        partList.add(SmartphoneData(R.drawable.xnote7,
                "Xiaomi Redmi Note 7",
                "Rp1.699.000",
                "Screen IPS LCD 6.3inch (1080 x 2340 px)\n" +
                        "Android 9.0 (Pie), planned upgrade to Android 10, MIUI 12\n" +
                        "Chipset Qualcomm SDM660 Snapdragon 660 14 nm (4x2.2GHz + 4x1.8GHz)\n" +
                        "Adreno 512\n" +
                        "Internal 32GB, RAM 3GB\n" +
                        "Dual Back Camera 48 MP, f/1.8, (wide) + 5 MP, f/2.2, (depth)\n" +
                        "Front Camera 13 MP, f/2.0, (wide)\n" +
                        "Battery Li-Po 4000 mAh\n" +
                        "Untuk fungsi 100% normal, untuk fisik 95% mulus jika ada lecet hanya pemakaian saja\n" +
                        "kelengkapan fullset, dos book charger dan kabel data",
                "https://www.tokopedia.com/javastorehp/xiaomi-redmi-note-7-3-32-fullset")
        )

        partList.add(SmartphoneData(R.drawable.xf1,
                "Xiaomi Pocophone F1",
                "Rp3.250.000",
                "Screen IPS LCD 6.18inch (1080 x 2246 px)\n" +
                        "Android 8.1 (Oreo), planned upgrade to Android 10, MIUI 12\n" +
                        "Chipset Qualcomm SDM845 Snapdragon 845 10 nm (4x2.8GHz + 4x1.8GHz)\n" +
                        "Adreno 630\n" +
                        "Internal 64GB, RAM 6GB\n" +
                        "Dual Back Camera 12 MP, f/1.9, 1/2.55'' (wide) + 5 MP, f/2.0, (depth)\n" +
                        "Front Camera 20 MP, f/2.0, (wide)\n" +
                        "Battery Li-Po 4000 mAh\n" +
                        "KELENGKAPAN : Fullset\n" +
                        "✓ KONDISI FISIK : Mulus 97-98% bekas pemakaian wajar, bukan UNIT Ex servis\n" +
                        "✓ KONDISI MESIN : 100% SEHAT\n" +
                        "✓ GARANSI : 7 hari (setelah barang di terima , meliputi Mesin dan Batrai.)\n" +
                        "Sudah lolos cek quality dari team QC",
                "https://www.tokopedia.com/javastorehp/xiaomi-pocophone-f1")
        )

        partList.add(SmartphoneData(R.drawable.xx3nfc,
                "Xiaomi Pocophone X3 NFC",
                "Rp3.750.000",
                "Screen IPS LCD 120Hz 6.67inch (1080 x 2400 px)\n" +
                        "Android 10, MIUI 12\n" +
                        "Chipset Qualcomm SM7150-AC Snapdragon 732G 8 nm (2x2.3GHz + 6x1.8GHz)\n" +
                        "Adreno 618\n" +
                        "Internal 128GB, RAM 8GB\n" +
                        "Quad Back Camera 64 MP, f/1.9, (wide) + 13 MP, f/2.2, 119˚ (ultrawide) + 2 MP, f/2.4, (macro) + 2 MP, f/2.4, (depth)\n" +
                        "Front Camera 20 MP, f/2.2, (wide)\n" +
                        "Battery Li-Po 5160 mAh\n" +
                        "WARNA : Utk ketersediaan warna mohon utk chat admin terlebih dahulu\n" +
                        "GARANSI : 7 HARI SETELAH BARAMG DITERIMA\n" +
                        "HAPPY SHOPPING !!!!",
                "https://www.tokopedia.com/javastorehp/ready-xiaomi-pocophone-x3-second-bergaransi")
        )

        partList.add(SmartphoneData(R.drawable.s10_,
                "Samsung Galaxy S10+",
                "Rp7.500.000",
                "Screen Dynamic AMOLED 6.4inch (1440 x 3040 px)\n" +
                        "Android 9.0 (Pie), upgradable to Android 11, One UI 3.0\n" +
                        "Chipset Octa-core Exynos 9820 7nm (2x2.73GHz + 2x2.31GHz + 4x1.95GHz)\n" +
                        "Mali-G76 MP12\n" +
                        "Internal 128GB, RAM 8GB\n" +
                        "Triple Back Camera 12 MP, f/1.5-2.4, 26mm (wide) + 12 MP, f/2.4, 52mm (telephoto) + 16 MP, f/2.2, 12mm (ultrawide)\n" +
                        "Dual Front Camera 10 MP, f/1.9, 26mm (wide) + 8 MP, f/2.2, 22mm (wide)\n" +
                        "Battery Li-Po 4100 mAh\n" +
                        "garansi resmi sein mulus 99% like new\n" +
                        "lengkap fullset\n" +
                        "Dos book original imei tembus, Charger fast charging original, Kabel data original, Handsfree AKG original, sim ejector",
                "https://www.tokopedia.com/javastorehp/samsung-s10-plus-fullset-garansi")
        )

        partList.add(SmartphoneData(R.drawable.note8,
                "Samsung Galaxy Note 8",
                "Rp4.750.000",
                "Screen Super AMOLED 6.3inch (1440 x 2960 px)\n" +
                        "Android 7.1.1 (Nougat), upgradable to Android 9.0 (Pie)\n" +
                        "Chipset Octa-core Exynos 8895 10nm (4x2.3GHz + 4x1.7GHz)\n" +
                        "Mali-G71 MP20\n" +
                        "Internal 64GB, RAM 6GB\n" +
                        "Dual Back Camera 12 MP, f/1.7, 26mm (wide) + 12 MP, f/2.4, 52mm (telephoto)\n" +
                        "Dual Front Camera 8 MP, f/1.7, 25mm (wide) + 2 MP (dedicated iris scanner camera)\n" +
                        "Battery Li-Ion 3300 mAh\n" +
                        "Kelengakapan fullset Original fast charging\n" +
                        "Dossbuk IMEI tembus\n" +
                        "KONDISI FISIK : Mulus 97-98% tidak ada Dent, tidak ada bekas jatuh, bekas pemakaian wajar jika ada harap dimaklumi karna UNIT Second bukan Ex servis\n" +
                        "KONDISI MESIN : 100% SEHATT NORMALL WORL WELL 100%\n" +
                        "Untuk Kondisi Kesehatan dijamin Normal 100%\n" +
                        "Sudah lolos cek quality dari team quesy kita dan dipastikan Normal",
                "https://www.tokopedia.com/javastorehp/samsung-galaxy-note-8-garansi-resmi-like-new-fullset-original")
        )

        partList.add(SmartphoneData(R.drawable.note9,
                "Samsung Galaxy Note 9",
                "Rp6.200.000",
                "Screen Super AMOLED 6.4inch (1440 x 2960 px)\n" +
                        "Android 8.1 (Oreo), upgradable to Android 10, One UI 2.5\n" +
                        "Chipset Octa-core Exynos 9810 10nm (4x2.7GHz 4x1.8GHz)\n" +
                        "Mali-G72 MP18\n" +
                        "Internal 128GB, RAM 6GB\n" +
                        "Dual Back Camera 12 MP, f/1.5-2.4, 26mm (wide) + 12 MP, f/2.4, 52mm (telephoto)\n" +
                        "Dual Front Camera 8 MP, f/1.7, 25mm (wide) + 2 MP (dedicated iris scanner camera)\n" +
                        "Battery Li-Ion 4000 mAh\n" +
                        "4G lancar tanpa kendala Siap pakai kartu gsm mana aja\n" +
                        "Untuk kondisi barang 97-98% mulus !!!\n" +
                        "Kelengakapan fullset : Charger fast charging, Kabel data, Sim ejector, Handsfree, Dossbuk IMEI tembus\n" +
                        "KONDISI FISIK : Mulus 97-98% tidak ada Dent, tidak ada bekas jatuh, bekas pemakaian wajar jika ada harap dimaklumi karna UNIT Second bukan Ex servis\n" +
                        "KONDISI MESIN : 100% SEHATT NORMALL WORL WELL 100%\n" +
                        "Untuk Kondisi Kesehatan dijamin Normal 100%\n" +
                        "Sudah lolos cek quality dari team quesy kita dan dipastikan Normal",
                "https://www.tokopedia.com/javastorehp/samsung-note-9-duos-128gb-garansi-resmi-sein")
        )

        partList.add(SmartphoneData(R.drawable.a80,
                "Samsung Galaxy  A80",
                "Rp4.700.000",
                "Screen Super AMOLED 6.7inch (1080 x 2400 px)\n" +
                        "Android 9.0 (Pie), upgradable to Android 10, One UI 2.0\n" +
                        "Chipset Octa-core Qualcomm SDM730 Snapdragon 730 8nm (2x2.2GHz + 6x1.8GHz)\n" +
                        "Adreno 618\n" +
                        "Internal 128GB, RAM 8GB\n" +
                        "Triple Back Camera 48 MP, f/2.0, 26mm (wide) + 8 MP, f/2.2, 12mm (ultrawide) + TOF 3D, f/1.2, (depth)\n" +
                        "Front Camera Motorized pop-up rotating main camera module\n" +
                        "Battery Li-Ion 3700 mAh\n" +
                        "KELENGKAPAN : Fullset\n" +
                        "✓ KONDISI FISIK : Mulus 97-98% bekas pemakaian wajar, bukan UNIT Ex servis\n" +
                        "✓ KONDISI MESIN : 100% SEHAT\n" +
                        "✓ GARANSI : 7 hari (setelah barang di terima , meliputi Mesin dan Batrai.)\n" +
                        "Sudah lolos cek quality dari team QC.\n" +
                        "Dijamin Aman 100%",
                "https://www.tokopedia.com/javastorehp/samsung-a80-fullset-garansi-resmi")
        )

        partList.add(SmartphoneData(R.drawable.oppok3,
                "Oppo K3",
                "Rp2.750.000",
                "Screen AMOLED 6.5inch (1080 x 2340 px)\n" +
                        "Android 9.0 (Pie), ColorOS 6\n" +
                        "Chipset Octa-core SDM710 Snapdragon 710 10nm (2x2.2GHz + 6x1.7Hz)\n" +
                        "Adreno 618\n" +
                        "Internal 64GB, RAM 6GB\n" +
                        "Dual Back Camera 16 MP, f/1.7, 1/2.5'' (wide) + 2 MP, f/2.4, (depth)\n" +
                        "Front Camera Motorized pop-up 16 MP, f/2.0, 26mm (wide)\n" +
                        "Battery Li-Po 3765 mAh\n" +
                        "Kondisi fisik 98% mulus tidak ada bekas jatuh tidak bekas servisan mesin\n" +
                        "Kelengkapan : dos book charger kabel data, dos book imei tembus dengan unit nya, kelengkapan original Oppo, Sudah lolos cek quality dari team QC.\n" +
                        "Garansi toko 7 hari untuk mesin dan baterai",
                "https://www.tokopedia.com/javastorehp/oppo-k3-fullset-bergaransi")
        )

        partList.add(SmartphoneData(R.drawable.opporeno3,
                "Oppo Reno 3",
                "Rp3.150.000",
                "Screen AMOLED 6.4inch (1080 x 2400 px)\n" +
                        "Android 10, ColorOS 7\n" +
                        "Chipset Octa-core Mediatek MT6779 Helio P90 12nm (2x2.2GHz + 6x2.0Hz)\n" +
                        "PowerVR GM9446\n" +
                        "Internal 128GB, RAM 8GB\n" +
                        "Quad Back Camera 48 MP, f/1.8, 26mm (wide) + 13 MP, f/2.4, 52mm (telephoto) + 8 MP, f/2.2, 13mm (ultrawide) + 2 MP B/W, f/2.4\n" +
                        "Front Camera 44 MP, f/2.4, 26mm (wide)\n" +
                        "Battery Li-Po 4025 mAh\n" +
                        "Kondisi fisik 98% mulus tidak ada bekas jatuh tidak bekas servisan mesin\n" +
                        "Kelengkapan : dos book charger kabel data, dos book imei tembus dengan unit nya, kelengkapan original Oppo, Sudah lolos cek quality dari team QC.\n" +
                        "Garansi toko 7 hari untuk mesin dan baterai",
                "https://www.tokopedia.com/javastorehp/oppo-reno-3-fullset-bergaransi-ram-8gb-internal-256gb")
        )

        partList.add(SmartphoneData(R.drawable.opporeno4,
                "Oppo Reno 4",
                "Rp4.150.000",
                "Screen OLED 6.4inch (1080 x 2400 px)\n" +
                        "Android 10, ColorOS 7.2\n" +
                        "Chipset Octa-core Qualcomm SM7125 Snapdragon 720G 8nm (2x2.3GHz + 6x1.8Hz)\n" +
                        "Adreno 618\n" +
                        "Internal 128GB, RAM 8GB\n" +
                        "Quad Back Camera 48 MP, f/1.7, 26mm (wide) + 8 MP, f/2.2, 119˚ (ultrawide) + 2 MP, f/2.4, (macro) + 2 MP, f/2.4, (depth)\n" +
                        "Front Camera 32 MP, f/2.4, 26mm (wide)\n" +
                        "Battery Li-Po 4015 mAh\n" +
                        "Kondisi fisik 98% mulus tidak ada bekas jatuh tidak bekas servisan mesin\n" +
                        "Kelengkapan : dos book charger kabel data, dos book imei tembus dengan unit nya, kelengkapan original Oppo, Sudah lolos cek quality dari team QC.\n" +
                        "Garansi toko 7 hari untuk mesin dan baterai",
                "https://www.tokopedia.com/javastorehp/oppo-reno-4-fullset-bergaransi-ram-8gb-internal-256gb")
        )

        partList.add(SmartphoneData(R.drawable.rnarzo,
                "Realme Narzo",
                "Rp2.600.000",
                "Screen IPS LCD 90Hz, 6.5inch (1080 x 2400 px)\n" +
                        "Android 10, Realme UI\n" +
                        "Chipset Octa-core Mediatek MT6785 Helio G90T 12nm (2x2.05GHz + 6x2.0Hz)\n" +
                        "Mali-G76 MC4\n" +
                        "Internal 128GB, RAM 4GB\n" +
                        "Quad Back Camera 48 MP, f/1.8, 26mm (wide) + 8 MP, f/2.3, 119˚ (ultrawide) + 2 MP, f/2.4, (macro) + 2 MP B/W, f/2.4, (depth)\n" +
                        "Front Camera 16 MP, f/2.0, 26mm (wide)\n" +
                        "Battery Li-Po 4300 mAh\n" +
                        "Kondisi second original, mulus 98-99% garansi resmi realme indonesia\n" +
                        "Kelengkapan fullset original",
                "https://www.tokopedia.com/javastorehp/realme-narzo-fullset-bergaransi-4-128")
        )

        partList.add(SmartphoneData(R.drawable.rc15,
                "Realme Narzo",
                "Rp2.050.000",
                "Screen IPS LCD 6.5inch (720 x 1600 px)\n" +
                        "Android 10, realme UI 1.0\n" +
                        "Chipset Octa-core MediaTek Helio G35 12nm (4x2.3GHz + 4x1.8Hz)\n" +
                        "PowerVR GE8320\n" +
                        "Internal 128GB, RAM 4GB\n" +
                        "Quad Back Camera 13 MP, f/2.2, (wide) + 8 MP, f/2.3, 119˚ (ultrawide) + 2 MP B/W, f/2.4 + 2 MP, f/2.4\n" +
                        "Front Camera 8 MP, f/2.0, (wide)\n" +
                        "Battery Li-Po 6000 mAh\n" +
                        "Kondisi fisik mulus 98%\n" +
                        "Kelengkapan fullset original",
                "https://www.tokopedia.com/javastorehp/realme-c15-fullset-garansi-resmi-4-128")
        )

        partList.add(SmartphoneData(R.drawable.rxt,
                "Realme XT",
                "Rp3.300.000",
                "Screen Super AMOLED 6.4inch (1080 x 2340 px)\n" +
                        "Android 9.0 (Pie), upgradable to Android 10, Realme UI\n" +
                        "Chipset Octa-core Qualcomm SDM712 Snapdragon 712 10nm (2x2.3GHz + 6x1.7GHz)\n" +
                        "Adreno 616\n" +
                        "Internal 128GB, RAM 8GB\n" +
                        "Quad Back Camera 64 MP, f/1.8, (wide) + 8 MP, f/2.3, 13mm (ultrawide) + 2 MP, f/2.4, (macro) + 2 MP, f/2.4, (depth)\n" +
                        "Front Camera 16 MP, f/2.0, 25mm (wide)\n" +
                        "Battery Li-Po 4000 mAh\n" +
                        "Lengkap fullset\n" +
                        "Kondisi mulus, Garansi resmi realme indonesia",
                "https://www.tokopedia.com/javastorehp/realme-xt-8-128-fullset-bergaransi")
        )

        partList.add(SmartphoneData(R.drawable.vz1pro,
                "Vivo Z1 Pro",
                "Rp2.800.000",
                "Screen IPS LCD 6.53inch (1080 x 2340 px)\n" +
                        "Android 9.0 (Pie), upgradable to Android 10, Funtouch OS 10\n" +
                        "Chipset Octa-core Qualcomm SDM712 Snapdragon 712 10nm (2x2.3GHz + 6x1.7GHz)\n" +
                        "Adreno 616\n" +
                        "Internal 128GB, RAM 6GB\n" +
                        "Triple Back Camera 16 MP, f/1.8, (wide) + 8 MP, f/2.2, 16mm (ultrawide) + 2 MP, f/2.4, (depth)\n" +
                        "Front Camera 32 MP, f/2.0, 26mm (wide)\n" +
                        "Battery Li-Po 5000 mAh\n" +
                        "Kondisi fisik 98% mulus tidak ada bekas jatuh tidak bekas servisan mesin\n" +
                        "Kelengkapan : dos book charger kabel data, dos book imei tembus dengan unit nya, kelengkapan original vivo\n" +
                        "Garansi toko 7 hari untuk mesin dan baterai",
                "https://www.tokopedia.com/javastorehp/vivo-z1-pro-fullset-bergaransi-ram-6gb-internal-128gb")
        )

        partList.add(SmartphoneData(R.drawable.v17pro,
                "Vivo V17 Pro",
                "Rp3.300.000",
                "Screen Super AMOLED 6.44inch (1080 x 2400 px)\n" +
                        "Android 9.0 (Pie), Funtouch 9.1\n" +
                        "Chipset Octa-core Qualcomm SDM675 Snapdragon 675 11nm (2x2.0GHz + 6x1.7GHz)\n" +
                        "Adreno 612\n" +
                        "Internal 128GB, RAM 8GB\n" +
                        "Quad Back Camera 48 MP, f/1.8, 26mm (wide) + 8 MP, f/2.2, 16mm (ultrawide) + 13 MP, (telephoto) + 2 MP, f/2.4, (depth)\n" +
                        "Dual Front Camera Motorized pop-up 32 MP, f/2.0, 26mm (wide) + Motorized pop-up 8 MP, 17mm (ultrawide)\n" +
                        "Battery Li-Po 4100 mAh\n" +
                        "Kondisi fisik 98% mulus tidak ada bekas jatuh tidak bekas servisan mesin\n" +
                        "Kelengkapan : dos book charger kabel data, dos book imei tembus dengan unit nya, kelengkapan original vivo\n" +
                        "Garansi toko 7 hari untuk mesin dan baterai",
                "https://www.tokopedia.com/javastorehp/vivo-v17-pro-fullset-garansi-resmi")
        )

        partList.add(SmartphoneData(R.drawable.v19,
                "Vivo V19",
                "Rp3.200.000",
                "Screen Super AMOLED 6.44inch (1080 x 2400 px)\n" +
                        "Android 10, Funtouch 10.0\n" +
                        "Chipset Octa-core Qualcomm SDM675 Snapdragon 675 11nm (2x2.0GHz + 6x1.7GHz)\n" +
                        "Adreno 612\n" +
                        "Internal 128GB, RAM 8GB\n" +
                        "Quad Back Camera 48 MP, f/1.8, (wide) + 8 MP, f/2.2, 13mm (ultrawide) + 2 MP, f/2.4, (macro) + 2 MP, f/2.4, (depth)\n" +
                        "Front Camera 32 MP, f/2.5, 23mm (wide)\n" +
                        "Battery Li-Po 4500 mAh\n" +
                        "LIKE NEW MULUS FULSET\n" +
                        "GARANSI RESMI VIVO MASIH ADA\n" +
                        "Garansi personal 7 hari mesin & baterai\n" +
                        "Aftersales & pelayanan servis selamanya\n" +
                        "Nota wajib ada",
                "https://www.tokopedia.com/javastorehp/vivo-v19-8-128gb-fulset-like-new")
        )

        partList.add(SmartphoneData(R.drawable.v20,
                "Vivo V20",
                "Rp4.450.000",
                "Screen AMOLED 6.44inch (1080 x 2400 px)\n" +
                        "Android 11, Funtouch 11\n" +
                        "Chipset Octa-core Qualcomm SM7125 Snapdragon 720G 8nm (2x2.3GHz + 6x1.8GHz)\n" +
                        "Adreno 618\n" +
                        "Internal 128GB, RAM 8GB\n" +
                        "Triple Back Camera 64 MP, f/1.9, 26mm (wide) + 8 MP, f/2.2, 120˚, 16mm (ultrawide) + 2 MP, f/2.4, (depth)\n" +
                        "Front Camera 44 MP, f/2.0, (wide)\n" +
                        "Battery Li-Po 4000 mAh\n" +
                        "Garansi Resmi masih jalan",
                "https://www.tokopedia.com/javastorehp/vivo-v20-second-bergaransi")
        )
        return partList
    }
}