package Repository;

import Entity.Produkt;

import java.util.ArrayList;
import java.util.List;

public class Repo implements CRUDRepo<Produkt>{

    private List<Produkt> list;

    public Repo() {
        this.list = new ArrayList<>();
    }

    /**
     * @return all entities
     */
    @Override
    public List<Produkt> getAll() {
        return list;
    }

    /**
     * saves given entity
     *
     * @param entity entity must be not null
     */
    @Override
    public void add(Produkt entity) {
        if(entity==null)
            throw new Error();
        list.add(entity);
    }

    /**
     * removes the entity with the specified id
     *
     */
    @Override
    public void deleteById(int id) {
        for(Produkt aux:list){
            if(aux.getSKU()==id) {
                list.remove(aux);
                return;
            }
        }
    }

    /**
     * updates given entity
     *
     * @param entity entity must not be null
     */
    @Override
    public void update(Produkt entity) {
        if(entity==null)
            throw new Error();
        for(Produkt aux:list){
            if(aux.equals(entity)){
                aux.setAnzahl(entity.getAnzahl());
                aux.setPreis(entity.getPreis());
                aux.setName(entity.getName());
            }
        }
    }
}
