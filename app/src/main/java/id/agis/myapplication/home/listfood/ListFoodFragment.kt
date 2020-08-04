package id.agis.myapplication.home.listfood

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import id.agis.myapplication.DataSourceFactory
import id.agis.myapplication.R
import kotlinx.android.synthetic.main.fragment_list_food.*


class ListFoodFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_list_food, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val listMeal = DataSourceFactory().getListMeal(context!!)

        val adapter = ListFoodAdapter(listMeal)
        recycler_view.apply {
            layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
            this.adapter = adapter
        }
    }

}