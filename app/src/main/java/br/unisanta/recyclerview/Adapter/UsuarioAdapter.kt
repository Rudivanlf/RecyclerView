package br.unisanta.recyclerview.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.unisanta.recyclerview.Model.Usuario
import br.unisanta.recyclerview.R

class UsuarioAdapter(private val usuario:List<Usuario>):

    RecyclerView.Adapter<UsuarioAdapter.ViewHolder>() {
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textViewNome: TextView = itemView.findViewById(R.id.txv_usuario)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_usuario, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val usuario = usuario[position]
        holder.textViewNome.text = usuario.nome
    }

    override fun getItemCount(): Int {
        return usuario.size
    }
}