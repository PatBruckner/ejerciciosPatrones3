package chain;

public class Organizador implements IHandler {
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
        CarnetizacionHandlerConcrete handlerConcrete1 = new CarnetizacionHandlerConcrete();
        NotarioHandlerConcrete handlerConcrete2 = new NotarioHandlerConcrete();
        CajeroHandlerConcrete handlerConcrete3 = new CajeroHandlerConcrete();
        AyudaAlClienteHandlerConcrete handlerConcrete4 = new AyudaAlClienteHandlerConcrete();

        this.setNext(handlerConcrete4);
        handlerConcrete4.setNext(handlerConcrete3);
        handlerConcrete3.setNext(handlerConcrete2);
        handlerConcrete2.setNext(handlerConcrete1);

        this.next.criteriaHandler(persona);
    }
}
