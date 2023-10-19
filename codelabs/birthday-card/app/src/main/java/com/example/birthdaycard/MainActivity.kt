package com.example.birthdaycard


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.birthdaycard.ui.theme.BirthdayCardTheme


/**
 * Class responsible for displaying Main activity.
 */
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BirthdayCardTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    NorwayImage()
                }
            }
        }
    }
}

/**
 * Function is responsible for drawing welcome text.
 */
@Composable
fun WelcomeText(modifier: Modifier = Modifier) {
    Column (
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
    ) {
        Text (
            text = stringResource(R.string.quote_message_text),
            fontSize = 40.sp,
            lineHeight = 46.sp,
            color = Color.White,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold,
            modifier = modifier
                .fillMaxWidth()
                .background(color = Color.Black)
                .padding(
                    start = 16.dp,
                    top = 16.dp,
                    end = 16.dp,
                    bottom = 16.dp
                )
        )
    }
}

/**
 * Function is responsible for drawing app background.
 */
@Composable
fun NorwayImage(modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.norway_background)
    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop,
        )
        WelcomeText()
    }
}

/**
 * Function is responsible for previewing application.
 */
@Preview(showBackground = true)
@Composable
fun NorwayMemoryReview() {
    BirthdayCardTheme {
        NorwayImage()
    }
}
