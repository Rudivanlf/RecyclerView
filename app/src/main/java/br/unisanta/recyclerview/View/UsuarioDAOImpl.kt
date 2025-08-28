package br.unisanta.recyclerview.View

import br.unisanta.recyclerview.Model.Usuario

class UsuarioDAOImpl : UsuarioDAO {
    companion object {
        private val usuarios = mutableListOf<Usuario>()
    }

    override fun adicionarUsuario(usuario: Usuario) {
        usuarios.add(usuario)
    }

    override fun obterUsuarios(): List<Usuario> {
        return usuarios
    }
}