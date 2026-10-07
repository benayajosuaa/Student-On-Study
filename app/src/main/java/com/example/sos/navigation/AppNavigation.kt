package com.example.sos.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.sos.feature.auth.presentation.login.LoginScreen
import com.example.sos.feature.auth.presentation.registration.RegistrationScreen
import com.example.sos.feature.auth.presentation.welcome.WelcomeScreen

@Composable
fun AppNavigation(modifier: Modifier = Modifier) {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "welcome",
        modifier = modifier
    ) {
        composable(route = "welcome") {
            WelcomeScreen(
                onCreateAccountClick = {
                    navController.navigate("signup")
                },
                onLoginClick = {
                    navController.navigate("login")
                }
            )
        }

        composable(route = "login") {
            LoginScreen(
                onCreateAccountClick = {
                    navController.navigate("signup")
                }
            )
        }

        composable(route = "signup") {
            RegistrationScreen(
                onLoginClick = {
                    navController.navigate("login")
                }
            )
        }
    }
}