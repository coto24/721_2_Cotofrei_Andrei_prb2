package Controller;

import Entity.Produkt;
import Repository.Repo;

import java.util.List;
import java.util.Map;

public class Controller {
    Repo repo;

    public Controller(Repo repo) {
        this.repo = repo;
    }

    public List<Produkt> getAll(){
        return repo.getAll();
    }

    public void add(String name, int sku, int preis, int anzahl){
        repo.add(new Produkt(name, preis, sku, anzahl));
    }

    public void delete(int id){
        repo.deleteById(id);
    }

    public void update(String name, int sku, int preis, int anzahl){
            repo.update(new Produkt(name,preis,sku,anzahl));
    }

    public void update_inventory(Map<String,Integer> aux){
        repo.getAll().stream()
                .forEach(p->p.setAnzahl(p.getAnzahl() - aux.get(p.getName())));
    }

    public String show_updates(){
        String aux= "";
        for(Produkt p:repo.getAll())
            aux+=p.getName()+" "+p.getAnzahl();
        return aux;
    }
}
