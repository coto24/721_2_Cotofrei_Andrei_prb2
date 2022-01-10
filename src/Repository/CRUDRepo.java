package Repository;

import java.util.List;

public interface CRUDRepo<E> {

    /**
     * @return all entities
     */
    List<E> getAll();

    /**
     * saves given entity
     */
    void add(E entity);

    /**
     * removes the entity with the specified id
     *
     */
    void deleteById(int id);

    /**
     * updates given entity
     * @param entity entity must not be null
     */
    void update(E entity);

}
