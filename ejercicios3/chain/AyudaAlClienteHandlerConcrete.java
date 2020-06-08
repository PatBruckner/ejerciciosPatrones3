package chain;

public class AyudaAlClienteHandlerConcrete implements IHandler {

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
        if (persona.getFicha()) {
            if (!persona.getCertificado() && !persona.getPagoAlBanco()) {
                System.out.println("Proceso Atendio por: Atención al cliente");
            } else {
                next.criteriaHandler(persona);
            }
        } else {
            System.out.println("La persona necesita ficha");
        }
    }
}
