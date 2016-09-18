/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vo;

/**
 *
 * @author Administrador
 */
public class Clientes {
    
    private String nome;
    private String cpf;
    private String produto;

    public Clientes() {
    }

    public Clientes(String nome, String cpf, String produto) {
        this.nome = nome;
        this.cpf = cpf;
        this.produto = produto;
    }

    
    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getProduto() {
        return produto;
    }
    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Nome = "+nome+" CPF = "+cpf+" Produto ="+produto;
    }
   
}
