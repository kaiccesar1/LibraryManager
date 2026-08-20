package service;

import model.Livro;

import java.util.ArrayList;
import java.util.List;


public class BibliotecaService {
    List<Livro> livros = new ArrayList<>();
    int id = 1;

    public void cadastrar(String name, String autor){
        livros.add(new Livro(id, name, autor, true));
        id += 1;
    }

    public void listarLivros(){
        for(Livro livro : livros){
            System.out.println(livro);
        }
    }

    public void listarLivroId(int id) {
        for (Livro livro : livros) {
            if (livro.getId() == id) {
                System.out.println(livro);
            }
        }
    }
}
