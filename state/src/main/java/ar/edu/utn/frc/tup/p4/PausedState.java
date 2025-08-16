package ar.edu.utn.frc.tup.p4;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PausedState implements PlayerState {
    private final MusicPlayerContext player;

    @Override
    public void handlePlay() {
        System.out.println("Player: Resuming playback from pause.");
        player.setState(new PlayingState(player));
    }

    @Override
    public void handlePause() {
        System.out.println("Player is already paused. No change.");
    }

    @Override
    public void handleStop() {
        System.out.println("Player: Stopping playback from pause.");
        player.setState(new StoppedState(player));
    }
}
