package br.unisanta.recyclerview

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import br.unisanta.recyclerview.Model.Usuario
import br.unisanta.recyclerview.View.UsuarioDAOImpl
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    private val usuarioDAO = UsuarioDAOImpl()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val editTextNome = findViewById<EditText>(R.id.editText_nome)
        val btnAdd = findViewById<Button>(R.id.button_adicionar)
        val btnList = findViewById<FloatingActionButton>(R.id.list)

        btnAdd.setOnClickListener {
            val nome = editTextNome.text.toString()
            val usuario = Usuario(nome)
            usuarioDAO.adicionarUsuario(usuario)
            editTextNome.text.clear()
            val builder = AlertDialog.Builder(this)
            builder.setTitle("Sucesso")
            builder.setMessage("Cadastro ok")
            val alert = builder.create()
            alert.show()
        }

        btnList.setOnClickListener {
            val intent = Intent(this, ListaUsuariosActivity::class.java)
            startActivity(intent)
        }
        }
    }