package chain;

public class Client {

    public static void main(String[] args) {
        Organizador organizador = new Organizador();
        Persona persona1 = new Persona(true, true, true);
        Persona persona2 = new Persona(true, true, false);
        Persona persona3 = new Persona(true, false, true);
        Persona persona4 = new Persona(true, false, false);
        Persona persona5 = new Persona(false, true, true);
        Persona persona6 = new Persona(false, true, false);
        Persona persona7 = new Persona(false, false, true);
        Persona persona8 = new Persona(false, false, false);
        organizador.criteriaHandler(persona1);
        organizador.criteriaHandler(persona2);
        organizador.criteriaHandler(persona3);
        organizador.criteriaHandler(persona4);
        organizador.criteriaHandler(persona5);
        organizador.criteriaHandler(persona6);
        organizador.criteriaHandler(persona7);
        organizador.criteriaHandler(persona8);
    }
}
