package chain;

public class CarnetizacionHandlerConcrete implements IHandler {

    private IHandler next;

    @Override
    public void setNext(IHandler handler) {
        this.next = handler;
    }

    @Override
    public IHandler next() {
        return this.next;
    }

    @Override
    public void criteriaHandler(Persona persona) {
        System.out.println("Proceso Atendio por: Responsable de carnetizacion");
    }
}
