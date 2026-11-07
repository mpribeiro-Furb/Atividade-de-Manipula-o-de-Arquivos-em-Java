package Basico;

import java.io.File;

public class CriarPasta {
    public void criarPasta(File caminho){

        if (caminho.exists()){
            System.out.print("Pasta já existe");
        } else {
            caminho.mkdir();
            System.out.println("Criado");
        }
    }
}
