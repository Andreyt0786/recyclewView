package ru.netology.statsview

import android.animation.ObjectAnimator
import android.animation.PropertyValuesHolder
import android.os.Bundle
import android.view.View
import android.view.animation.BounceInterpolator
import android.view.animation.LinearInterpolator
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import kotlinx.coroutines.delay
import ru.netology.statsview.ui.statsview.StatsView
import ru.netology.statsview.ui.theme.StatsViewTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val view = findViewById<StatsView>(R.id.statView)
        view.postDelayed({
            view.data = listOf(
                500F,
                500F,
                500F,
                500F,
            )
        }, 500)
    }
}


      /*  ObjectAnimator.ofFloat(view, View.ALPHA, 0.25F, 1F).apply {
            startDelay = 500
            duration = 300
            interpolator = BounceInterpolator()
        }.start()*/

   /*  val rotation = PropertyValuesHolder.ofFloat(View.ROTATION, 90F, 360F)
        val alpha = PropertyValuesHolder.ofFloat(View.ALPHA, 0F, 1F)
       ObjectAnimator.ofPropertyValuesHolder(view, alpha)
            .apply {
                startDelay = 1500
                duration = 700
               interpolator = LinearInterpolator()
            }.start()*/

            /*  view.animate()
                  .rotation(360F)
                  //.scaleX(1.2F)
                  //.scaleY(1.2F)
                  .setInterpolator(LinearInterpolator())
                  .setStartDelay(500)
                  .setDuration(2000)
                  .start()
    }
}*/

//        val alpha = ObjectAnimator.ofFloat(view, View.ALPHA, 0.25F, 1F).apply {
//            duration = 300
//            interpolator = LinearInterpolator()
//        }
//        val scaleX = PropertyValuesHolder.ofFloat(View.SCALE_X, 0F, 1F)
//        val scaleY = PropertyValuesHolder.ofFloat(View.SCALE_Y, 0F, 1F)
//        val scale = ObjectAnimator.ofPropertyValuesHolder(view, scaleX, scaleY).apply {
//            duration = 300
//            interpolator = BounceInterpolator()
//        }
//        AnimatorSet().apply {
//            startDelay = 500
//            playSequentially(scale, alpha)
//        }.start()