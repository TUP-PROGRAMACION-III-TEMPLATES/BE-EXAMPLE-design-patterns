package ar.edu.utn.frc.tup.p4;

public class EqualizerStrategyRock extends AbstractEqualizerStrategy {

    public EqualizerStrategyRock(int bass, int mid, int treble) {
        super(bass, mid, treble);
    }

    @Override
    public void adjustFrequencies() {
        System.out.println("Adjusting Frequencies for Rock Style");
    }
}
