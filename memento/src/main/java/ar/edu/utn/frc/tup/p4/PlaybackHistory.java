package ar.edu.utn.frc.tup.p4;

import java.util.LinkedList;
import java.util.Queue;

public class PlaybackHistory {

    private final Queue<PlaybackState> history = new LinkedList<>();
    private final int capacity; // Opcional: límite de elementos en la cola

    public PlaybackHistory(int capacity) {
        this.capacity = capacity;
    }

    // Método para guardar el estado de reproducción actual como un memento
    public void saveState(PlaybackState memento) {
        if (history.size() >= capacity) {
            history.poll(); // elimina el estado más antiguo (FIFO)
        }
        history.offer(memento);
    }

    // Método para obtener el último memento guardado
    public PlaybackState restoreState() {
        return history.poll(); // devuelve y elimina el estado más antiguo
    }

    public boolean hasStates() {
        return !history.isEmpty();
    }
}
