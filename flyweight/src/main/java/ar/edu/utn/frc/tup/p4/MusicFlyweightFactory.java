package ar.edu.utn.frc.tup.p4;

import java.util.HashMap;
import java.util.Map;

public class MusicFlyweightFactory {
    private static final Map<String, Artist> artists = new HashMap<>();
    private static final Map<String, Album> albums = new HashMap<>();

    public static Artist getArtist(String name) {
        return artists.computeIfAbsent(name, Artist::new);
    }

    public static Album getAlbum(String title, Artist artist) {
        return albums.computeIfAbsent(title + "::" + artist.getName(), key -> new Album(title, artist));
    }
}
