package br.com.alura.listinha.ui.activity

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import br.com.alura.listinha.R
import br.com.alura.listinha.dao.ProductsDao
import br.com.alura.listinha.model.Product
import java.math.BigDecimal

class FormProductActivity : AppCompatActivity(R.layout.activity_form_product) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        configureSaveButton()

    }

    private fun configureSaveButton() {
        val button = findViewById<Button>(R.id.saveButton)

        button.setOnClickListener {
            val inputName = findViewById<EditText>(R.id.name)
            val name = inputName.text.toString()

            val inputDesc = findViewById<EditText>(R.id.description)
            val desc = inputDesc.text.toString()

            val inputVal = findViewById<EditText>(R.id.value)
            val textValue = inputVal.text.toString()

            val value = if (textValue.isBlank()) {
                BigDecimal.ZERO
            } else {
                BigDecimal(textValue)
            }

            val newProduct = Product(name, desc, value)
            Log.i("FormProductActivity", "onClick: $newProduct")

            val productsDao = ProductsDao()
            productsDao.add(newProduct)

            Log.i("FormProductActivity", "DAO searchAll: ${productsDao.searchAll()}")
            finish()
        }
    }

}