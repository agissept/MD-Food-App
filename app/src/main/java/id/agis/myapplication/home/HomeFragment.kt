package id.agis.myapplication.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import id.agis.myapplication.DataSourceFactory
import id.agis.myapplication.R
import id.agis.myapplication.home.listfood.ListFoodFragment
import kotlinx.android.synthetic.main.fragment_home.*


class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val listCategory = DataSourceFactory().getListCategory(view.context)

        view_pager.adapter = ViewPagerAdapter(childFragmentManager, listCategory)
        tab_layout.setupWithViewPager(view_pager)


        val adapter = ListCategoryAdapter(listCategory)
//        recycler_view.apply {
//            layoutManager = LinearLayoutManager(view.context, LinearLayoutManager.HORIZONTAL, false)
//            this.adapter = adapter
//        }


//        changeFragment(ListFoodFragment())

    }

    private fun changeFragment(fragment: Fragment) {
        childFragmentManager.beginTransaction().apply {
            replace(R.id.frame_layout, fragment)
            commit()
        }
    }


}