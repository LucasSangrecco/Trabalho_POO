package br.com.newton.redesocial;

import java.util.ArrayList;

public class Usuario {

    String nome;
    String telefone;
    String email;
    String senha;
    String dataNascimento;
    String genero;

    private ArrayList<Usuario> usuarios = new ArrayList<Usuario>();



    public Usuario(String nome, String telefone, String email, String senha, String dataNascimento, String genero) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.senha = senha;
        this.dataNascimento = dataNascimento;
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void Cadastrar(Usuario usuario) {
        usuarios.add(usuario);
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public String ConfirmaSenha(){

        String confirmaSenha="";

        for (int i=0;i<usuarios.size();i++){
            Usuario u = (Usuario)usuarios.get(i);
            confirmaSenha=u.getSenha();
        }
        return confirmaSenha;
    }

    public String ConfirmaEmail(){

        String confirmaEmail="";

        for (int i=0;i<usuarios.size();i++){
            Usuario u = (Usuario)usuarios.get(i);
            confirmaEmail=u.getEmail();
        }
        return confirmaEmail;
    }

    public String Perfil(){
        return "Perfil\n\n" + "Nome - " + getNome() +
                "\nTelefone - " + getTelefone() +
                "\nE-Mail - " + getEmail() +
                "\nData de Nascimento - " + getDataNascimento() +
                "\nGenero - " + getGenero();
    }

}




