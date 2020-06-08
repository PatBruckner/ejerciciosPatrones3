package memento;

import java.util.ArrayList;

public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker backups = new CareTaker(originator);

        DataBase dataBase;

        dataBase = new DataBase(new ArrayList<>());
        dataBase.setPersona(new Persona("Jose", 1234567, 25));
        dataBase.setPersona(new Persona("Juan", 1234568, 19));
        dataBase.setPersona(new Persona("Jhamil", 1234569, 22));
        dataBase.setPersona(new Persona("Jorge", 1234560, 17));
        dataBase.setPersona(new Persona("Jordi", 1234565, 11));
        originator.setState(dataBase);
        backups.addMemento(originator.createMemento());

        dataBase.setPersona(new Persona("Rodrigo", 1234563, 31));
        originator.setState(dataBase);
        backups.addMemento(originator.createMemento());

        dataBase.setPersona(new Persona("Federico", 1234563, 49));
        originator.setState(dataBase);
        backups.addMemento(originator.createMemento());

        dataBase.setPersona(new Persona("Alonso", 1234564, 51));
        originator.setState(dataBase);
        backups.addMemento(originator.createMemento());

        dataBase.setPersona(new Persona("Freddy", 1234563, 46));
        originator.setState(dataBase);
        backups.addMemento(originator.createMemento());

    }
}
