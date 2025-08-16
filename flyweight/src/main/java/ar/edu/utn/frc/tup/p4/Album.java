package ar.edu.utn.frc.tup.p4;

import lombok.Getter;

@Getter
public class Album {
    private final String title;
    private final Artist artist;

    public Album(String title, Artist artist) {
        this.title = title;
        this.artist = artist;
        System.out.println("New Album created: " + title);
    }
}
