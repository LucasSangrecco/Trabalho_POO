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

        ArrayList<Usuario> usuariosCadastrados = new ArrayList<Usuario>();
        ArrayList<Amigo> amigosAdicionados = new ArrayList<Amigo>();



        do {
            opcao1 = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção:\n" +
                    "<1> Cadastrar\n" +
                    "<2> Login\n" +
                    "<3> Sair\n"));


            switch (opcao1) {
                // case 1 - Cadastro
                case 1:
                    nome = JOptionPane.showInputDialog("Digite o seu nome completo: ");
                    telefone = JOptionPane.showInputDialog("Digite o seu telefone: ");
                    email = JOptionPane.showInputDialog("Digite o seu e-mail: ");
                    senha = JOptionPane.showInputDialog("Digite a sua senha: ");
                    confirmaSenha = JOptionPane.showInputDialog("Confirme a sua senha: ");
                    dataNascimento = JOptionPane.showInputDialog("Digite a data do seu nascimento: ");
                    genero = JOptionPane.showInputDialog("Digite o seu genero :");

                    if (senha.equals(confirmaSenha)) {
                        Usuario usuario = new Usuario(nome, telefone, email, senha, dataNascimento, genero);
                        usuariosCadastrados.add(usuario);
                        usuario.Cadastrar(usuario);
                        JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "As senhas não são iguais. Tente cadastrar novamente.", "Erro", JOptionPane.WARNING_MESSAGE);
                    }
                    break;

                //case 2 - Login
                case 2:
                    emailLogin = JOptionPane.showInputDialog("Digite o seu e-mail: ");
                    senhaLogin = JOptionPane.showInputDialog("Digite a sua senha: ");

                    for (Usuario usuario1 : usuariosCadastrados) {


                        if (emailLogin.equals(usuario1.getEmail()) && senhaLogin.equals(usuario1.getSenha())) {

                            JOptionPane.showMessageDialog(null, "Seja Bem Vindo!");

                            do {
                                opcao2 = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção:" +
                                        "\n<1> Ver perfil " +
                                        "\n<2> Ver lista de amigos" +
                                        "\n<3> Adicionar amigos" +
                                        "\n<4> Excluir amigos" +
                                        "\n<5> Sair"));

                                switch (opcao2) {

                                    //case 1 - Ver perfil do usuário
                                    case 1:
                                        JOptionPane.showMessageDialog(null, usuario1.Perfil());

                                        do {
                                            opcao3 = Integer.parseInt(JOptionPane.showInputDialog("Deseja alterar algum dado? " +
                                                    "\n<1> Sim\n<2> Não"));

                                            switch (opcao3) {

                                                // case 1 - Alterar dados
                                                case 1:

                                                    do {
                                                        opcao4 = Integer.parseInt(JOptionPane.showInputDialog("Qual dado deseja editar:" +
                                                                "\n<1> Nome" +
                                                                "\n<2> Telefone" +
                                                                "\n<3> E-mail" +
                                                                "\n<4> Senha" +
                                                                "\n<5> Data de Nascimento" +
                                                                "\n<6> Gênero" +
                                                                "\n<7> Voltar"));

                                                        //Qual dado será alterado
                                                        switch (opcao4) {
                                                            case 1:
                                                                alteraNome = JOptionPane.showInputDialog("Digite o novo nome");
                                                                usuario1.setNome(alteraNome);
                                                                break;
                                                            case 2:
                                                                alteraTelefone = JOptionPane.showInputDialog("Digite o  novo telefone: ");
                                                                usuario1.setTelefone(alteraTelefone);
                                                                break;
                                                            case 3:
                                                                alteraEmail = JOptionPane.showInputDialog("Digite o novo E-mail: ");
                                                                usuario1.setEmail(alteraEmail);
                                                                break;
                                                            case 4:
                                                                confirmaSenha2 = JOptionPane.showInputDialog("Digite a senha antiga: ");

                                                                if (usuario1.getSenha().equals(confirmaSenha2)) {
                                                                    alteraSenha = JOptionPane.showInputDialog("Digite a nova senha: ");
                                                                    usuario1.setSenha(alteraSenha);
                                                                } else {
                                                                    JOptionPane.showMessageDialog(null, "Senha incorreta.\nTente novamente.");
                                                                }
                                                                break;
                                                            case 5:
                                                                alteraDataNascimento = JOptionPane.showInputDialog("Digite a nova data de nascimento: ");
                                                                usuario1.setDataNascimento(alteraDataNascimento);
                                                                break;
                                                            case 6:
                                                                alteraGenero = JOptionPane.showInputDialog("Digite o novo gênero: ");
                                                                usuario1.setGenero(alteraGenero);
                                                                break;
                                                            case 7:
                                                                opcao3=2;
                                                            default:
                                                                JOptionPane.showMessageDialog(null,"Opção inválida");
                                                                break;
                                                        }
                                                    }
                                                    while (opcao4 != 7);
                                                    break;
                                            }
                                        }
                                        while (opcao3 != 2);
                                        break;

                                    //Case 2 - Ver lista de amigos
                                    case 2:
                                        if (amigosAdicionados != null) {

                                            for (Amigo amigo1 :amigosAdicionados) {
                                                JOptionPane.showMessageDialog(null,
                                                        "Nome: " + amigo1.getNome(), "Amigos", JOptionPane.DEFAULT_OPTION);
                                            }
                                        } else {
                                            JOptionPane.showMessageDialog(null, "Você ainda não adicionou nenhum amigo"
                                            );
                                        }
                                        break;

                                    //Case 3 - Adicionar amigos
                                    case 3:
                                        for (Usuario usuario2 : usuariosCadastrados) {

                                           do{
                                                JOptionPane.showMessageDialog(null,
                                                        "Nome: " + usuario2.getNome(), "Usuários", JOptionPane.DEFAULT_OPTION);

                                                opcao5 = Integer.parseInt(JOptionPane.showInputDialog("Deseja adicionar esta pessoa a sua lista de amigos? " +
                                                        "\n\n<1> Sim" +
                                                        "\n<2> Não" +
                                                        "\n<3> Voltar"));

                                                if(opcao5==1) {
                                                    Amigo amigo = new Amigo(usuario2.getNome());
                                                    amigosAdicionados.add(amigo);
                                                    amigo.Incluir(usuario2);
                                                    JOptionPane.showMessageDialog(null, "Amigo adicionado com sucesso!");
                                                    break;
                                                }
                                                else if(opcao5==2){
                                                        JOptionPane.showMessageDialog(null, "Próximo usuário.");
                                                        break;
                                                }
                                                else if(opcao5==3){
                                                    JOptionPane.showMessageDialog(null, "Voltando ao menu anterior");
                                                    break;
                                                }
                                                else{
                                                    JOptionPane.showMessageDialog(null, "Opção inválida");
                                                    break;
                                                }
                                            }
                                            while (opcao5 != 3);
                                        }
                                        break;

                                    //Case 4 - Desfazer amizade
                                    case 4:

                                        for (Amigo amigo2 :amigosAdicionados) {

                                            do {
                                                JOptionPane.showMessageDialog(null,
                                                        "Nome: " + amigo2.getNome(), "Amigos", JOptionPane.DEFAULT_OPTION);

                                                opcao6 = Integer.parseInt(JOptionPane.showInputDialog("Deseja excluir esta pessoa da sua lista de amigos?" +
                                                        "\n\n<1> Sim" +
                                                        "\n<2> Não" +
                                                        "\n<3> Voltar"));

                                                   if(opcao6==1) {
                                                       amigosAdicionados.remove(amigo2);
                                                       amigo2.Excluir(usuario1);
                                                       JOptionPane.showMessageDialog(null, "Amigo excluido com sucesso!");
                                                       break;
                                                   }
                                                    else if(opcao6==2) {
                                                       JOptionPane.showMessageDialog(null, "Próximo Amigo.");
                                                       break;
                                                   }
                                                    else if(opcao6==3) {
                                                       JOptionPane.showMessageDialog(null, "Voltando ao menu anterior");
                                                       break;
                                                   }
                                                    else {
                                                       JOptionPane.showMessageDialog(null, "Opção inválida");
                                                       break;
                                                   }


                                            }

                                            while (opcao6 != 3);
                                        }
                                        break;

                                    default:
                                        JOptionPane.showMessageDialog(null,"Opção inválida");
                                        break;
                                }

                            }
                            while (opcao2 != 5);
                        }
                        else {
                            JOptionPane.showMessageDialog(null, "Senha ou e-mail incorretos!", "Erro", JOptionPane.WARNING_MESSAGE);
                            break;
                        }
                    }
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Opção inválida");
                    break;
            }
        }
        while (opcao1 != 3);

    }

}
