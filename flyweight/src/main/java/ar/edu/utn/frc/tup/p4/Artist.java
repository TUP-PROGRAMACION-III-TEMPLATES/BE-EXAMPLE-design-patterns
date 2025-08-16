package ar.edu.utn.frc.tup.p4;

import lombok.Getter;

@Getter
public class Artist {
    private final String name;

    public Artist(String name) {
        this.name = name;
        System.out.println("New Artist created: " + name);
    }
}
