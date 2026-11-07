package Basico;

import java.io.File;

public class ListarArquivos {

    public void listarArquivosPasta(File caminho){
        File[] arquivos = caminho.listFiles();

        for (File item : arquivos){
            System.out.println("\n---------------");
            if (item.isDirectory()){
                System.out.println("É um diretorio");
            } else {
                System.out.println("É um arquivo");
            }

            System.out.println("Nome: "+item.getName());
            System.out.println(item.length()+" Bytes");
            System.out.println("----------------\n");
        }
    }
}
