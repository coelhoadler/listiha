package br.com.alura.listinha.ui.activity

import android.app.Activity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import br.com.alura.listinha.R
import br.com.alura.listinha.model.Product
import br.com.alura.listinha.ui.recyclerView.adapter.ProductsListAdapter
import java.math.BigDecimal

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Toast.makeText(this, "Mariana te amo <3", Toast.LENGTH_LONG).show()
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

        recyclerView.adapter = ProductsListAdapter(this, listOf(
            Product(name = "Banana", description = "1 dúzia de bananas", value = BigDecimal("11.00")),
            Product(name = "Ovos", description = "6 dúzias de ovos", value = BigDecimal("39.99"))
        ))
    }

}