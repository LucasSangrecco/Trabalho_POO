package br.com.newton.redesocial;

import java.util.ArrayList;

public class Amigo {

    String nome;

    private ArrayList<Usuario> amigos = new ArrayList<Usuario>();

    public Amigo(String nome) {
        this.nome = nome;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Usuario> getAmigos() {
        return amigos;
    }

    public void setAmigos(ArrayList<Usuario> amigos) {
        this.amigos = amigos;
    }

    public void Incluir(Usuario usuario){
        amigos.add(usuario);
    }

    public void Excluir(Usuario usuario){
        amigos.remove(usuario);
    }

}
