package br.unisanta.recyclerview.View

import br.unisanta.recyclerview.Model.Usuario

interface UsuarioDAO {
    fun adicionarUsuario(usuario: Usuario)
    fun obterUsuarios():List<Usuario>
}