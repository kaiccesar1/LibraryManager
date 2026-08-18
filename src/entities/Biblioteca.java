package entities;

import java.util.ArrayList;
import java.util.List;


public class Biblioteca implements OperacoesBiblioteca{
    List<Livro> livros = new ArrayList<>();
    int id = 1;

    @Override
    public void cadastrar(String name, String autor){
        livros.add(new Livro(id, name, autor, true));
        id += 1;
    }

//    public void cadastrarLivro(String titulo, String autor){
//        Livro livro = new Livro(id, titulo, autor, true);
//        livros.add(livro);
//
//        id++;
//    }


    public void listarLivros(){
        for(Livro livro : livros){
            System.out.println(livro);
        }
    }

    public void listarLivro(int id){
        for(Livro livro : livros){
            if(livro.getId() == id){
                System.out.println(livro);
            }
        }
    }
}
