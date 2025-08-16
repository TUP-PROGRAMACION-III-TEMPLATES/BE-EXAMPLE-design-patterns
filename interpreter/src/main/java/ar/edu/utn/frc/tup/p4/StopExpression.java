package ar.edu.utn.frc.tup.p4;

public class StopExpression implements Expression {
    @Override
    public void interpret(PlaybackContext context) {
        context.stop();
    }
}

