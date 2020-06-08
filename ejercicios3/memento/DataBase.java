package memento;

import java.util.ArrayList;

public class DataBase {
    private ArrayList<Persona> dataBase;

    public DataBase(ArrayList<Persona> dataBase) {
        this.dataBase = dataBase;
    }

    public void showData() {
        for (int i = 0; i < dataBase.size(); i++) {
            System.out.println("Persona: " + dataBase.get(i).getName() + ", " + dataBase.get(i).getId() + ", " + dataBase.get(i).getEdad());
        }
    }

    public void setPersona(Persona persona) {
        dataBase.add(persona);
    }
}