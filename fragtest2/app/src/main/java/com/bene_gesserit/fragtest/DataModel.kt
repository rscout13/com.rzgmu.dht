package com.bene_gesserit.fragtest

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

open class DataModel: ViewModel() {
    val message: MutableLiveData<Int> by lazy {
        MutableLiveData<Int>()
    }
    val report: MutableLiveData<Report> by lazy {
        MutableLiveData<Report>()
    }
}