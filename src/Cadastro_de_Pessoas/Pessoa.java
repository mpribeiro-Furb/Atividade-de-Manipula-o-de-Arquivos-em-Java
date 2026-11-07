package Cadastro_de_Pessoas;

import java.io.Serializable;

public class Pessoa implements Serializable {
    private int codigo;
    private String nome;
    private int idade;
    private String cpf;

    public Pessoa(int codigo, String nome, int idade, String cpf) {
        this.codigo = codigo;
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }


    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
