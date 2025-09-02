package ar.edu.utn.frc.tup.p4;

import java.util.LinkedList;
import java.util.Queue;

public class PlaybackHistory {

    private final Queue<PlaybackState> history = new LinkedList<>();
    private final int capacity;

    public PlaybackHistory(int capacity) {
        this.capacity = capacity;
    }

    public void saveState(PlaybackState memento) {
        if (history.size() >= capacity) {
            history.poll();
        }
        history.offer(memento);
    }

    public PlaybackState restoreState() {
        return history.poll();
    }

    public boolean hasStates() {
        return !history.isEmpty();
    }
}
