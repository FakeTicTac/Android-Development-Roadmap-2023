package com.example.i2a6

import android.os.Bundle

import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape

import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text

import androidx.compose.runtime.Composable

import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import com.example.i2a6.ui.theme.I2a6Theme


/**
 * Application entrance point.
 */
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            I2a6Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BusinessCard()
                }
            }
        }
    }
}

/**
 * Main composable responsible for displaying business card.
 */
@Composable
fun BusinessCard(modifier: Modifier = Modifier) {
    Box(modifier.fillMaxSize()) {
        Image(
            painter = painterResource(R.drawable.i2a6_background),
            contentDescription = null,
            contentScale = ContentScale.Crop
        )
        BusinessCardContent()
    }
}

/**
 * Composable is responsible for displaying business card inner content.
 */
@Composable
fun BusinessCardContent(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(
                all = 24.dp
            )
    ) {
        val contentModifier = Modifier
            .weight(2f)
            .fillMaxWidth()

        Header()
        PersonalInformation(contentModifier)
        ContactDetails(contentModifier)
    }
}

/**
 * Composable is responsible for displaying header section.
 */
@Composable
fun Header(modifier: Modifier = Modifier) {
    Icon(
        painter = painterResource(R.drawable.i2a6_logo),
        contentDescription = null,
        tint = Color.White,
        modifier = modifier
            .size(40.dp)
    )
}

@Composable
fun PersonalInformation(modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
    ) {
        Image(
            painter = painterResource(R.drawable.i2a6_portrait),
            contentDescription = null,
            modifier = Modifier
                .padding(
                    bottom = 18.dp
                )
                .clip(RoundedCornerShape(16.dp))
        )
        Text(
            text = stringResource(R.string.i2a6_name).uppercase(),
            fontSize = 30.sp,
            lineHeight = 30.sp,
            color = Color.White,
            fontFamily = FontFamily(Font(R.font.avenir_black)),
            modifier = Modifier
                .padding(4.dp)
        )
        Text(
            text = stringResource(R.string.i2a6_role_description),
            fontSize = 16.sp,
            lineHeight = 16.sp,
            fontFamily = FontFamily(Font(R.font.avenir_medium)),
            color = Color.White,
        )
    }
}

@Composable
fun ContactDetails(modifier: Modifier = Modifier) {
    val contactData = arrayOf(
        Pair(painterResource(R.drawable.i2a6_logo), "LinkedIn"),
        Pair(painterResource(R.drawable.i2a6_logo), "Facebook"),
        Pair(painterResource(R.drawable.i2a6_logo), "Instagram")
    )

    Column(
        horizontalAlignment = Alignment.End,
        modifier = Modifier
            .fillMaxWidth()
    ) {
        contactData.forEach { contact ->
            Row {
                Text(
                    text = contact.second,
                    fontFamily = FontFamily(Font(R.font.avenir_medium)),
                    color = Color.White
                )
            }
        }
    }
}

/**
 * Main composable preview.
 */
@Preview(showBackground = true)
@Composable
fun BusinessCardPreview(modifier: Modifier = Modifier) {
    I2a6Theme {
        BusinessCard(modifier)
    }
}