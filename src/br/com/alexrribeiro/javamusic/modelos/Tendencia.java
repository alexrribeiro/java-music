package br.com.alexrribeiro.javamusic.modelos;

public class Tendencia {
    public void incluir(Audio audio) {
        if (audio.estaEmAlta() == true) {
            System.out.println(audio.getTitulo() + " está em alta.");
        } else {
            System.out.println(audio.getTitulo() + " é uma opção para você ouvir agora.");
        }
    }
}
