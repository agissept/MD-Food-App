package id.agis.myapplication

import android.content.Context
import android.content.res.AssetManager
import com.google.gson.Gson
import id.agis.myapplication.model.Category
import id.agis.myapplication.model.ListCategory
import id.agis.myapplication.model.ListMeal
import id.agis.myapplication.model.Meal

class DataSourceFactory {

    fun getListMeal(context: Context): List<Meal> {
        val data = context.assets.readAssetsFile("meal.json")

        return Gson().fromJson(data, ListMeal::class.java) .listMeal
    }

    fun getListCategory(context: Context): List<Category> {
        val data = context.assets.readAssetsFile("category.json")

        return Gson().fromJson(data, ListCategory::class.java) .listCategory
    }

    private fun AssetManager.readAssetsFile(fileName: String): String =
        open(fileName).bufferedReader().use { it.readText() }

}
