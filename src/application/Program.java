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
                System.out.println("1 - Cadastrar livro");
                System.out.println("2 - Lista livros");
                System.out.println("3 - Buscar livro");
                System.out.println("4 - Cadastrar usuário");
                System.out.println("5 - Listar usuários");
                System.out.println("0 - Sair");

                System.out.print("Escolha uma opção: ");
                opcao = sc.nextInt();
                sc.nextLine();
                switch (opcao) {
                    case 1:
                        System.out.print("Titulo: ");
                        String titulo = sc.nextLine();

                        System.out.print("Autor: ");
                        String autor = sc.nextLine();

                        biblioteca.cadastrar(titulo, autor);
                        break;
                    case 2:
                        biblioteca.listarLivros();
                        break;
                    case 3:
                        System.out.print("Informe o ID do livro: ");
                        int id = sc.nextInt();
                        sc.nextLine();

                        biblioteca.listarLivroId(id);
                        break;
                    case 4:
                        System.out.print("Nome: ");
                        String nome = sc.nextLine();

                        System.out.print("CPF: ");
                        String cpf = sc.nextLine();

                        System.out.print("E-mail: ");
                        String email = sc.nextLine();

                        usuarioService.cadastrarUsuario(new Usuario(1, nome, cpf, email));
                        break;
                    case 5:
                        usuarioService.listarUsuarios();
                        break;
                }
            }
        } catch (InputMismatchException e){
            System.out.println("Descrição do erro: " + e.getMessage());
        }
    }
}
