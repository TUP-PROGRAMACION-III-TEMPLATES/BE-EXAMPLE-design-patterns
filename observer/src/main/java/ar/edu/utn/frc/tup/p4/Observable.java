package ar.edu.utn.frc.tup.p4;

public interface Observable {

    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
