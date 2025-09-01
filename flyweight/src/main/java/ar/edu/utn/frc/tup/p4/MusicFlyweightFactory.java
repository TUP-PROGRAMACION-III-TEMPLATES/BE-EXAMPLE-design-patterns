package ar.edu.utn.frc.tup.p4;

import java.util.HashMap;
import java.util.Map;

public class MusicFlyweightFactory {

    private static final Map<String, Artist> artists = new HashMap<>();
    private static final Map<String, Album> albums = new HashMap<>();

    public static Artist getArtist(String name) {
        Artist artist = artists.get(name);

        if (artist == null) {
            artist = new Artist(name);
            artists.put(name, artist);
        }

        return artist;
    }

    public static Album getAlbum(String title, Artist artist) {
        String key = title + "::" + artist.getName();

        Album album = albums.get(key);

        if (album == null) {
            album = new Album(title, artist);
            albums.put(key, album);
        }

        return album;
    }
}
