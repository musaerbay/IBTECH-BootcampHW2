package com.mr.bootcampweek2

import android.animation.Animator
import android.graphics.Color
import android.os.Bundle
import android.os.Handler
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_word_test.*
import java.util.logging.Logger


class WordTestFragment : Fragment() {

    val updateHandler = Handler()
    var i: Int = 20

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        val runnable = object : Runnable {
            override fun run() {
                //
                updateProgress(i)
                updateHandler.postDelayed(this, 1000)
                i--
            }
        }

        updateHandler.post(runnable)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_word_test, container, false)
    }


    private fun updateProgress(i: Int) {
        if (i >= 0){
            ppb.progress = i
        }

        Logger.getLogger(this::class.java.simpleName).warning("I is $i")
    }

}