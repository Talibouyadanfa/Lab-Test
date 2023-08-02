package ept.git.Composite;

import java.util.ArrayList;
import java.util.List;
import ept.git.Component;


// Équipe (Composite)
public class Equipe implements Component {
    private final String nom;
    private final List<Component> employes;

    public Equipe(String nom) {
        this.nom = nom;
        this.employes = new ArrayList<>();
    }

    public void ajouter(Component component) {
        employes.add(component);
    }

    public String getNom() {
        return nom;
    }


    public double calculerSalaireTotal() {
        double salaireTotal = 0;
        for (Component component : employes) {
            salaireTotal += component.calculerSalaireTotal();
        }
        return salaireTotal;
    }

    public Component rechercherEmploye(String nom) {
        for (Component component : employes) {
            if (component.getNom().equals(nom)) {
                return component;
            }
        }
        return null;
    }

    public void deplacerEmploye(Component employe, Component nouvelleEquipe) {
        if (employes.contains(employe)) {
            employes.remove(employe);
            nouvelleEquipe.ajouter(employe);
        }
    }
}
