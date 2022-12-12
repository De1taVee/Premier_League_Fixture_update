package com.example.premierleaguefixtures

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class screen1 : Fragment() {

    companion object {
        fun newInstance() = screen1()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View =inflater!!.inflate(R.layout.fragment_screen1, container, false)
        return view
    }
}