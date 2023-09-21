package br.com.alexrribeiro.javamusic.principal;

import br.com.alexrribeiro.javamusic.modelos.Musica;
import br.com.alexrribeiro.javamusic.modelos.Podcast;
import br.com.alexrribeiro.javamusic.modelos.Tendencia;

public class Principal {
    public static void main(String[] args) {
        Musica musica = new Musica();
        Podcast podcast = new Podcast();
        Tendencia tendencia = new Tendencia();

        musica.setTitulo("Snap");
        musica.setArtista("Rosa Linn");
        musica.setGenero("Pop");
        podcast.setTitulo("...");
        musica.setDuracao(3);
        podcast.setDuracao(30);
        for (int i = 0; i < 356; i++) {
            musica.reproduzir();
        }
        for (int i = 0; i < 189; i++) {
            musica.curtir();
        }

        musica.avaliar(10);
        musica.avaliar(4);
        musica.avaliar(8);
        podcast.reproduzir();
        podcast.reproduzir();
        podcast.curtir();
        podcast.avaliar(9);
        podcast.avaliar(3);

        musica.exibirInformacoes();
        podcast.exibirInformacoes();

        tendencia.incluir(musica);
        tendencia.incluir(podcast);
    }
}
