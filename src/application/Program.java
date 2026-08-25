package application;

import java.util.InputMismatchException;
import java.util.Scanner;

import service.BibliotecaService;
import model.Usuario;
import service.UsuarioService;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BibliotecaService biblioteca = new BibliotecaService();
        UsuarioService usuarioService = new UsuarioService();

        int opcao = 1;

        try {
            while(opcao != 0) {

                System.out.println("===== Library Manager =====");
                System.out.println("1 - Livros");
                System.out.println("2 - Usuários");
                System.out.println("0 - Sair");

                System.out.print("Escolha uma opção: ");
                opcao = sc.nextInt();
                sc.nextLine();


                switch (opcao){
                    case 1:
                        int opcaoLivro = 1;
                        while(opcaoLivro != 0){
                            System.out.println("===== LIVROS =====");
                            System.out.println("1 - Cadastrar livro");
                            System.out.println("2 - Listrar todos os livros");
                            System.out.println("3 - Listrar livro por ID");
                            System.out.println("0 - Voltar ao menu principal");

                            System.out.print("Digite uma opção: ");
                            opcaoLivro = sc.nextInt();
                            sc.nextLine();

                            switch (opcaoLivro) {
                                case 1:
                                    System.out.print("Nome: ");
                                    String name = sc.nextLine();

                                    System.out.print("Autor: ");
                                    String autor = sc.nextLine();

                                    biblioteca.cadastrar(name, autor);
                                    break;
                                case 2:
                                    biblioteca.listarLivros();
                                    break;
                                case 3:
                                    System.out.print("Informe o ID: ");
                                    int id = sc.nextInt();
                                    sc.nextLine();

                                    biblioteca.listarLivroId(id);
                                    break;
                                case 0:
                                    opcaoLivro = 0;
                                    break;
                            }
                        }

                    case 2:
                        int opcaoUsuario = 1;

                        while(opcaoUsuario != 0){

                            System.out.println("===== USUÁRIOS =====");
                            System.out.println("1 - Cadastrar usuário");
                            System.out.println("2 - Listar todos usuários");
                            System.out.println("0 - Voltar ao menu principal");

                            System.out.print("Digite uma opção: ");
                            opcaoUsuario = sc.nextInt();
                            sc.nextLine();

                            switch (opcaoUsuario){
                                case 1:
                                    System.out.print("Nome: ");
                                    String name = sc.nextLine();

                                    System.out.print("CPF: ");
                                    String cpf = sc.nextLine();

                                    System.out.print("Email: ");
                                    String email = sc.nextLine();

                                    usuarioService.cadastrarUsuario(new Usuario(1, name, cpf, email));
                                    break;
                                case 2:
                                    usuarioService.listarUsuarios();
                                    break;
                                case 0:
                                    opcaoUsuario = 0;
                                    break;
                            }
                        }
                }




//                switch (opcao) {
//                    case 1:
//                        System.out.print("Titulo: ");
//                        String titulo = sc.nextLine();
//
//                        System.out.print("Autor: ");
//                        String autor = sc.nextLine();
//
//                        biblioteca.cadastrar(titulo, autor);
//                        break;
//                    case 2:
//                        biblioteca.listarLivros();
//                        break;
//                    case 3:
//                        System.out.print("Informe o ID do livro: ");
//                        int id = sc.nextInt();
//                        sc.nextLine();
//
//                        biblioteca.listarLivroId(id);
//                        break;
//                    case 4:
//                        System.out.print("Nome: ");
//                        String nome = sc.nextLine();
//
//                        System.out.print("CPF: ");
//                        String cpf = sc.nextLine();
//
//                        System.out.print("E-mail: ");
//                        String email = sc.nextLine();
//
//                        usuarioService.cadastrarUsuario(new Usuario(1, nome, cpf, email));
//                        break;
//                    case 5:
//                        usuarioService.listarUsuarios();
//                        break;
//                }
            }
        } catch (InputMismatchException e){
            System.out.println("Descrição do erro: " + e.getMessage());
        }
    }
}
