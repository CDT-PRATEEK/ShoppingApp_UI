package com.example.loginscreen

import android.content.Context
import android.graphics.drawable.Icon
import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Login(
    onNext:()->Unit
) {

    var username by remember {
        mutableStateOf("")
    }
    var password by remember {
        mutableStateOf("")
    }
    var context= LocalContext.current


    Column() {
        Apptextfield(username,"Username","Enter the username"){
            username=it
        }
        Apptextfield(value = password, label = "Password", placeholder ="Enter password"){
            password=it
        }
        Button(onClick = { checklogin(username,password,context, onNext = onNext) }) {
            Text(text = "Click")
        }
    }
}
fun checklogin(username:String, password: String, context: Context, onNext: () -> Unit){
    if (username=="abc" && password=="123"){
        Toast.makeText(context,"Successfully login",Toast.LENGTH_LONG).show()
        onNext()
    }
    else{
        Toast.makeText(context,"Failed",Toast.LENGTH_SHORT).show()
    }
}
@Composable
fun Apptextfield(value:String,label:String,placeholder: String,
                 onValueChanged:(String)->Unit

) {


    OutlinedTextField(value =value , onValueChange = {
        onValueChanged(it) },

        label = {
            Text(text = label)
        },
        placeholder = {
            Text(text = placeholder)
        }
    )
}


