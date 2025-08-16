package ar.edu.utn.frc.tup.p4;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class StoppedState implements PlayerState {
    private final MusicPlayerContext player;

    @Override
    public void handlePlay() {
        System.out.println("Player: Starting playback from stop.");
        player.setState(new PlayingState(player));
    }

    @Override
    public void handlePause() {
        System.out.println("Player is stopped. Cannot pause.");
    }

    @Override
    public void handleStop() {
        System.out.println("Player is already stopped. No change.");
    }
}
