package com.lauterbach.justspeak.German.GermanGrammar.Nouns

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.lauterbach.justspeak.R
import com.lauterbach.justspeak.adapters.GermanAdapters.GermanFoodAdapter
import com.lauterbach.justspeak.data.GermanData.GermanPeopleNounData

class GermanFoodNoun : AppCompatActivity() {

    lateinit var essenList: ArrayList<GermanPeopleNounData>
    lateinit var gerEssen: Array<String>
    lateinit var engFood: Array<String>
    lateinit var adapter: GermanFoodAdapter
    lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_noun_food_german)

        displayGermanFood()

        val adapter = GermanFoodAdapter(essenList)
        recyclerView = findViewById(R.id.GermanFoodRecycler)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)
    }

    fun displayGermanFood() {

        essenList = arrayListOf<GermanPeopleNounData>()

        gerEssen = arrayOf(
            getString(R.string.gerFood1),
            getString(R.string.gerFood2),
            getString(R.string.gerFood3),
            getString(R.string.gerFood4),
            getString(R.string.gerFood5),
            getString(R.string.gerFood6),
            getString(R.string.gerFood7),
            getString(R.string.gerFood8),
            getString(R.string.gerFood9),
            getString(R.string.gerFood10),
            getString(R.string.gerFood11),
            getString(R.string.gerFood12),
            getString(R.string.gerFood13),
            getString(R.string.gerFood14),
            getString(R.string.gerFood15),
            getString(R.string.gerFood16),
            getString(R.string.gerFood17),
            getString(R.string.gerFood18),
            getString(R.string.gerFood19),
            getString(R.string.gerFood20),
            getString(R.string.gerFood21),
            getString(R.string.gerFood22),
            getString(R.string.gerFood23),
            getString(R.string.gerFood24),
            getString(R.string.gerFood25),
            getString(R.string.gerFood26)
        )

        engFood = arrayOf(
            getString(R.string.engFood1),
            getString(R.string.engFood2),
            getString(R.string.engFood3),
            getString(R.string.engFood4),
            getString(R.string.engFood5),
            getString(R.string.engFood6),
            getString(R.string.engFood7),
            getString(R.string.engFood8),
            getString(R.string.engFood9),
            getString(R.string.engFood10),
            getString(R.string.engFood11),
            getString(R.string.engFood12),
            getString(R.string.engFood13),
            getString(R.string.engFood14),
            getString(R.string.engFood15),
            getString(R.string.engFood16),
            getString(R.string.engFood17),
            getString(R.string.engFood18),
            getString(R.string.engFood19),
            getString(R.string.engFood20),
            getString(R.string.engFood21),
            getString(R.string.engFood22),
            getString(R.string.engFood23),
            getString(R.string.engFood24),
            getString(R.string.engFood25),
            getString(R.string.engFood26)
            )
        for (i in gerEssen.indices) {
            val essen = GermanPeopleNounData(
                gerEssen[i], engFood[i]
            )
            essenList.add(essen)
        }
    }
}