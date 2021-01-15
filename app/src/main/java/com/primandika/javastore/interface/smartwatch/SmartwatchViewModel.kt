package com.primandika.javastore.`interface`.smartwatch

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SmartwatchViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Smartwatch Fragment"
    }
    val text: LiveData<String> = _text
}