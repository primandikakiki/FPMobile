package com.primandika.javastore.`interface`.aksesoris

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AksesorisViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Aksesoris Fragment"
    }
    val text: LiveData<String> = _text
}