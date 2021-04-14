package kg.tutorialapp.mycolor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val red = findViewById<Button>(R.id.button)
        val yellow = findViewById<Button>(R.id.button2)
        val green = findViewById<Button>(R.id.button3)
        val text = findViewById<TextView>(R.id.textView)
        val change = findViewById<ConstraintLayout>(R.id.change_layout)

        red.setOnClickListener {
            change.setBackgroundColor(getColor(baseContext, R.color.red))
            text.text = "Красный"
        }

        yellow.setOnClickListener {
            change.setBackgroundColor(getColor(baseContext, R.color.yellow))
            text.text = "Желтый"
        }
        green.setOnClickListener {
            change.setBackgroundColor(getColor(baseContext, R.color.green))
            text.text = "Зеленый"
        }
    }


}