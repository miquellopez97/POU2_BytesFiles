package lasalle;

import java.io.Serializable;
import java.util.ArrayList;

public class Alumne implements Serializable {
    private String nom;
    private ArrayList<Integer> notes;
    private float notaMitja;

    public Alumne(String nom, ArrayList<Integer> notes, Float notaMitja) {
        this.nom = nom;
        this.notes = notes;
        this.notaMitja = notaMitja;
    }

    @Override
    public String toString() {
        return "Alumne{" +
                "nom='" + nom + '\'' +
                ", notes=" + notes +
                ", notaMitja=" + notaMitja +
                '}';
    }
}
