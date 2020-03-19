package com.egloos.neuezeal.neuememo3.data

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ListViewModel : ViewModel() {
    private val memos: MutableList<MemoData> = mutableListOf()
    val memoLiveData: MutableLiveData<MutableList<MemoData>> by lazy {
        MutableLiveData<MutableList<MemoData>>().apply {
            value = memos
        }
    }

    fun addMemo(data: MemoData) {
        val tempList = memoLiveData.value
        tempList?.add(data)
        memoLiveData.value = tempList
    }
}