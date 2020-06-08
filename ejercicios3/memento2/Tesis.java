package memento2;

public class Tesis {
    private String name;

    public Tesis(String name) {
        this.name = name;
    }

    public void showData() {
        System.out.println("name: " + this.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
