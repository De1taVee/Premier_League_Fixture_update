package com.example.premierleaguefixtures

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyPreviewAdapter(private val matchRes: ArrayList<MatchResult>) :
        RecyclerView.Adapter<MyPreviewAdapter.MyViewHolder>(){
        class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
                val team1: TextView = itemView.findViewById(R.id.textView)
                val team2: TextView = itemView.findViewById(R.id.textView3)
                val res1: TextView = itemView.findViewById(R.id.textView4)
                val res2: TextView = itemView.findViewById(R.id.textView5)
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
                val itemView =
                        LayoutInflater.from(parent.context)
                                .inflate(R.layout.fragment_preview_adapter, parent, false)
                return MyViewHolder(itemView)
        }

        override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
                val currentItem = matchRes[position]
                holder.team1.text = currentItem.team1
                holder.team2.text = currentItem.team2
                holder.res1.text = currentItem.team1Score
                holder.res2.text = currentItem.team2Score
        }

        override fun getItemCount(): Int {
                return matchRes.size
        }
}
