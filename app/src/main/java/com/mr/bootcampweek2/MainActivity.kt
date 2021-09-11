package com.mr.bootcampweek2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.os.Handler
import android.util.Log
import android.widget.ProgressBar
import android.widget.TextView
import androidx.fragment.app.FragmentTransaction
import kotlinx.android.synthetic.main.fragment_word_test.*
import java.util.*
import java.util.concurrent.TimeUnit
import java.util.logging.Logger


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)   // setContentView(R.layout.fragment_word_test)


        val ft: FragmentTransaction = supportFragmentManager.beginTransaction()
// Replace the contents of the container with the new fragment
        ft.replace(R.id.fragment_container, TestStartFragment())
// Complete the changes added above
        ft.commit()


    }

}










/*  init()

*   private fun init() {


        var progressStatus = 0
        val handler = Handler()

        progressBar.progress = 0


        progressBar.max = 2000


        Thread {
            while (progressStatus < 2000) {
                progressStatus += 1
                Thread.sleep(10)
                handler.post {
                    circularProgressIndicator.progress = progressStatus
                    text_progress.text = "${20 - (progressStatus / 100)}"
                }
            }
        }.start()

    }
*
* */

/*      timeOutRemoveTimer.start()

private var timeOutRemoveTimer = object : CountDownTimer(TOTAL_TIME, 10) {
        override fun onFinish() {
            circle_progress.progress = 1f
        }

        override fun onTick(millisUntilFinished: Long) {
            circle_progress.progress = (TOTAL_TIME - millisUntilFinished).toFloat() / TOTAL_TIME
        }
    }


 */




/*
    fun prog(){
        var count:Int = 0
        val timer = Timer()

        timer.schedule(object:TimerTask(){
            override fun run(){
                count++
                Prog_bar = count

                if(count>100){
                    timer.cancel()
                    finish()
                }

            }
        },0,100)
    }

*/





/*

 private fun initViews() {
        progTimer = text_progress   // Timer in progress
        progress_circle = progressBar.progress  // circle progeress

    }

    private var countDownTimer = object : CountDownTimer(1000 * 30, 1000){
        override fun onTick(milisUntilFinished: Long) {
            Log.d(TAG,"onTick: ${milisUntilFinished/1000f}")
            //update text
            progTimer?.text = getString(R.string.formatted_time,
                TimeUnit.MILLISECONDS.toMinutes(milisUntilFinished) % 60,
                TimeUnit.MILLISECONDS.toSeconds(milisUntilFinished) % 60)
        }

        override fun onFinish() {
            Log.d(TAG,"onFinish: called")
        }

        private fun startTimer(){
            countDownTimer.start()

        }

        private fun stopTimer(){
            countDownTimer.cancel()
        }

    }
*/

