package mate.academy.service;

import java.util.List;

public interface GenerisService<T> {
    T add(T element);

    T get(Long id);

    List<T> getAll();

    T update(T element);

    boolean delete(Long id);
}
