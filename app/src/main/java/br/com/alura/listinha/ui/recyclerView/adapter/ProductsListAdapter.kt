package br.com.alura.listinha.ui.recyclerView.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.com.alura.listinha.R
import br.com.alura.listinha.model.Product

class ProductsListAdapter(
    private val context: Context,
    private val products: List<Product>
) : RecyclerView.Adapter<ProductsListAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        fun attach(product: Product) {
            val inputName = itemView.findViewById<TextView>(R.id.name)
            val inputDesc = itemView.findViewById<TextView>(R.id.description)
            val inputValue = itemView.findViewById<TextView>(R.id.value)

            inputName.text = product.name
            inputDesc.text = product.description
            inputValue.text = product.value.toPlainString()
        }
    };

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.product_item, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return products.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val product = products[position]
        holder.attach(product)
    }

}
