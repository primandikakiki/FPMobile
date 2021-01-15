package com.primandika.javastore.`interface`.smartphone

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SmartphoneViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Smartphone Fragment"
    }
    val text: LiveData<String> = _text
}