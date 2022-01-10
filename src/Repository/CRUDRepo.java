package Repository;

import java.util.List;

public interface CRUDRepo<E> {

    /**
     * @return all entities
     */
    List<E> getAll();

    /**
     * saves given entity
     * @param entity entity must be not null
     */
    void add(E entity);

    /**
     * removes the entity with the specified id
     * @param entity entity must not be null
     *
     */
    void delete(E entity);

    /**
     * updates given entity
     * @param entity entity must not be null
     */
    void update(E entity);

}
