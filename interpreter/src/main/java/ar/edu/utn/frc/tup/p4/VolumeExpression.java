package ar.edu.utn.frc.tup.p4;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class VolumeExpression implements Expression {
    private final int volume;

    @Override
    public void interpret(PlaybackContext context) {
        context.adjustVolume(volume);
    }
}
