package id.agis.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import id.agis.myapplication.home.HomeFragment
import id.agis.myapplication.home.listfood.ListFoodFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        changeFragment(HomeFragment())

        bottom_navigation_view.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.action_home -> {
                    changeFragment(HomeFragment())
                }
                R.id.action_favorite -> {
                    changeFragment(Fragment2())
                }
                R.id.action_profile -> {
                    changeFragment(ListFoodFragment())
                }
            }

            true
        }


    }




    private fun changeFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.frame_layout, fragment)
            commit()
        }
    }
}