package com.example.premierleaguefixtures

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class screen1 : Fragment() {

    companion object {
        fun newInstance() = screen1()
    }

    private lateinit var adapter: MyPreviewAdapter
    private lateinit var recyclerView: RecyclerView
    private  lateinit var matchArrayList : ArrayList<MatchResult>

    private  lateinit var team1Array: Array<String>
    private  lateinit var team2Array: Array<String>
    private  lateinit var team1ScoreArray: Array<String>
    private  lateinit var team2ScoreArray: Array<String>




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater!!.inflate(R.layout.fragment_screen1, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?){
        super.onViewCreated(view, savedInstanceState)
        dataFiller()
        recyclerView = view.findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.setHasFixedSize(true)
        adapter = MyPreviewAdapter(matchArrayList)
        recyclerView.adapter = adapter

    }

    private fun dataFiller(){

        matchArrayList = arrayListOf<MatchResult>()

        team1Array = arrayOf(
            getString(R.string.team1_1),
            getString(R.string.team1_2),
            getString(R.string.team1_3),
            getString(R.string.team1_4),
            getString(R.string.team1_5),
            getString(R.string.team1_6),
        )

        team2Array = arrayOf(
            getString(R.string.team2_1),
            getString(R.string.team2_2),
            getString(R.string.team2_3),
            getString(R.string.team2_4),
            getString(R.string.team2_5),
            getString(R.string.team2_6),
        )

        team2ScoreArray = arrayOf(
            getString(R.string.teamscore2_1),
            getString(R.string.teamscore2_2),
            getString(R.string.teamscore2_3),
            getString(R.string.teamscore2_4),
            getString(R.string.teamscore2_5),
            getString(R.string.teamscore2_6),
        )

        team1ScoreArray = arrayOf(
            getString(R.string.teamscore1_1),
            getString(R.string.teamscore1_2),
            getString(R.string.teamscore1_3),
            getString(R.string.teamscore1_4),
            getString(R.string.teamscore1_5),
            getString(R.string.teamscore1_6),
        )

        for (i in team1Array.indices){
            val match = MatchResult(
                team1Array[i],
                team2Array[i],
                team1ScoreArray[i],
                team2ScoreArray[i]
            )
            matchArrayList.add(match)
        }


    }
}