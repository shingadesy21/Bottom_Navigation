package com.example.bottomnavigation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loadFragment(Home_Fragment())
       bottom_nav.setOnNavigationItemSelectedListener {
           when(it.itemId){
           R.id.home->
              {
                  loadFragment(Home_Fragment())
                    return@setOnNavigationItemSelectedListener true
              }
               R.id.recent->{
                   loadFragment(Recent_Fragment())
                   return@setOnNavigationItemSelectedListener true
               }
               R.id.favorites->{
                   loadFragment(Favorite_Fragment())
                   return@setOnNavigationItemSelectedListener true
               }
           }
           false
       }
       }
    private fun loadFragment(fragment: Fragment) {
        val transaction=supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fragmentcontainer,fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }





}