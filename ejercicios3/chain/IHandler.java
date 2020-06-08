package chain;


public interface IHandler {

    void setNext(IHandler handler);
    IHandler next();
    void criteriaHandler(Persona persona);   // nuestra peticion

}
