package com.pss.countnumberevent

import android.animation.ValueAnimator
import android.widget.TextView

class CountNumberEvent {
    companion object{

         fun countNumber(startCount: Int, endCount: Int, txtView: TextView, duration : Long) {
            val animator = ValueAnimator.ofInt(startCount, endCount)
             with(animator){
                 this.duration = duration
                 this.addUpdateListener { animation ->
                     txtView.text = animation.animatedValue.toString()
                 }
                 this.start()
             }
        }
    }
}