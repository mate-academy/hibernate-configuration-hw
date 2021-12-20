package mate.academy.service;

import java.util.Optional;

public interface GenericService<T> {
    T add(T t);

    T get(Long id);
}
