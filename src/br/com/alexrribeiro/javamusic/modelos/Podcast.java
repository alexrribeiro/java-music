package br.com.alexrribeiro.javamusic.modelos;

import br.com.alexrribeiro.javamusic.modelos.Audio;

public class Podcast extends Audio {
    private String apresentador; // host
    private String assunto;
    private String descricao;

    public String getApresentador() {
        return apresentador;
    }

    public void setApresentador(String apresentador) {
        this.apresentador = apresentador;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public boolean estaEmAlta() {
        if (getTotalReproducoes() > 1000){
            return true;
        } else {
            return false;
        }
    }

    public void exibirInformacoes() {
        String informacoes = """
                Título: %s
                Apresentador: %s
                Assunto: %s
                Duração: %d min
                Descrição: %s
                Reproduções: %d
                Curtidas: %d
                Avaliação: %d
                """
                .formatted(
                        getTitulo(),
                        getApresentador(),
                        getAssunto(),
                        getDuracao(),
                        getDescricao(),
                        getTotalReproducoes(),
                        getCurtidas(),
                        getClassificacao()
                );
        System.out.println(informacoes);
    }
}
