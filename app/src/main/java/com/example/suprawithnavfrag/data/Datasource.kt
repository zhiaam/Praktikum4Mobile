package com.example.suprawithnavfrag.data

import com.example.suprawithnavfrag.R
import com.example.suprawithnavfrag.model.SupraWithNavFragProto1

class Datasource {
    fun loadSupraWithNavFragProto1(): List<SupraWithNavFragProto1>{
        return listOf<SupraWithNavFragProto1>(
            SupraWithNavFragProto1(R.string.text1, R.drawable.beat),
            SupraWithNavFragProto1(R.string.text2, R.drawable.beatstreet),
            SupraWithNavFragProto1(R.string.text3, R.drawable.genio),
            SupraWithNavFragProto1(R.string.text4, R.drawable.scoopy),
            SupraWithNavFragProto1(R.string.text5, R.drawable.vario125),
            SupraWithNavFragProto1(R.string.text6, R.drawable.vario160),
            SupraWithNavFragProto1(R.string.text7, R.drawable.pcx),
            SupraWithNavFragProto1(R.string.text8, R.drawable.adv150),
            SupraWithNavFragProto1(R.string.text9, R.drawable.pcx),
            SupraWithNavFragProto1(R.string.text10, R.drawable.forza)
        )
    }
}