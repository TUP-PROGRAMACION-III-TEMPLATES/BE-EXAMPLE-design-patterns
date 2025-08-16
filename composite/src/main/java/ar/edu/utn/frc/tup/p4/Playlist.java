package ar.edu.utn.frc.tup.p4;

import java.util.ArrayList;
import java.util.List;

public class Playlist implements MusicComponent {
    private final String name;
    private final List<MusicComponent> components = new ArrayList<>();

    public Playlist(String name) {
        this.name = name;
    }

    public void add(MusicComponent component) {
        components.add(component);
        System.out.println("Added to playlist '" + name + "': " + component.getClass().getSimpleName());
    }

    public void remove(MusicComponent component) {
        components.remove(component);
        System.out.println("Removed from playlist '" + name + "': " + component.getClass().getSimpleName());
    }

    @Override
    public void play() {
        System.out.println("\nPlaying playlist: '" + name + "'");
        for (MusicComponent component : components) {
            component.play();
        }
    }

    @Override
    public int getDurationInSeconds() {
        int totalDuration = 0;
        for (MusicComponent component : components) {
            totalDuration += component.getDurationInSeconds();
        }
        return totalDuration;
    }
}