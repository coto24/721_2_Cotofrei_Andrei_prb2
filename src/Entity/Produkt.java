package Entity;

import java.util.Objects;

public class Produkt {
    private String Name;
    private int Preis;
    private int SKU;
    private int Anzahl;

    public Produkt(String name, int preis, int SKU, int anzahl) {
        Name = name;
        Preis = preis;
        this.SKU = SKU;
        Anzahl = anzahl;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getPreis() {
        return Preis;
    }

    public void setPreis(int preis) {
        Preis = preis;
    }

    public int getSKU() {
        return SKU;
    }

    public void setSKU(int SKU) {
        this.SKU = SKU;
    }

    public int getAnzahl() {
        return Anzahl;
    }

    public void setAnzahl(int anzahl) {
        Anzahl = anzahl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produkt produkt = (Produkt) o;
        return SKU == produkt.SKU || Objects.equals(Name, produkt.Name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(SKU);
    }

    @Override
    public String toString() {
        return "Produkt{" +
                "Name='" + Name + '\'' +
                ", Preis=" + Preis +
                ", SKU=" + SKU +
                ", Anzahl=" + Anzahl +
                '}';
    }
}
