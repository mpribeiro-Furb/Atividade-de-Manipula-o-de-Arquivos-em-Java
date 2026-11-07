package Cadastro_de_Pessoas;

import java.io.*;
import java.util.ArrayList;

public class PessoaRepository {

    public void salvarPessoa(ArrayList<Pessoa> pessoa, String path){
        File file = new File(path);

        try (FileOutputStream fos = new FileOutputStream(file);
             ObjectOutputStream o = new ObjectOutputStream(fos)) {

            o.writeObject(pessoa);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void listarPessoas(String path){
        File file = new File(path);

        ArrayList<Pessoa> pessoas = new ArrayList<>();

        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);

            pessoas = (ArrayList<Pessoa>) ois.readObject();

            ois.close();
            fis.close();

            for (Pessoa ps : pessoas){
                System.out.println("--------------");
                System.out.println("Nome: "+ ps.getNome());
                System.out.println("Idade: "+ ps.getCpf());
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public void buscarPorID(String path, int ID){
        File file = new File(path);
        ArrayList<Pessoa> listPessoa = null;


        try {
           FileInputStream fis = new FileInputStream(file);
           ObjectInputStream ois = new ObjectInputStream(fis);

           listPessoa = (ArrayList<Pessoa>) ois.readObject();

           for (Pessoa ps : listPessoa){
               if (ps.getCodigo() == ID){
                   System.out.println("ID: "+ ps.getCodigo());
                   System.out.println("Nome: "+ ps.getNome());
                   System.out.println("CPF: "+ ps.getCpf());
                   System.out.println("Idade: "+ ps.getIdade());
                 break;
               }
           }

        } catch (Exception e)  {
            throw new RuntimeException(e);
        }
    }

}
