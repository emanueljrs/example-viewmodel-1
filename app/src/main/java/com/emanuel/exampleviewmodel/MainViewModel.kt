package com.emanuel.exampleviewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

   var editTexts: MutableLiveData<String> = MutableLiveData<String>()

}