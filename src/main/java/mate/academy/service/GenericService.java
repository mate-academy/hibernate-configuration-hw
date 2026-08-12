package mate.academy.service;

public interface GenericService<T, P> {
    T add(T o);

    T get(P id);
}
