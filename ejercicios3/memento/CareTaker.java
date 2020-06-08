package memento;

import java.util.ArrayList;

public class CareTaker {
    private Originator originator;

    public CareTaker(Originator originator) {
        this.originator = originator;
    }

    private ArrayList<Memento> savedStates = new ArrayList<>();

    public void addMemento(Memento memento) {
        this.savedStates.add(memento);
        savedStates.get(0).getState().showData();
        if (savedStates.size() == 5) {
            originator.restoreFromMemento(savedStates.get(0));
        }
    }

    public Memento getMemento(int index) {
        return this.savedStates.get(index);
    }
}