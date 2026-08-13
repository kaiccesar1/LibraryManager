package entities;

import java.util.ArrayList;
import java.util.List;


public class Biblioteca {
    List<Livro> livros = new ArrayList<>();
    private int id = 1;

    public void cadastrarLivro(String titulo, String autor){
        Livro livro = new Livro(id, titulo, autor, true);
        livros.add(livro);

        id++;
    }


    public void listarLivros(){
        for(Livro livro : livros){
            System.out.println(livro);
        }
    }
}
