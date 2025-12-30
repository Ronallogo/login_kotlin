package tg.ron.oneil.emmanuel.ondo.allogo.ondo

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {


    private var ERROR_EMPTY_VALUE = "champs obligatoire"
    private var ERROR_ : String = ""

    private lateinit var usernameInput : TextInputEditText
    private lateinit var passwordInput : TextInputEditText
    private lateinit var  linkSignup : TextView
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        this.usernameInput = findViewById(R.id.username_input)
        this.passwordInput = findViewById(R.id.password_input)
        this.linkSignup = findViewById(R.id.signup_link)

 

        setContentView(R.layout.activity_main)

    }


    private fun checkInput(){
        this.usernameInput.error = when{
            this.usernameInput.text?.isEmpty()  == true -> ERROR_EMPTY_VALUE
            else -> null
        } as CharSequence?
    }
}