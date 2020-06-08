package chain2;

public class HandlerConcreteCoronel implements IHandler {

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
        if (order == IHandler.order.DESBLOQUEO) {
            System.out.println("Proceso Atendio por: Coronel");
        } else {
            this.next.criteriaHandler(order);
        }

    }
}
