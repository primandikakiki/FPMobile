package com.primandika.javastore.`interface`.info

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.primandika.javastore.R
import com.primandika.javastore.`interface`.smartphone.SmartphoneWebsite
import kotlinx.android.synthetic.main.app_bar_main.*
import kotlinx.android.synthetic.main.info_content_detail.*
import kotlinx.android.synthetic.main.smartphone_content_detail.*

class InfoDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.info_activity_detail)
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
        var deskripsi = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_EXCLUDE_COMPONENTS)
        var website = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_REFERRER_NAME).toString()
        photo?.let { InfoPhotoDetail.setImageResource(it) }
        InfoNamaDetail.text = nama
        InfoDeskripsiDetail.text = deskripsi
    }
}