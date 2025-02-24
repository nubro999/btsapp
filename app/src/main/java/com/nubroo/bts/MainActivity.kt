package com.nubroo.bts

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.nubroo.bts.ui.theme.BtsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val image1 = findViewById<ImageView>(R.id.image_1)
        image1.setOnClickListener {

            Toast.makeText(this, "Image 1 clicked", Toast.LENGTH_LONG).show()

            var intent = Intent(this, Bts1Activity::class.java)
            startActivity(intent)
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
        Log.d("MainActivity", "Back button pressed")
        var isDouble = true
        if(isDouble == true)
        {
            finish()
        }
        Toast.makeText(this, "Press again to exit", Toast.LENGTH_LONG).show()

        Handler().postDelayed({isDouble = false}, 2000)}
    }

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BtsTheme {
        Greeting("Android")
    }
}