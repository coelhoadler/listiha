package br.com.alura.listinha

import android.app.Activity
import android.os.Bundle
import android.widget.TextView

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Toast.makeText(this, "Mariana te amo <3", Toast.LENGTH_LONG).show()
        setContentView(R.layout.activity_main)

        val inputName = findViewById<TextView>(R.id.name);
        val inputDesc = findViewById<TextView>(R.id.description);
        val inputValue = findViewById<TextView>(R.id.value);

        inputName.text = "Cesta de Frutas"
        inputDesc.text = "Uva e Banana"
        inputValue.text = "R$ 19,99"
    }

}