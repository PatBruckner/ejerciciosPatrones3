package chain2;

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
    public void criteriaHandler(order order) {
        HandlerConcreteCabo handlerConcrete1 = new HandlerConcreteCabo();
        HandlerConcreteCoronel handlerConcrete2 = new HandlerConcreteCoronel();
        HandlerConcreteTeniente handlerConcrete3 = new HandlerConcreteTeniente();
        HandlerConcreteGeneral handlerConcrete4 = new HandlerConcreteGeneral();

        this.setNext(handlerConcrete1);
        handlerConcrete1.setNext(handlerConcrete2);
        handlerConcrete2.setNext(handlerConcrete3);
        handlerConcrete3.setNext(handlerConcrete4);

        this.next.criteriaHandler(order);
    }
}
