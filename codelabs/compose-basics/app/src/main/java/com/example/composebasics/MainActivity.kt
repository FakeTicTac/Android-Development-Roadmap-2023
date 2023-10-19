package com.example.composebasics

import android.os.Bundle

import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import com.example.composebasics.ui.theme.ComposeBasicsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeBasicsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    /*
                    val articleTitle = stringResource(R.string.jetpack_compose_article_title)
                    val articleParagraphs = arrayOf(
                        stringResource(R.string.jetpack_compose_first_paragraph),
                        stringResource(R.string.jetpack_compose_second_paragraph)
                    )

                    ComposeArticle(articleTitle, articleParagraphs, modifier)

                    val celebrateText = stringResource(R.string.text_celebrate)
                    TaskManagerSuccess(celebrateText, modifier)

                    GlossaryPage(modifier)
                    */
                }
            }
        }
    }
}

/**
 * 1. Exercise: Compose article
 */

@Composable
fun ComposeArticle(title: String, paragraphs: Array<String>, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.bg_compose_background),
            contentDescription = null,
            modifier = modifier
                .fillMaxWidth()
        )
        Text(
            text = title,
            fontSize =  24.sp,
            modifier = modifier
                .padding(
                    all = 16.dp
                )
        )
        // Draw paragraphs on the user screen.
        paragraphs.forEach { paragraph ->
            Text (
                text = paragraph,
                textAlign = TextAlign.Justify,
                lineHeight = 20.sp,
                modifier = modifier
                    .padding(
                        start = 16.dp,
                        end = 16.dp,
                        bottom = 16.dp
                    )
            )
        }
    }
}

// @Preview(showBackground = true)
@Composable
fun ComposeArticlePreview(modifier: Modifier = Modifier) {
    ComposeBasicsTheme {
        val articleTitle = stringResource(R.string.jetpack_compose_article_title)
        val articleParagraphs = arrayOf(
            stringResource(R.string.jetpack_compose_first_paragraph),
            stringResource(R.string.jetpack_compose_second_paragraph)
        )

        ComposeArticle(articleTitle, articleParagraphs, modifier)
    }
}

/**
 * 2. Exercise: Task Manager
 */

@Composable
fun TaskManagerSuccess(celebrateText: String, modifier: Modifier = Modifier) {
    Column(
        verticalArrangement  = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .fillMaxSize()
    ) {
        Image(
            painter = painterResource(R.drawable.ic_task_completed),
            contentDescription = null
        )
        Text(
            text = stringResource(R.string.text_tasks_completed),
            fontWeight = FontWeight.Bold,
            modifier = modifier
                .padding(
                    top = 24.dp,
                    bottom = 8.dp
                )
        )
        Text(
            text = celebrateText,
            fontSize = 16.sp
        )
    }
}

// @Preview(showBackground = true)
@Composable
fun TaskManagerPreview(modifier: Modifier = Modifier) {
    ComposeBasicsTheme {
        val celebrateText = stringResource(R.string.text_celebrate)
        TaskManagerSuccess(celebrateText, modifier)
    }
}

/**
 * 3. Exercise: Compose quadrant
 */

@Composable
fun GlossaryPage(cards: Array<Triple<String, String, Color>>, modifier: Modifier = Modifier) {
    val numRows = (cards.size + 1) / 2

    Column(modifier.fillMaxWidth()) {
        for (row in 0 until numRows) {
            val startCardIndex = row * 2

            Row(modifier.weight(1f)) {
                for (cardIndex in startCardIndex until startCardIndex + 2) {
                    val card = cards[cardIndex]
                    GlossaryItem(card.first, card.second, card.third, modifier.weight(1f))
                }
            }
        }
    }
}

@Composable
fun GlossaryItem(title: String, description: String, background: Color, modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .fillMaxSize()
            .background(background)
            .padding(
                all = 16.dp
            )
    ) {
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(
                    bottom = 16.dp
                )
        )
        Text(
            text = description,
            textAlign = TextAlign.Justify
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GlossaryPagePreview(modifier: Modifier = Modifier) {
    ComposeBasicsTheme {
        val cards = arrayOf(
            Triple(
                stringResource(R.string.first_glossary_title),
                stringResource(R.string.first_glossary_description),
                Color(0xFFEADDFF)
            ),
            Triple(
                stringResource(R.string.second_glossary_title),
                stringResource(R.string.second_glossary_description),
                Color(0xFFD0BCFF)
            ),
            Triple(
                stringResource(R.string.third_glossary_title),
                stringResource(R.string.third_glossary_description),
                Color(0xFFB69DF8)
            ),
            Triple(
                stringResource(R.string.fourth_glossary_title),
                stringResource(R.string.fourth_glossary_description),
                Color(0xFFF6EDFF)
            ),
        )

        GlossaryPage(cards, modifier)
    }
}
