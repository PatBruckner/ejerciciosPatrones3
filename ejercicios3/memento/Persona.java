package memento;

public class Persona {
    private String name;
    private int id;
    private int edad;

    public Persona(String name, int id, int edad) {
        this.name = name;
        this.id = id;
        this.edad = edad;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
