package tg.ron.oneil.emmanuel.ondo.allogo.ondo

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {


    private var ERROR_EMPTY_VALUE = "champs obligatoire"
    private var ERROR_LENGTH : String = "champs trop court"

    private var SHORT_PASSWORD : String = "Mot de passe trop court"

    private lateinit var usernameInput : TextInputEditText
    private lateinit var passwordInput : TextInputEditText
    private lateinit var  btn : MaterialButton
    private lateinit var  linkSignup : TextView
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.usernameInput = findViewById(R.id.username_input)
        this.passwordInput = findViewById(R.id.password_input)
        this.linkSignup = findViewById(R.id.signup_link)
        this.btn = findViewById(R.id.btn)


 

        this.btn.setOnClickListener {
            this.checkInput()
        }

        this.linkSignup.setOnClickListener {
            val intent = Intent(this, SignupActivity::class.java)
            startActivity(intent)
        }





    }


    private fun checkInput(){
        this.usernameInput.error = when{
            this.usernameInput.text?.isEmpty()  == true -> ERROR_EMPTY_VALUE

            this.usernameInput.text?.length!! < 3 -> ERROR_LENGTH
            else -> null
        }

        this.passwordInput.error= when{
            this.passwordInput.text?.isEmpty()  == true -> ERROR_EMPTY_VALUE
            this.passwordInput.text?.length!! < 7 -> SHORT_PASSWORD
            else -> null
        }
    }
}