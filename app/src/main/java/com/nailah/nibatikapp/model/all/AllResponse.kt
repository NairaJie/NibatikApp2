package com.nailah.nibatikapp.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize


data class AllResponse(
    @SerializedName("maxPrice")
    val maxPrice: Int,

    @SerializedName("minPrice")
    val minPrice: Int,

    @SerializedName("totalHalaman")
    val totalHalaman: Int,

    @SerializedName("hasilAll")
    val hasilAll: List<HasilItem>,

    @SerializedName("totalElement")
    val totalElement: Int
)


data class HasilItem(
    @SerializedName("daerahBatik")
    val daerahBatik: String,

    @SerializedName("hargaRendah")
    val hargaRendah: Int,

    @SerializedName("hargaTinggi")
    val hargaTinggi: Int,

    @SerializedName("namaBatik")
    val namaBatik: String,

    @SerializedName("maknaBatik")
    val maknaBatik: String,

    @SerializedName("linkBatik")
    val linkBatik: String,

    @SerializedName("id")
    val id: Int,

    @SerializedName("hitungView")
    val hitungView: Int,
)
