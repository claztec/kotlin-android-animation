package net.claztec.android_drilling

import android.animation.Animator
import android.animation.AnimatorInflater
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.view.animation.AnimationSet
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    val TAG = MainActivity::class.java.name

    lateinit var dayViewButton: Button
    lateinit var nightViewButton: Button
    lateinit var sunImage: ImageView
    lateinit var moonImage: ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        dayViewButton = findViewById(R.id.day)
        nightViewButton = findViewById(R.id.night)
        sunImage = findViewById(R.id.sun)
        moonImage = findViewById(R.id.moon)

        dayViewButton.setOnClickListener {
            sunImage.visibility = View.VISIBLE
            val sunRise: Animator? = AnimatorInflater.loadAnimator(applicationContext, R.animator.sun_swing)
            sunRise?.setTarget(sunImage)
            sunRise?.start()
            moonImage.visibility = View.VISIBLE
            val moonFail: Animator? = AnimatorInflater.loadAnimator(applicationContext, R.animator.moon_swing_away)
            moonFail?.setTarget(moonImage)
            moonFail?.start()
        }




    }
}
