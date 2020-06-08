package chain;

public class NotarioHandlerConcrete implements IHandler {

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
        if (!persona.getCertificado()) {
            System.out.println("Proceso Atendido por: Notario");
        } else {
            this.next.criteriaHandler(persona);
        }
    }
}
