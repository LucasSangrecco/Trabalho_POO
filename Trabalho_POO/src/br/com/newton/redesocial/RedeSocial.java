package br.com.newton.redesocial;

import javax.swing.*;
import java.util.ArrayList;

public class RedeSocial {
    public static void main(String[] args) {

        String nome;
        String telefone;
        String email;
        String senha;
        String confirmaSenha;
        String dataNascimento;
        String genero;
        String emailLogin;
        String senhaLogin;
        String alteraNome;
        String alteraTelefone;
        String alteraEmail;
        String confirmaSenha2;
        String alteraSenha;
        String alteraDataNascimento;
        String alteraGenero;
        int opcao1 = 0;
        int opcao2 = 0;
        int opcao3 = 0;
        int opcao4 = 0;
        int opcao5 = 0;
        int opcao6 = 0;

        ArrayList<Usuario> usuarios = new ArrayList<Usuario>();


        Usuario usuario = null;
        Amigo amigo = null;


        do {
            opcao1 = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção:\n" +
                    "<1> Cadastrar\n" +
                    "<2> Login\n" +
                    "<3> Sair\n"));



            switch (opcao1) {

                case 1:
                    nome = JOptionPane.showInputDialog("Digite o seu nome completo: ");
                    telefone = JOptionPane.showInputDialog("Digite o seu telefone: ");
                    email = JOptionPane.showInputDialog("Digite o seu e-mail: ");
                    senha = JOptionPane.showInputDialog("Digite a sua senha: ");
                    confirmaSenha = JOptionPane.showInputDialog("Confirme a sua senha: ");
                    dataNascimento = JOptionPane.showInputDialog("Digite a data do seu nascimento: ");
                    genero = JOptionPane.showInputDialog("Digite o seu genero :");

                    if (senha.equals(confirmaSenha)) {
                        usuario = new Usuario(nome, telefone, email, senha, dataNascimento, genero);
                        usuarios.add(usuario);
                        usuario.Cadastrar(usuario);
                        JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "As senhas não são iguais. Tente cadastrar novamente.", "Erro", JOptionPane.WARNING_MESSAGE);
                    }
                    break;

                case 2:
                    emailLogin = JOptionPane.showInputDialog("Digite o seu e-mail: ");
                    senhaLogin = JOptionPane.showInputDialog("Digite a sua senha: ");

                    if (emailLogin.equals(usuario.ConfirmaEmail()) && senhaLogin.equals(usuario.ConfirmaSenha())) {

                        JOptionPane.showMessageDialog(null, "Seja Bem Vindo!");

                        do {
                            opcao2 = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção:" +
                                    "\n<1> Ver perfil " +
                                    "\n<2> Ver lista de amigos" +
                                    "\n<3> Adicionar amigos" +
                                    "\n<4> Excluir amigos" +
                                    "\n<5> Sair"));

                            switch (opcao2) {

                                case 1:
                                    JOptionPane.showMessageDialog(null, usuario.Perfil());

                                    do {
                                        opcao3 = Integer.parseInt(JOptionPane.showInputDialog("Deseja alterar algum dado? " +
                                                "\n<1> Sim\n<2> Não"));

                                        switch (opcao3) {

                                            case 1:

                                                do {
                                                    opcao4 = Integer.parseInt(JOptionPane.showInputDialog("Qual dado deseja editar:" +
                                                            "\n<1> Nome" +
                                                            "\n<2> Telefone" +
                                                            "\n<3> E-mail" +
                                                            "\n<4> Senha" +
                                                            "\n<5> Data de Nascimento" +
                                                            "\n<6> Gênero" +
                                                            "\n<7> Cancelar"));

                                                    switch (opcao4) {
                                                        case 1:
                                                            alteraNome = JOptionPane.showInputDialog("Digite o novo nome");
                                                            usuario.setNome(alteraNome);
                                                            break;
                                                        case 2:
                                                            alteraTelefone = JOptionPane.showInputDialog("Digite o  novo telefone: ");
                                                            usuario.setTelefone(alteraTelefone);
                                                            break;
                                                        case 3:
                                                            alteraEmail = JOptionPane.showInputDialog("Digite o novo E-mail: ");
                                                            usuario.setEmail(alteraEmail);
                                                            break;
                                                        case 4:
                                                            confirmaSenha2 = JOptionPane.showInputDialog("Digite a senha antiga: ");

                                                            if (usuario.getSenha().equals(confirmaSenha2)) {
                                                                alteraSenha = JOptionPane.showInputDialog("Digite a nova senha: ");
                                                                usuario.setSenha(alteraSenha);
                                                            } else {
                                                                JOptionPane.showMessageDialog(null, "Senha incorreta.\nTente novamente.");
                                                            }
                                                            break;
                                                        case 5:
                                                            alteraDataNascimento = JOptionPane.showInputDialog("Digite a nova data de nascimento: ");
                                                            usuario.setDataNascimento(alteraDataNascimento);
                                                            break;
                                                        case 6:
                                                            alteraGenero = JOptionPane.showInputDialog("Digite o novo gênero: ");
                                                            usuario.setGenero(alteraGenero);
                                                            break;
                                                    }
                                                }
                                                while (opcao4 != 7);
                                                break;
                                        }
                                    }
                                    while (opcao3 != 2);
                                    break;

                                case 2:
                                    if (amigo.amigos != null) {

                                        for (int i = 0; i < amigo.amigos.size(); i++) {
                                            JOptionPane.showMessageDialog(null,
                                                    "Nome: " + amigo.getNome(), "Amigos", JOptionPane.DEFAULT_OPTION);
                                        }
                                    } else {
                                        JOptionPane.showMessageDialog(null, "Você ainda não adicionou nenhum amigo"
                                        );
                                    }
                                    break;

                                case 3:
                                    for (int i = 0; i < usuario.usuarios.size(); i++) {

                                        do {
                                            JOptionPane.showMessageDialog(null,
                                                    "Nome: " + usuario.getNome(), "Usuários", JOptionPane.DEFAULT_OPTION);

                                            opcao5 = Integer.parseInt(JOptionPane.showInputDialog("Deseja adicionar esta pessoa a sua lista de amigos? " +
                                                    "\n\n<1> Sim" +
                                                    "\n<2> Não"));

                                            switch (opcao5) {
                                                case 1:
                                                    amigo.Incluir(usuario);
                                                    JOptionPane.showMessageDialog(null, "Amigo adicionado com sucesso!");
                                            }
                                        }
                                        while (opcao5 != 2);
                                    }
                                    break;
                                case 4:

                                    for (int i = 0; i < amigo.amigos.size(); i++) ;
                                {

                                    do {
                                        JOptionPane.showMessageDialog(null,
                                                "Nome: " + amigo.getNome(), "Amigos", JOptionPane.DEFAULT_OPTION);

                                        opcao6 = Integer.parseInt(JOptionPane.showInputDialog("Deseja excluir esta pessoa da sua lista de amigos?" +
                                                "\n\n<1> Sim" +
                                                "\n <2> Não"));
                                        switch (opcao6) {
                                            case 1:
                                                amigo.Excluir(amigo);
                                                JOptionPane.showMessageDialog(null, "Amigo excluido com sucesso!");
                                        }

                                    }
                                    while (opcao6 != 2);
                                }

                            }

                        }
                        while (opcao2 != 5);
                    } else {
                        JOptionPane.showMessageDialog(null, "Senha ou e-mail incorretos!", "Erro", JOptionPane.WARNING_MESSAGE);
                    }
                    break;
            }
        }
        while (opcao1 != 3);

    }

}
