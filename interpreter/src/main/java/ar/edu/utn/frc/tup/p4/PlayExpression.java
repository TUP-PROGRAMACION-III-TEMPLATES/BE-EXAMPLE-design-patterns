package ar.edu.utn.frc.tup.p4;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PlayExpression implements Expression {
    private final String songName;

    @Override
    public void interpret(PlaybackContext context) {
        context.play(songName);
    }
}
