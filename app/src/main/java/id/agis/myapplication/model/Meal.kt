package id.agis.myapplication.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Meal(
   val strMeal: String,
   val strMealThumb: String,
   val idCategory: String,
   val idMeal: String,
   val strPrice : String
):Parcelable