package ar.edu.utn.frc.tup.p4;

public class FileExporterVisitor implements MusicVisitor {
    private final StringBuilder exportData = new StringBuilder();

    @Override
    public void visit(Song song) {
        exportData.append("  - Song: '").append(song.getTitle()).append("'\n");
    }

    @Override
    public void visit(Playlist playlist) {
        if (!exportData.isEmpty()) {
            exportData.append("\n");
        }
        exportData.append("Playlist: '").append(playlist.getName()).append("'\n");
    }

    public String getExportedData() {
        return exportData.toString();
    }
}
