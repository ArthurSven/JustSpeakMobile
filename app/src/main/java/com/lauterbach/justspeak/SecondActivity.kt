package com.lauterbach.justspeak

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.lauterbach.justspeak.databinding.ActivityMainBinding
import com.lauterbach.justspeak.fragments.AboutFragment
import com.lauterbach.justspeak.fragments.HomeFragment
import com.lauterbach.justspeak.fragments.LanguageFragment

class SecondActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        //Instantiating Fragments
        val firstFragment = HomeFragment()
        val secondFragment = LanguageFragment()
        val thirdFragment = AboutFragment()

        //Instantiating of bottom navigation
        val bottomNavigationView : BottomNavigationView = findViewById(R.id.bottom_nav)

        //Setting default fragment when this activity is created
        setCurrentFragment(firstFragment)

        /*setting fragments order on the bottom navigation as well
        as ensuring icon corresponds to fragment
         */
        bottomNavigationView.setOnNavigationItemSelectedListener {
            when(it.itemId) {
                R.id.home -> setCurrentFragment(firstFragment)
                R.id.languages -> setCurrentFragment(secondFragment)
                R.id.about -> setCurrentFragment(thirdFragment)
            }; true
        }
    }
    //Function to display current fragment
    private fun setCurrentFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fLayout, fragment)
            commit()
        }
    }
}