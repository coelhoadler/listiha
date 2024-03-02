package br.com.alura.listinha.ui.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import br.com.alura.listinha.R
import br.com.alura.listinha.dao.ProductsDao
import br.com.alura.listinha.ui.recyclerView.adapter.ProductsListAdapter
import com.google.android.material.floatingactionbutton.FloatingActionButton

class ProductsListActivity : AppCompatActivity(R.layout.activity_list_products) {

    private val dao = ProductsDao()
    private val adapter = ProductsListAdapter(this, dao.searchAll())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Toast.makeText(this, "Mariana te amo <3", Toast.LENGTH_LONG).show() // Exemplo de Toast
        configureRecycleView()
    }

    override fun onResume() {
        super.onResume()
        adapter.update(dao.searchAll())
        setActionForFloatingButton()
    }

    private fun setActionForFloatingButton() {
        val floatingActionButton: FloatingActionButton =
            findViewById<FloatingActionButton>(R.id.floatingActionButton)

        floatingActionButton.setOnClickListener {
            goToNewProductForm()
        }
    }

    private fun goToNewProductForm() {
        val intent = Intent(this, FormProductActivity::class.java)
        startActivity(intent)
    }

    private fun configureRecycleView() {
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.adapter = adapter
    }

}