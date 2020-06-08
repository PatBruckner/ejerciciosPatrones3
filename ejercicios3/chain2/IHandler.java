package chain2;


public interface IHandler {
    enum order {
        ENTREVISTA,
        DISCIPLINA,
        DESBLOQUEO,
        LIMPIEZA
    }

    void setNext(IHandler handler);

    IHandler next();

    void criteriaHandler(order order);
}
