package ar.edu.utn.frc.tup.p4;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PlayingState implements PlayerState {
    private final MusicPlayerContext player;

    @Override
    public void handlePlay() {
        System.out.println("Player is already playing. No change.");
    }

    @Override
    public void handlePause() {
        System.out.println("Player: Pausing playback.");
        player.setState(new PausedState(player));
    }

    @Override
    public void handleStop() {
        System.out.println("Player: Stopping playback.");
        player.setState(new StoppedState(player));
    }
}
