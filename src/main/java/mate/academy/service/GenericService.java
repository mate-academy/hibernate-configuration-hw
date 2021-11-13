package mate.academy.service;

import java.util.Optional;

public interface GenericService<T> {
    T save(T element);

    T get(Long id);
}
