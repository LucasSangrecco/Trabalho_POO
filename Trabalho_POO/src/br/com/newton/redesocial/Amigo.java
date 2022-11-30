package br.com.newton.redesocial;

import java.util.ArrayList;

public class Amigo {

    String nome;

    static ArrayList<Usuario> amigos = new ArrayList<Usuario>();


    public Amigo() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void Incluir(Usuario usuario){
        amigos.add(usuario);
    }

    public void Excluir(Amigo amigo){
        amigos.remove(amigo);
    }

}
