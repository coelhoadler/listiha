package br.com.alura.listinha.ui.activity

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import br.com.alura.listinha.FormProductActivity
import br.com.alura.listinha.R
import br.com.alura.listinha.dao.ProductsDao
import br.com.alura.listinha.model.Product
import br.com.alura.listinha.ui.recyclerView.adapter.ProductsListAdapter
import com.google.android.material.floatingactionbutton.FloatingActionButton
import java.math.BigDecimal

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Toast.makeText(this, "Mariana te amo <3", Toast.LENGTH_LONG).show() // Exemplo de Toast
    }

    override fun onResume() {
        super.onResume()
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        val dao = ProductsDao()

        recyclerView.adapter = ProductsListAdapter(this, dao.searchAll())

        val floatingActionButton: FloatingActionButton = findViewById<FloatingActionButton>(R.id.floatingActionButton)

        floatingActionButton.setOnClickListener {
            val intent = Intent(this, FormProductActivity::class.java)
            startActivity(intent)
        }
    }

}