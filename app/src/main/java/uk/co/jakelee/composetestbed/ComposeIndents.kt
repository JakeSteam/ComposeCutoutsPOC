package uk.co.jakelee.composetestbed

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun TopLeftCircle() {
    Box(modifier = Modifier
        .width(100.dp)
        .height(100.dp)
        .padding(4.dp)
        .graphicsLayer {
            alpha = 0.99f
        }
        .drawWithContent {
            drawContent()
            drawCircle(
                color = Color(0xFFFFFFFF),
                center = Offset(x = 0f, y = 0f),
                radius = 50f,
                blendMode = BlendMode.DstOut
            )
        }
        .clip(RoundedCornerShape(20f))
        .background(color = Color(0xFFFFFFFF))
    ) {
        Text("There is text and other content here!",
            color = Color.Black,
            modifier = Modifier.padding(4.dp)
        )
    }
}

@Composable
fun MiddleLeftCircle() {
    Box(modifier = Modifier
        .width(100.dp)
        .height(100.dp)
        .padding(4.dp)
        .graphicsLayer {
            alpha = 0.99f
        }
        .drawWithContent {
            drawContent()
            drawCircle(
                color = Color(0xFFFFFFFF),
                center = Offset(x = 0f, y = size.height / 2),
                radius = 50f,
                blendMode = BlendMode.DstOut
            )
        }
        .clip(RoundedCornerShape(20f))
        .background(color = Color(0xFFFFFFFF))
    ) {
        Text("There is text and other content here!",
            color = Color.Black,
            modifier = Modifier.padding(4.dp)
        )
    }
}

@Composable
fun MultipleCircles() {
    Box(modifier = Modifier
        .width(100.dp)
        .height(100.dp)
        .padding(4.dp)
        .graphicsLayer {
            alpha = 0.99f
        }
        .drawWithContent {
            drawContent()
            drawCircle(
                color = Color(0xFFFFFFFF),
                center = Offset(x = 50f, y = 30f),
                radius = 70f,
                blendMode = BlendMode.DstOut
            )
            drawCircle(
                color = Color(0xFFFFFFFF),
                center = Offset(x = size.width, y = size.height),
                radius = 70f,
                blendMode = BlendMode.DstOut
            )
            drawCircle(
                color = Color(0xFFFFFFFF),
                center = Offset(x = size.width / 2, y = size.height / 2),
                radius = 45f,
                blendMode = BlendMode.DstOut
            )
        }
        .clip(RoundedCornerShape(20f))
        .background(color = Color(0xFFFFFFFF))
    ) {
        Text("There is text and other content here!",
            color = Color.Black,
            modifier = Modifier.padding(4.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun TopLeftCirclePreview() {
    val backgroundPainter = painterResource(id = R.drawable.sample)
    Image(painter = backgroundPainter, contentDescription = "")
    Row {
        TopLeftCircle()
        MiddleLeftCircle()
        MultipleCircles()
    }
}