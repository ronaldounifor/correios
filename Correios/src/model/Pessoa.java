package model;

import observer.Observador;
import observer.Observavel;

public class Pessoa implements Observador {
    private String endereco;
    private String nome;
    private long id;

    public Pessoa(String endereco, String nome, long id) {
        this.endereco = endereco;
        this.nome = nome;
        this.id = id;
    }
    
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public void atualizar(Observavel observavel) {
        Remessa remessa = (Remessa) observavel;

        System.out.println("RECEBI NOTIFICAÇÃO!");
        System.out.println(remessa);
    }

    
}
