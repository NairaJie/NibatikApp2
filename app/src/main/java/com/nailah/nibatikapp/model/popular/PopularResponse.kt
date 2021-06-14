package com.nailah.nibatikapp.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize


data class PopularResponse(
	@SerializedName("maxPrice")
	val maxPrice: Int,

	@SerializedName("minPrice")
	val minPrice: Int,

	@SerializedName("totalHalaman")
	val totalHalaman: Int,

	@SerializedName("hasilPopular")
	val hasilPopular: List<HasilItemPopular>,

	@SerializedName("totalElement")
	val totalElement: Int

)


data class HasilItemPopular(
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
