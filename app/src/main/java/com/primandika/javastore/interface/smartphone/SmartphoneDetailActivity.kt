package com.primandika.javastore.`interface`.smartphone

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.primandika.javastore.R
import com.primandika.javastore.`interface`.smartphone.SmartphoneWebsite
import kotlinx.android.synthetic.main.app_bar_main.*
import kotlinx.android.synthetic.main.smartphone_content_detail.*
import kotlinx.android.synthetic.main.smartphone_website.*

class SmartphoneDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.smartphone_activity_detail)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(false)

        var intentThatStartedThisActivity = intent
        if (intentThatStartedThisActivity.hasExtra(Intent.EXTRA_COMPONENT_NAME)) {
            putData(intentThatStartedThisActivity)
        }

    }

    private fun putData(intentThatStartedThisActivity : Intent) {
        var photo = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_SPLIT_NAME)?.toInt()
        var nama = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_COMPONENT_NAME)
        var harga = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_INSTALLER_PACKAGE_NAME)
        var spesifikasi = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_EXCLUDE_COMPONENTS)
        var website = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_REFERRER_NAME).toString()
        photo?.let { PhotoSmartphoneDetail.setImageResource(it) }
        NamaSmartphoneDetail.text = nama
        HargaSmartphoneDetail.text = harga
        SpesifikasiDetail.text = spesifikasi

        buttonWeb.setOnClickListener {
            openWeb(website)
        }
    }

    private fun openWeb(url: String) {
        val showWebActivity = Intent(this, com.primandika.javastore.`interface`.smartphone.SmartphoneWebsite::class.java)
        showWebActivity.putExtra(Intent.ACTION_WEB_SEARCH, url)
        startActivity(showWebActivity)
    }
}