package id.agis.myapplication.home.listfood

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import id.agis.myapplication.model.Meal
import id.agis.myapplication.R
import id.agis.myapplication.detailfood.DetailFoodActivity
import kotlinx.android.synthetic.main.food_item.view.*

class ListFoodAdapter(private val listMeal: List<Meal>) :
    RecyclerView.Adapter<ListFoodAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.food_item, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int = listMeal.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val meal = listMeal[position]
        with(holder.itemView) {
            text_view.text = meal.strMeal
            tv_price.text = meal.strPrice
            Glide.with(context).load(meal.strMealThumb).apply(RequestOptions().override(1000, 600))
                .into(image_view)

            setOnClickListener {
                val intent = Intent(it.context, DetailFoodActivity::class.java)
                intent.putExtra("food", meal)
                it.context.startActivity(intent)
            }
        }
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

}