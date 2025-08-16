package ar.edu.utn.frc.tup.p4;

public class PauseExpression implements Expression {
    @Override
    public void interpret(PlaybackContext context) {
        context.pause();
    }
}
