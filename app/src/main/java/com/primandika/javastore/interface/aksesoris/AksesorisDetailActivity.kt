package com.primandika.javastore.`interface`.aksesoris

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.primandika.javastore.R
import com.primandika.javastore.`interface`.aksesoris.AksesorisWebsite
import kotlinx.android.synthetic.main.aksesoris_content_detail.*
import kotlinx.android.synthetic.main.aksesoris_website.*
import kotlinx.android.synthetic.main.app_bar_main.*

class AksesorisDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.aksesoris_activity_detail)
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
        photo?.let { PhotoAksesorisDetail.setImageResource(it) }
        NamaAksesorisDetail.text = nama
        HargaAksesorisDetail.text = harga
        SpesifikasiAksesorisDetail.text = spesifikasi

        buttonWeb.setOnClickListener {
            openWeb(website)
        }
    }

    private fun openWeb(url: String) {
        val showWebActivity = Intent(this, com.primandika.javastore.`interface`.aksesoris.AksesorisWebsite::class.java)
        showWebActivity.putExtra(Intent.ACTION_WEB_SEARCH, url)
        startActivity(showWebActivity)
    }
}