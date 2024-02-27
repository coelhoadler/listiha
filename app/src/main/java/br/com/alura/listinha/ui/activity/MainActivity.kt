package br.com.alura.listinha.ui.activity

import android.app.Activity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.com.alura.listinha.R
import br.com.alura.listinha.ui.recyclerView.adapter.ProductsListAdapter

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Toast.makeText(this, "Mariana te amo <3", Toast.LENGTH_LONG).show()
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView);
        recyclerView.adapter = ProductsListAdapter()

        val inputName = recyclerView.findViewById<TextView>(R.id.name);
        val inputDesc = recyclerView.findViewById<TextView>(R.id.description);
        val inputValue = recyclerView.findViewById<TextView>(R.id.value);

        inputName.text = "Cesta de Frutas"
        inputDesc.text = "Uva e Banana"
        inputValue.text = "R$ 19,99"
    }

}