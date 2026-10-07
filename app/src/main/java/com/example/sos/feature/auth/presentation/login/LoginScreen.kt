package com.example.sos.feature.auth.presentation.login

import androidx.compose.foundation.clickable
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.material3.TextField
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.TextFieldDefaults


@Composable
fun LoginScreen(modifier: Modifier = Modifier, onCreateAccountClick: () -> Unit) {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(24.dp),
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        Text(
            text = "Login",
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold
        )

//        kasih space padding top
        Spacer(modifier = Modifier.height(30.dp))

//      field untuk form email
        Text(
            text="Email",
            fontWeight = FontWeight.SemiBold
        )
        TextField(
            value = email,
            onValueChange = { email = it },
            placeholder = { Text("Email") },
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(7.dp),
            colors = TextFieldDefaults.colors(
                focusedContainerColor = Color(0xFFE6EEF8),
                unfocusedContainerColor = Color(0xFFE6EEF8),
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent
            )
        )

//      field untuk password
        Text(
            text="Password",
            fontWeight = FontWeight.SemiBold
        )
        TextField(
            value = password,
            onValueChange = { password = it},
            modifier = Modifier.fillMaxWidth(),
            label = { Text("Password")},
            visualTransformation = PasswordVisualTransformation(),
            shape = RoundedCornerShape(7.dp),
            colors = TextFieldDefaults.colors(
                focusedContainerColor = Color(0xFFE6EEF8),
                unfocusedContainerColor = Color(0xFFE6EEF8),
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent
            )
        )

//      space
        Spacer(modifier = Modifier.height(10.dp))

//      Forgot password
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.End
        ) {
            Text("Forgot Password")
        }


//      space
        Spacer(modifier = Modifier.height(30.dp))

//      button login
        Button(
            onClick = {},
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(50.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF2447B2)
            )
        ) {
            Text(
                text = "Login"

            )
        }

//      belum punya akun ?
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            Text("Don't have an account? ")

            Text(
                text = "Sign Up",
                color = Color.Blue,
                modifier = Modifier.clickable {
                    onCreateAccountClick()
                }
            )
        }
    }
}