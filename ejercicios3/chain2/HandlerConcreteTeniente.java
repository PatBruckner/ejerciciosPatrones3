package chain2;

public class HandlerConcreteTeniente implements IHandler {

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
    public void criteriaHandler(order order) {
        if (order == IHandler.order.DISCIPLINA) {
            System.out.println("Proceso Atendio por: Teniente");
        } else {
            next.criteriaHandler(order);
        }

    }
}
