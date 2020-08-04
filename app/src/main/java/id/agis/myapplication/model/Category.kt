package id.agis.myapplication.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


@Parcelize
data class Category(
    val idCategory: String,
    val strCategory: String,
    val strCategoryThumb: String

): Parcelable