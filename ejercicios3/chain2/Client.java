package chain2;

public class Client {

    public static void main (String [] args){
        Organizador organizador = new Organizador();
        organizador.criteriaHandler(IHandler.order.DISCIPLINA);
    }
}
