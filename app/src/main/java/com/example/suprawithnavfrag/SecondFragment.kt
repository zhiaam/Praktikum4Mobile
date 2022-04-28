package com.example.suprawithnavfrag

import ItemAdapter
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView
import com.example.suprawithnavfrag.data.Datasource

class SecondFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_second, container, false)

        val lanjutBtn : Button = view.findViewById(R.id.kembali)
        lanjutBtn.setOnClickListener{
            val fragment = FirstFragment()
            val transaction = fragmentManager?.beginTransaction()
            transaction?.replace(R.id.nav_container,fragment)?.commit()
        }
        return view

    }

    //You'll need the onViewCreated function
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //The following was taken from my previous simple recycleView project
        val myDataset = Datasource().loadSupraWithNavFragProto1()

        //error here, fragment need getView()?
        val recyclerView = getView()?.findViewById<RecyclerView>(R.id.recycler_view)
        //error here as well, said that recycleView need to yell
        //also said that this requires some context
        recyclerView!!.adapter = ItemAdapter(this.requireActivity(), myDataset)

        recyclerView.setHasFixedSize(true)
    }
}