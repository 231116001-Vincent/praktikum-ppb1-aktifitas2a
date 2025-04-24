package com.vharya.aktifitas2a

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.ImageButton
import android.widget.RadioGroup
import android.widget.Toast
import android.widget.ToggleButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val buttonSave = findViewById<Button>(R.id.button_save)
        val buttonOpen = findViewById<Button>(R.id.button_open)
        val buttonImage = findViewById<ImageButton>(R.id.button_image)
        val checkAutosave = findViewById<CheckBox>(R.id.check_autosave)
        val checkStar = findViewById<CheckBox>(R.id.check_star)
        val radioGroup = findViewById<RadioGroup>(R.id.radio_group)
        val toggleButton = findViewById<ToggleButton>(R.id.toggle_button)

        buttonSave.setOnClickListener { displayToast("Open button pressed!") }
        buttonOpen.setOnClickListener { displayToast("Save button pressed!") }
        buttonImage.setOnClickListener { displayToast("Image button pressed!") }

        checkAutosave.setOnClickListener { v ->
            if ((v as CheckBox).isChecked) {
                displayToast("AutoSave turned ON")
            }
            else {
                displayToast("AutoSave turned OFF")
            }
        }

        checkStar.setOnClickListener { v ->
            if ((v as CheckBox).isChecked) {
                displayToast("Item Starred")
            }
            else {
                displayToast("Item Starred")
            }
        }

        radioGroup.setOnCheckedChangeListener { group, checkedId ->
            if (checkedId == R.id.radio_button1) {
                displayToast("Option 1 selected!")
            }
            else {
                displayToast("Option 1 selected!")
            }
        }

        toggleButton.setOnClickListener { v ->
            if ((v as ToggleButton).isChecked) {
                displayToast("Toggle turned ON!")
            }
            else {
                displayToast("Toggle turned OFF!")
            }
        }
    }

    fun displayToast(text: String) {
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
    }
}