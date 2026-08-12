package mate.academy.service;

public interface GenericService<T> {
    T add(T element);

    T get(Long id);
}
