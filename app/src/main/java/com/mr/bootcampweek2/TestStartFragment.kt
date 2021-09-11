package com.mr.bootcampweek2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button


class TestStartFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_test_start, container, false)

    // define a button and when the button is clicked replace will occur
        val button = view.findViewById<Button>(R.id.button_start)
        button.setOnClickListener {
            val fragmentManager = fragmentManager?.beginTransaction()
            fragmentManager?.replace(R.id.fragment_container,WordTestFragment())

            fragmentManager?.commit()
        }
        // Inflate the layout for this fragment
        return view
    }

}