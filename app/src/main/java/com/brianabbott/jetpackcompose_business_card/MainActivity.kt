package com.brianabbott.jetpackcompose_business_card

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.brianabbott.jetpackcompose_business_card.ui.theme.JetpackComposeBusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetpackComposeBusinessCardTheme {
                Surface(color =  MaterialTheme.colorScheme.background) {
                    CreateBusinessCard()
                }
            }
        }
    }
}

@Composable
fun CreateBusinessCard() {
    Surface(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
        Card(modifier = Modifier.width(200.dp)
            .padding(12.dp)
            .height(390.dp),
            shape = RoundedCornerShape(corner = CornerSize(15.dp)),
            CardDefaults.cardColors(containerColor = Color.White),
            elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)) {

        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JetpackComposeBusinessCardTheme {
        CreateBusinessCard()
    }
}