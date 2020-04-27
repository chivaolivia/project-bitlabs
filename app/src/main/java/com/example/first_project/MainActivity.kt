package com.example.first_project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.regex.Pattern

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fun validateName() : Boolean{
            if (editname.text.length == 0){
                error_name.setText("Name  must be filled")
                return false
            }else{
                error_name.setText(null)
                return true
            }
        }
        fun validateEmail() : Boolean{
            if (editemail.text.length == 0){
                error_email.setText("Email  must be filled")
                return false
            }else if(!Patterns.EMAIL_ADDRESS.matcher(editemail.text).matches()){
                error_email.setText("Must match E-Mail Pattern")
                return false
            }else{
                error_email.setText(null)
                return true
            }
        }
        fun validatePassword() : Boolean{
            if (editpassword.text.length == 0){
                error_password.setText("Password  must be filled")
                return false
            }else if(editpassword.text.length < 7){
                error_password.setText("Password must be 7 character of longer")
                return false
            }else{
                error_password.setText(null)
                return true
            }
        }
        fun validateGender() : Boolean{
            if (group_button.checkedRadioButtonId == -1){
                error_gender.setText("Gender  must be filled")
                return false
            }else{
                error_gender.setText(null)
                return true
            }
        }
        fun validate(){
            if (validateName() && validateEmail() && validatePassword() && validateGender()){
                Toast.makeText(this@MainActivity,"Success",Toast.LENGTH_SHORT).show()
                editname.setText(null)
                editemail.setText(null)
                editpassword.setText(null)

            }
        }
        btnsubmit.setOnClickListener{
            validate()
        }
    }

}
