package ar.edu.utn.frc.tup.p4;

public interface MusicVisitor {
    void visit(Song song);
    void visit(Playlist playlist);
}
