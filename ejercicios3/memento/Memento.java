package memento;

public class Memento {
    private DataBase state;

    public Memento(DataBase stateSaved) {
        this.state = stateSaved;
    }

    public DataBase getState() {
        return state;
    }

    public void setState(DataBase state) {
        this.state = state;
    }
}
