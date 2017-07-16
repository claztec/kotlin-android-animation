package net.claztec.android_drilling

import android.animation.ObjectAnimator
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


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textMessage = findViewById(R.id.textView)


        textMessage.visibility = View.VISIBLE

        val anim: ObjectAnimator = ObjectAnimator.ofFloat(textMessage, "rotationY", 0.0F, 180.0F)
        anim.duration = 3000
        anim.start()


    }
}
