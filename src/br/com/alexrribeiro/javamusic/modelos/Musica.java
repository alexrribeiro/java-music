package br.com.alexrribeiro.javamusic.modelos;

import br.com.alexrribeiro.javamusic.modelos.Audio;

public class Musica extends Audio {
    private String artista;
    private String album;
    private String genero;

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public boolean estaEmAlta() {
        if (getCurtidas() > 100) {
            return true;
        } else {
            return false;
        }
    }

    public void exibirInformacoes() {
        String informacoes = """
                Título: %s
                Artista: %s
                Álbum: %s
                Gênero: %s
                Duração: %d min
                Reproduções: %d
                Curtidas: %d
                Avaliação: %d
                """
                .formatted(
                        getTitulo(),
                        getArtista(),
                        getAlbum(),
                        getGenero(),
                        getDuracao(),
                        getTotalReproducoes(),
                        getCurtidas(),
                        getClassificacao()
                );
        System.out.println(informacoes);
    }
}
