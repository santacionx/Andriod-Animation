package com.example.animation
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.airbnb.lottie.LottieAnimationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lottieAnimationView = findViewById<LottieAnimationView>(R.id.lottieAnimationView)
        val play = findViewById<Button>(R.id.buttonplay)

        play.setOnClickListener {
            lottieAnimationView.setAnimation(R.raw.ui_anim) // Replace 'your_animation' with your file name
            lottieAnimationView.playAnimation()
        }
    }
}
