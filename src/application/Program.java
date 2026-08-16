package application;

import java.util.InputMismatchException;
import java.util.Scanner;

import entities.Biblioteca;
import entities.Livro;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();

        int opcao = 1;


        try {
            while(opcao != 0) {

                System.out.println("===== Library Manager =====");
                System.out.println("1 - Cadastrar livro");
                System.out.println("2 - Lista livros");
                System.out.println("3 - Buscar livro");
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

                        biblioteca.cadastrarLivro(titulo, autor);
                        break;
                    case 2:
                        biblioteca.listarLivros();
                        break;
                    case 3:
                        System.out.print("Informe o ID do livro: ");
                        int id = sc.nextInt();
                        sc.nextLine();

                        biblioteca.listarLivro(id);
                        break;
                }
            }
        } catch (InputMismatchException e){
            System.out.println("Descrição do erro: " + e.getMessage());
        }
    }
}
