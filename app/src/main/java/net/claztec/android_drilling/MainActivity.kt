package net.claztec.android_drilling

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    val TAG = MainActivity::class.java.name

    lateinit var textMessage: TextView
    lateinit var animFadeIn: Animation

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textMessage = findViewById(R.id.textView)
        animFadeIn = AnimationUtils.loadAnimation(applicationContext, R.anim.fade_in)

        textMessage.visibility = View.VISIBLE
        textMessage.animation = animFadeIn

        animFadeIn.setAnimationListener(object: Animation.AnimationListener {
            override fun onAnimationRepeat(p0: Animation?) {
                Log.d(TAG, "애니메이션 반복")
            }

            override fun onAnimationEnd(p0: Animation?) {
                Log.d(TAG, "애니메이션 끝")
                textMessage.visibility = View.GONE
            }

            override fun onAnimationStart(p0: Animation?) {
                Log.d(TAG, "애니메이션 시작")
            }

        })
    }
}
