package ar.edu.utn.frc.tup.p4;

public interface SoundEffectHandler {

    void applyEffect(Song song);

    void setNextHandler(SoundEffectHandler nextHandler);
}
