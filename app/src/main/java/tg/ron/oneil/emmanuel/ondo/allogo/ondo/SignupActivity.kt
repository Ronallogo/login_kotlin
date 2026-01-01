package tg.ron.oneil.emmanuel.ondo.allogo.ondo

import android.os.Bundle
import android.widget.RelativeLayout
import android.widget.ScrollView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputEditText

class SignupActivity : AppCompatActivity() {

    private lateinit var  nameInput : TextInputEditText
    private lateinit var firstAxe : RelativeLayout

    private lateinit var scrollView : ScrollView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_signup)


        this.scrollView = findViewById(R.id.scrollView)
        this.firstAxe  = findViewById(R.id.first_axe)


        scrollView.viewTreeObserver.addOnScrollChangedListener {
            val scrollY = scrollView.scrollY
            val alpha = (1f - scrollY / 300f).coerceIn(0.7f, 1f)

            firstAxe.alpha = alpha
            firstAxe.elevation = scrollY.toFloat()
        }


    }
}