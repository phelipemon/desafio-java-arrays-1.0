package br.com.alura.challenges.challenge1;

import org.w3c.dom.ls.LSOutput;

public class Aluno extends Pessoa{

    private int matricula;
    private String curso;

    public Aluno(String nome, int idade, int matricula, String curso) {
        super(nome,idade);
        this.matricula = matricula;
        this.curso = curso;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getCurso() {
        return curso;
    }

    @Override
    public String toString() {
        return super.toString() + " Curso: " + this.getCurso();
    }
}
