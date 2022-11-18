package mate.academy.dao;

import java.util.Optional;

public interface GenericDao<T, P> {
    T add(T o);

    Optional<T> get(P id);
}
