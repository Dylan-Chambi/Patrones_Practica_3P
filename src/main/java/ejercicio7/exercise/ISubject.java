package ejercicio7.exercise;

public interface ISubject {
    void subscribir(IDueniosEmpresa observer);
    void desubscribir(IDueniosEmpresa observer);
    void notifyObservers(String msg);
}
