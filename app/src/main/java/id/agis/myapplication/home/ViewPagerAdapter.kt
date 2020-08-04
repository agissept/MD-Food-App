package id.agis.myapplication.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import id.agis.myapplication.home.listfood.ListFoodFragment
import id.agis.myapplication.model.Category

class ViewPagerAdapter(
    fragmentManager: FragmentManager,
    private val listCategory: List<Category>
) : FragmentStatePagerAdapter(fragmentManager, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {
    override fun getItem(position: Int): Fragment {
        val fragment = ListFoodFragment()
        fragment.arguments = Bundle().apply {
            putParcelable("category", listCategory[position])
        }
        return fragment
    }

    override fun getCount(): Int = listCategory.size

    override fun getPageTitle(position: Int): CharSequence? = listCategory[position].strCategory

}