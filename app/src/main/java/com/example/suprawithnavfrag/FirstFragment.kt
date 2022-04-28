package com.example.suprawithnavfrag

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

class FirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_first, container, false)
        val lanjutBtn : Button = view.findViewById(R.id.lanjut)
        lanjutBtn.setOnClickListener{
            val fragment = SecondFragment()
            val transaction = fragmentManager?.beginTransaction()
            transaction?.replace(R.id.nav_container,fragment)?.commit()
        }
        return view
    }



}