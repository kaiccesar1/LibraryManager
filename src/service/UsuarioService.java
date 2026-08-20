package service;

import model.Usuario;

import java.util.ArrayList;
import java.util.List;

public class UsuarioService {
    List<Usuario> list = new ArrayList<>();

    public void cadastrarUsuario(Usuario user){
        list.add(user);
        System.out.println("Cadastrado com sucesso!");
    }

    public void listarUsuarios(){
        for(Usuario user : list){
            System.out.println(user);
        }
    }
}
