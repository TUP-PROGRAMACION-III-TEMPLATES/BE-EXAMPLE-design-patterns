package ar.edu.utn.frc.tup.p4;

public class MusicPlayerContext {
    private PlayerState currentState;

    public MusicPlayerContext() {
        // Initial state is Stopped.
        this.currentState = new StoppedState(this);
    }

    public void setState(PlayerState state) {
        this.currentState = state;
    }

    public void play() {
        currentState.handlePlay();
    }

    public void pause() {
        currentState.handlePause();
    }

    public void stop() {
        currentState.handleStop();
    }
}
