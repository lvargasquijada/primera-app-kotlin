package com.example.app_kotlin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.app_kotlin.ui.theme.AppkotlinTheme
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color

class TodoAppActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppkotlinTheme {
                TodoApp(
                    onBack = { finish() }
                )
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TodoApp(onBack: () -> Unit) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        "Todo App",
                        color = Color.White
                    )
                },
                navigationIcon = {
                    IconButton( onClick = onBack ) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Default.ArrowBack,
                            contentDescription = "Volver",
                            tint = Color.White
                        )
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color(0xFF1E88E5)
                )
            )
        },
    ) { innerPadding ->

        Column(
            modifier = Modifier
            .padding(innerPadding)
            .fillMaxSize()
            .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
           Row(
               modifier = Modifier.fillMaxSize()
           ) {
               OutlinedTextField(
                   value = "",
                   onValueChange = {},
                   label = { Text("Nueva tarea") },
                   modifier = Modifier.weight(1f)
               )
           }
        }

    }
}