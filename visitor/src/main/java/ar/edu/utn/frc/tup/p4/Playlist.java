package ar.edu.utn.frc.tup.p4;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Playlist implements MusicComponent {
    private final String name;
    private final List<MusicComponent> components = new ArrayList<>();

    public Playlist(String name) {
        this.name = name;
    }

    public void add(MusicComponent component) {
        components.add(component);
    }

    @Override
    public void accept(MusicVisitor visitor) {
        visitor.visit(this);
        for (MusicComponent component : components) {
            component.accept(visitor);
        }
    }
}
