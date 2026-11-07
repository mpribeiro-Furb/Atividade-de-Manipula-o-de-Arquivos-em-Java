package Cadastro_de_Pessoas;

import java.util.ArrayList;
import java.util.List;

public class Main {

    static void main(String[] args) {
        Pessoa p = new Pessoa(1, "Matheus", 20, "123965852");
        Pessoa p1 = new Pessoa(2, "Pedro", 30, "45353135");
        Pessoa p2 = new Pessoa(3, "Juan", 96, "32154343546");


        ArrayList<Pessoa> clsPessoas = new ArrayList<>();
        clsPessoas.addAll(List.of(p, p1, p2));

        PessoaRepository arq = new PessoaRepository();

        arq.salvarPessoa(clsPessoas, "Pessoa2.bin");
        arq.listarPessoas("Pessoa2.bin");
        arq.buscarPorID("Pessoa2.bin",2);

    }
}
