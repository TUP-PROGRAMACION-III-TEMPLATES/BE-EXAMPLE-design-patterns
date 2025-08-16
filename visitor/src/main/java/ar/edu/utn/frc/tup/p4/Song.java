package ar.edu.utn.frc.tup.p4;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Song implements MusicComponent {
    private final String title;
    private final int durationInSeconds;

    @Override
    public void accept(MusicVisitor visitor) {
        visitor.visit(this);
    }
}
