package chain;

public class CajeroHandlerConcrete implements IHandler {

    private IHandler next;

    @Override
    public void setNext(IHandler handler) {
        this.next=handler;
    }

    @Override
    public IHandler next() {
        return this.next;
    }

    @Override
    public void criteriaHandler(Persona persona) {
        if (!persona.getPagoAlBanco()){
            System.out.println("Proceso Atendido por: Atencion del cajero");
        } else {
            next.criteriaHandler(persona);
        }

    }
}
