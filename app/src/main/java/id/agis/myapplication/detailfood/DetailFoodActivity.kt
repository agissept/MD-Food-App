package id.agis.myapplication.detailfood

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.bumptech.glide.Glide
import id.agis.myapplication.R
import id.agis.myapplication.model.Meal
import kotlinx.android.synthetic.main.activity_detail_food.*

class DetailFoodActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_food)

        val food = intent.getParcelableExtra<Meal>("food")
        println("aaaaaaaaaaaaa ${food?.strMealThumb}")
        with(food!!) {
            Glide.with(applicationContext).load(strMealThumb).into(image_view)
//            image_view.setImageResource(R.drawable.photo)
            tv_title.text = strMeal
        }


    }
}