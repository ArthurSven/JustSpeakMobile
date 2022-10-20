package com.lauterbach.justspeak.German

import android.icu.text.CaseMap
import android.os.Bundle
import android.system.Os.bind
import android.system.Os.close
import android.text.TextUtils.replace
import android.view.Gravity
import android.view.MenuItem
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.navigation.NavigationView
import com.lauterbach.justspeak.R
import com.lauterbach.justspeak.databinding.ActivityGermanBinding
import org.json.JSONObject


class GermanActivity : AppCompatActivity() {

    lateinit var binding: ActivityGermanBinding
    private lateinit var toggle: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGermanBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setCurrentFragment(GermanHomeFragment())

        val  drawerLayout = binding.drawerLayout
        val navView = binding.navView

        toggle = binding.menus

        toggle.setOnClickListener {
            drawerLayout.openDrawer(GravityCompat.START)
        }


        navView.setNavigationItemSelectedListener{
            when(it.itemId) {
                R.id.germanHome -> setCurrentFragment(GermanHomeFragment())
                R.id.germanGrammar -> setCurrentFragment(GermanGrammarFragment())
                R.id.germanPhrases -> setCurrentFragment(GermanPhrasesFragment())
                R.id.germanResources -> setCurrentFragment(GermanResourcesFragment())
                R.id.germanTrivia -> setCurrentFragment(GermanTriviaFragment())
            }
            true
        }
    }

   /* override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(toggle.onOptionsItemSelected(item)){
            return true
        }
        return super.onOptionsItemSelected(item)
    } */

   private fun setCurrentFragment(fragment: Fragment): Boolean {
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.germanFrame, fragment)
                .commit()
        }
       return true
    }

}