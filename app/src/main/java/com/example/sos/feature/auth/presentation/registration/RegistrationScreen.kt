package com.example.sos.feature.auth.presentation.registration

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.clickable
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun RegistrationScreen(
    onLoginClick: () -> Unit
) {
    var name by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var confirmPassword by remember { mutableStateOf("") }

    val fieldColor = Color(0xFFE6EEF8)



    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(24.dp)
    ) {
        Spacer(modifier = Modifier.height(30.dp))

        Text(
            text = "Create an Account",
            fontSize = 25.sp,
            fontWeight = FontWeight.SemiBold
        )

        Spacer(modifier = Modifier.height(40.dp))

        // Full Name
        Text(
            text = "Full Name",
            fontWeight = FontWeight.SemiBold
        )

        Spacer(modifier = Modifier.height(8.dp))

        TextField(
            value = name,
            onValueChange = { name = it },
            placeholder = { Text("Masukkan nama lengkap") },
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(7.dp),
            singleLine = true,
            colors = TextFieldDefaults.colors(
                focusedContainerColor = fieldColor,
                unfocusedContainerColor = fieldColor,
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent
            )
        )

        Spacer(modifier = Modifier.height(18.dp))

        // Email
        Text(
            text = "Email",
            fontWeight = FontWeight.SemiBold
        )

        Spacer(modifier = Modifier.height(8.dp))

        TextField(
            value = email,
            onValueChange = { email = it },
            placeholder = { Text("nama@email.com") },
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(7.dp),
            singleLine = true,
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Email
            ),
            colors = TextFieldDefaults.colors(
                focusedContainerColor = fieldColor,
                unfocusedContainerColor = fieldColor,
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent
            )
        )

        Spacer(modifier = Modifier.height(18.dp))

        // Password
        Text(
            text = "Password",
            fontWeight = FontWeight.SemiBold
        )

        Spacer(modifier = Modifier.height(8.dp))

        TextField(
            value = password,
            onValueChange = { password = it },
            placeholder = { Text("Masukkan password") },
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(7.dp),
            singleLine = true,
            visualTransformation = PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Password
            ),
            colors = TextFieldDefaults.colors(
                focusedContainerColor = fieldColor,
                unfocusedContainerColor = fieldColor,
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent
            )
        )

        Spacer(modifier = Modifier.height(18.dp))

        // Re-enter Password
        Text(
            text = "Re-enter Password",
            fontWeight = FontWeight.SemiBold
        )

        Spacer(modifier = Modifier.height(8.dp))

        TextField(
            value = confirmPassword,
            onValueChange = { confirmPassword = it },
            placeholder = { Text("Masukkan ulang password") },
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(7.dp),
            singleLine = true,
            visualTransformation = PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Password
            ),
            colors = TextFieldDefaults.colors(
                focusedContainerColor = fieldColor,
                unfocusedContainerColor = fieldColor,
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent
            )
        )

        Spacer(modifier = Modifier.height(58.dp))

        // Sign Up
        Button(
            onClick = {
                // Proses pendaftaran bisa ditambahkan di sini.
            },
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(50.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF2447B2)
            )
        ) {
            Text(
                text = "Sign Up",
                fontSize = 16.sp
            )
        }


        Spacer(modifier = Modifier.height(10.dp))

        // Sign Up
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ){
            Text("Don't have an account? ")
            Text(
                text = "Login",
                color = Color.Blue,
                modifier = Modifier.clickable {
                    onLoginClick()
                }
            )
        }
    }
}