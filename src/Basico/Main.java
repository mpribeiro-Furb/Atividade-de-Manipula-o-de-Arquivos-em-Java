package Basico;

import java.io.File;

public class Main {
    static void main(String[] args) {
        CriarPasta criarDiretorio = new CriarPasta();
        ListarArquivos lista = new ListarArquivos();

        File pasta = new File("C:\\Users\\mpribeiro\\Documents\\");

        lista.listarArquivosPasta(pasta);


    }
}
