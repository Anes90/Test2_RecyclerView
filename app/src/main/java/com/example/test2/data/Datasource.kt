package com.example.test2.data

import com.example.test2.R
import com.example.test2.model.TestItemModel

class Datasource (){
    fun loadTestItemModels(): List<TestItemModel>{
        val newList = mutableListOf<TestItemModel>()
            for(x in 0..99){
                newList.add(x, TestItemModel(R.drawable.android_24px, R.string.item_title, R.string.item_count, R.string.item_description))
            }
        return newList
    }
}