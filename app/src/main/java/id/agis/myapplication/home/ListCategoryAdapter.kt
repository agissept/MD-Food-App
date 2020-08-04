package id.agis.myapplication.home


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import id.agis.myapplication.R
import id.agis.myapplication.model.Category
import kotlinx.android.synthetic.main.category_item.view.*

class ListCategoryAdapter(private val listCategory: List<Category>) :
    RecyclerView.Adapter<ListCategoryAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.category_item, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int = listCategory.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val category = listCategory[position]
        with(holder.itemView) {
            text_view.text = category.strCategory
            Glide.with(context).load(category.strCategoryThumb).into(image_view)
        }
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

}