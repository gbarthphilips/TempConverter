package org.example;

import java.util.Arrays;
import java.util.List;

public class Aluno {
    private String nome;
    private List<Double> notas;

    public Aluno(String nome, double nota1, double nota2, double nota3) {
        this.nome = nome;
        this.notas = Arrays.asList(nota1, nota2, nota3);
    }

    public String getNome() {
        return nome;
    }

    public List<Double> getNotas() {
        return notas;
    }

    public double calcularMedia() {
        return notas.stream().mapToDouble(Double::doubleValue).average().orElse(0);
    }

    public String getSituacao() {
        double media = calcularMedia();
        if (media >= 7) return "Aprovado";
        else if (media >= 5) return "Recuperação";
        else return "Reprovado";
    }

    public void exibirDados() {
        System.out.println("Aluno: " + nome);
        System.out.println("Notas: " + notas);
        System.out.printf("Média: %.2f\n", calcularMedia());
        System.out.println("Situação: " + getSituacao());
    }
}
