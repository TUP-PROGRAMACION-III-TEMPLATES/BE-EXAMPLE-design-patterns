package ar.edu.utn.frc.tup.p4;

import lombok.Data;

@Data
public class MusicPlayer {

    public void play() {
        System.out.println("Reproduciendo música...");
    }

    public void pause() {
        System.out.println("Pausando música...");
    }

    public void stop() {
        System.out.println("Deteniendo música...");
    }
}
