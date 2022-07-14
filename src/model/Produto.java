package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Produto {
    
    private Long id;
    private String nome;
    private Integer quantidade;
    private LocalDate dataCriacao;
    private LocalDate vencimento;
    
    public Produto() {
    }
    
    public Produto(Long id, String nome, Integer quantidade, LocalDate dataCriacao, LocalDate vencimento) {
        this.id = id;
        this.nome = nome;
        this.quantidade = quantidade;
        this.dataCriacao = dataCriacao;
        this.vencimento = vencimento;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public LocalDate getVencimento() {
        return vencimento;
    }

    public void setVencimento(LocalDate vencimento) {
        this.vencimento = vencimento;
    }

    public void addItens(int n){
        quantidade += n;
    }

    public void removeItens(int n){
        quantidade -= n;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Id: " + id);
        sb.append("| Nome Produto: " + nome);
        sb.append("| Quantidade: " + quantidade);
        sb.append("| Data Criação: " + dataCriacao.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        sb.append("| Vencimento: " + vencimento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        return sb.toString();
    }
    
}
