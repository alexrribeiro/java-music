package br.com.alexrribeiro.javamusic.modelos;

public class Audio {
    private String titulo;
    private int duracao;
    private int totalReproducoes;
    private int curtidas;
    private int classificacao;
    private int totalAvaliacoes;
    private int somaAvaliacoes;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public int getTotalReproducoes() {
        return totalReproducoes;
    }

    public int reproduzir() {
        return totalReproducoes += 1;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public int curtir() {
        return curtidas += 1;
    }

    public int getClassificacao() {
        classificacao = (int) retornarMedia() / 2;
        return classificacao;
    }

    public void avaliar(double nota) {
        somaAvaliacoes += nota;
        totalAvaliacoes++;
    }

    public double retornarMedia() {
        return somaAvaliacoes / totalAvaliacoes;
    }

    public void exibirInformacoes() {
        System.out.println("Exibindo informações...");
    }

    public boolean estaEmAlta() {
        return false;
    }
}
