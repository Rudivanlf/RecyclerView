package br.unisanta.recyclerview

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.unisanta.recyclerview.Adapter.UsuarioAdapter
import br.unisanta.recyclerview.View.UsuarioDAO
import br.unisanta.recyclerview.View.UsuarioDAOImpl

class ListaUsuariosActivity : AppCompatActivity(R.layout.activity_lista_usuarios) {
    private val dao = UsuarioDAOImpl()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val rvUsuarios = findViewById<RecyclerView>(R.id.rv_usuarios)
        val usuarios = dao.obterUsuarios()
        rvUsuarios.layoutManager = LinearLayoutManager(this)
        rvUsuarios.adapter = UsuarioAdapter(usuarios)
    }
}