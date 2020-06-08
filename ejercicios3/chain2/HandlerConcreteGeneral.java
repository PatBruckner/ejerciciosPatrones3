package chain2;

public class HandlerConcreteGeneral implements IHandler {

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
        if (order == IHandler.order.ENTREVISTA) {
            System.out.println("Proceso Atendio por: General");
        } else {
            this.next.criteriaHandler(order);
        }
    }
}