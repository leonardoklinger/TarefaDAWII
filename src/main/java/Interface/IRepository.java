package Interface;

import Entidades.Leilao;

import java.util.List;

public interface IRepository<T, I> {
    void salva(T t);
    void remove(T t);
    T get(I id);
    List<T> list();
}
