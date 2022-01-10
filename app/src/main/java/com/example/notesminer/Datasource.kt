package com.example.notesminer

class Datasource {
    fun subOne(): List<BtechFourItem> {
        return listOf(
            BtechFourItem(R.string.sub20),
            BtechFourItem(R.string.sub21),
            BtechFourItem(R.string.sub22),
            BtechFourItem(R.string.sub23),
            BtechFourItem(R.string.sub24)
        )
    }
}