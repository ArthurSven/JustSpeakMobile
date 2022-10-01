package com.lauterbach.justspeak.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.HorizontalScrollView
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.lauterbach.justspeak.R
import com.lauterbach.justspeak.adapters.LanguageAdapter
import com.lauterbach.justspeak.data.LanguageData

class HomeFragment : Fragment() {
    private lateinit var adapter: LanguageAdapter
    private lateinit var recyclerView: RecyclerView
    private lateinit var languageList: ArrayList<LanguageData>

    private lateinit var imageId: Array<Int>
    private lateinit var textId: Array<String>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init()
        val layoutManager = LinearLayoutManager(context, RecyclerView.HORIZONTAL, false)
        recyclerView = view.findViewById(R.id.homeRecycler)
        recyclerView.layoutManager = layoutManager
        recyclerView.setHasFixedSize(true)
        adapter = LanguageAdapter(languageList)
        recyclerView.adapter = adapter
    }

    private fun init() {
        languageList = arrayListOf<LanguageData>()

        imageId = arrayOf(
            R.drawable.mwi,
            R.drawable.fra,
            R.drawable.ger
        )

        textId = arrayOf(
            getString(R.string.chichewa),
            getString(R.string.french),
            getString(R.string.german)

        )
        for (i in imageId.indices) {
            val speaking = LanguageData(imageId[i], textId[i])
            languageList.add(speaking)
        }
    }


}