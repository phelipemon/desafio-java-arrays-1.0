package br.com.alura.challenges.challenge2;

public class ProdutoPerecivel extends Produto{
    private String dataValidade;
    public ProdutoPerecivel(String nome, String dataValidade){
         super(nome);
         this.dataValidade = dataValidade;
    }

    public String getDataValidade() {
        return dataValidade;
    }
}
