package memento;

public class Originator {
    private DataBase state;

    public DataBase getState() {
        return state;
    }

    public void setState(DataBase state) {
        System.out.println("Set ----> Object -----");
        //state.showData();
        this.state = state;
    }

    public Memento createMemento() {
        System.out.println("Create ---->  Object  -----");
        //state.showData();
        return new Memento(this.state);
    }

    public void restoreFromMemento(Memento n) {
        this.state = n.getState();
        System.out.println("Restore --- > Object  ");
        this.state.showData();
    }
}