package com.example.sos.feature.auth.presentation.welcome

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun WelcomeScreen(
    onCreateAccountClick: () -> Unit,
    onLoginClick: () -> Unit
) {
    Column(
        verticalArrangement = Arrangement.spacedBy(20.dp, Alignment.CenterVertically),
        modifier = Modifier.padding(20.dp)
    ){
        Spacer(modifier = Modifier.height(100.dp))

//      GAMBAR LOGO



//      Create Account
        Button(
            onClick = onCreateAccountClick,
            shape = RoundedCornerShape(30.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF2447B2)
            ),
            modifier = Modifier.fillMaxWidth(),
            border = BorderStroke(
                width = 1.dp,
                color = Color(0xFF2447B2)
            )
        ) {
            Text(
                text = "Create Account",
                modifier = Modifier.padding( horizontal = 10.dp, vertical = 6.dp),
                color = Color(0xFFffffff),
                fontSize = 15.sp

            )
        }


//      Login
        Button(
            onClick = onLoginClick,
            shape = RoundedCornerShape(30.dp),
            colors = ButtonDefaults.buttonColors(
//                containerColor = Color(0xFF2447B2)
                containerColor = Color(0xFFffffff),
                contentColor = Color(0xFFffffff)
            ),
            modifier = Modifier.fillMaxWidth(),
            border = BorderStroke(
                width = 1.dp,
                color = Color(0xFF2447B2)
            )
        ) {
            Text(
                text = "Login",
                modifier = Modifier.padding( horizontal = 10.dp, vertical = 6.dp),
                color = Color(0xFF2447B2),
                fontSize = 15.sp

            )
        }
    }
}