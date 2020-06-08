package memento2;

public class Client {

    public static void main(String[] args) {
        CareTaker versionador = new CareTaker();
        Originator originator = new Originator();

        Tesis tesis;

        tesis = new Tesis("Tesis de grado");
        originator.setState(tesis);
        versionador.addMemento(originator.createMemento(), " version1");

        tesis = new Tesis("Tesis de grado - UPB");
        originator.setState(tesis);
        versionador.addMemento(originator.createMemento(), " version2");

        tesis = new Tesis("Tesis de grado - Universidad Privada Boliviana");
        originator.setState(tesis);
        versionador.addMemento(originator.createMemento(), "version3");

        tesis = new Tesis("Tesis de Grado - Universidad Privada BolivianA");
        originator.setState(tesis);
        versionador.addMemento(originator.createMemento(), "version4");

        tesis = new Tesis("Tesis de Grado - Universidad Privada BolivianA");
        originator.setState(tesis);
        versionador.addMemento(originator.createMemento(), "version5");

        originator.restoreFromMemento(versionador.getMemento("version3"));
    }
}
