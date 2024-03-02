package br.com.alura.listinha.dao

import br.com.alura.listinha.model.Product

class ProductsDao {

    fun add(product: Product) {
        products.add(product)
    }

    fun searchAll(): List<Product> {
        return products.toList()
    }

    companion object {
        private val products = mutableListOf<Product>()
    }

}