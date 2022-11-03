package model;
import java.util.Date;

import state.Postado;
import state.State;

public class Remessa {
    private int protocolo;
    private double peso;
    private double altura;
    private double largura;
    private double profundidade;
    private Pessoa remetente;
    private Pessoa destinatario;
    private State estado;
    private Date dataEnvio;
    private Date dataRecebimento;
    
    public Remessa(double peso, double altura, double largura, double profundidade, Pessoa remetente,
            Pessoa destinatario) {
        this.peso = peso;
        this.altura = altura;
        this.largura = largura;
        this.profundidade = profundidade;
        this.remetente = remetente;
        this.destinatario = destinatario;
        this.estado = new Postado(this);
    }

    public String getSituacao() {
        return estado.getSituacao();
    }

    public String preverEntrega() {
        return estado.preverEntrega();
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getProfundidade() {
        return profundidade;
    }

    public void setProfundidade(double profundidade) {
        this.profundidade = profundidade;
    }

    public Pessoa getRemetente() {
        return remetente;
    }

    public void setRemetente(Pessoa remetente) {
        this.remetente = remetente;
    }

    public Pessoa getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(Pessoa destinatario) {
        this.destinatario = destinatario;
    }

    public State getEstado() {
        return estado;
    }

    public void setEstado(State estado) {
        this.estado = estado;
    }

    public Date getDataEnvio() {
        return dataEnvio;
    }

    public void setDataEnvio(Date dataEnvio) {
        this.dataEnvio = dataEnvio;
        estado.tratar();
    }

    public Date getDataRecebimento() {
        return dataRecebimento;
    }

    public void setDataRecebimento(Date dataRecebimento) {
        this.dataRecebimento = dataRecebimento;
        estado.tratar();
    }

    public int getProtocolo() {
        return protocolo;
    }

    public void setProtocolo(int protocolo) {
        this.protocolo = protocolo;
    }

    
}
