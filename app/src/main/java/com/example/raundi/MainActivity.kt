package com.example.raundi

import android.content.Context
import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.transition.Slide
import android.view.Gravity
import android.view.LayoutInflater
import android.widget.*
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import kotlinx.android.synthetic.main.login_popup.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /////////////////////
        //LOGIN BUTTON ONCLICK
        val splash_login = findViewById<Button>(R.id.splash_login_btn)
        splash_login.setOnClickListener{

            val inflater:LayoutInflater = getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            val view = inflater.inflate(R.layout.login_popup, null)

            val popUp = PopupWindow(view, LinearLayout.LayoutParams.WRAP_CONTENT,LinearLayout.LayoutParams.WRAP_CONTENT)

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
                popUp.elevation = 10.0F
            }

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                val slideIn = Slide()
                slideIn.slideEdge = Gravity.BOTTOM
                popUp.enterTransition = slideIn

                val slideOut = Slide()
                slideOut.slideEdge = Gravity.TOP
                popUp.exitTransition = slideOut
            }

            //POPUP FUNCTIONALITY
            val user_mail = findViewById<EditText>(R.id.user_mail)
            val user_password = findViewById<EditText>(R.id.user_password)
            val go_login = findViewById<Button>(R.id.go_login)
            //POPUP LOGIN FUNCITONALITY
            go_login.setOnClickListener {
                Toast.makeText(this@MainActivity, "LOGGING IN", Toast.LENGTH_SHORT).show()
            }

        }

        /////////////////////////////
        //REGISTRATION BUTTON ONCLICK
        val splash_register = findViewById<Button>(R.id.splash_register_btn)
        splash_register.setOnClickListener{
            val rinflater:LayoutInflater = getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            val rview = rinflater.inflate(R.layout.registration_popup, null)

            val rpopUp = PopupWindow(rview, LinearLayout.LayoutParams.WRAP_CONTENT,LinearLayout.LayoutParams.WRAP_CONTENT)

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
                rpopUp.elevation = 10.0F
            }

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                val rslideIn = Slide()
                rslideIn.slideEdge = Gravity.BOTTOM
                rpopUp.enterTransition = rslideIn

                val rslideOut = Slide()
                rslideOut.slideEdge = Gravity.TOP
                rpopUp.exitTransition = rslideOut
            }

            //POPUP FUNCTIONALITY
            val ruser_mail = findViewById<EditText>(R.id.ruser_mail)
            val ruser_name = findViewById<EditText>(R.id.ruser_name)
            val ruser_profile_name = findViewById<EditText>(R.id.ruser_profile_name)
            val ruser_password = findViewById<EditText>(R.id.ruser_password)
            val rgo_register = findViewById<Button>(R.id.go_registration)

            //POPUP REGISTRATION FUNCITONALITY
            rgo_register.setOnClickListener {
                Toast.makeText(this, "REGISTERING USER", Toast.LENGTH_SHORT).show()

                //REGISTER THE USER TO A DATABASE & SEND DATA TO LOCAL DB
                //FragmentManager fm = getFragmentt
            }
        }


    }
}