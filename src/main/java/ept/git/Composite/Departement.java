package ept.git.Composite;


import ept.git.Component;

import java.util.ArrayList;
import java.util.List;
public class Departement implements Component {
    private final String nom;
    private final List<Component> equipeEtEmployes;

    public Departement(String nom) {
        this.nom = nom;
        this.equipeEtEmployes = new ArrayList<>();
    }

    public void ajouter(Component component) {
        equipeEtEmployes.add(component);
    }

    public void supprimer() {
        // Supprimer le département en cascade en supprimant d'abord les équipes et employés
        for (Component component : equipeEtEmployes) {
            component.supprimer();
        }
        equipeEtEmployes.clear();
        System.out.println("Département " + nom + " supprimé.");
    }

    public String getNom() {
        return nom;
    }

    public void afficherDetails() {
        System.out.println("Département : " + nom);
        for (Component component : equipeEtEmployes) {
            component.afficherDetails();
        }
    }

    public double calculerSalaireTotal() {
        double salaireTotal = 0;
        for (Component component : equipeEtEmployes) {
            salaireTotal += component.calculerSalaireTotal();
        }
        return salaireTotal;
    }

    public Component rechercherEmploye(String nom) {
        for (Component component : equipeEtEmployes) {
            Component employeTrouve = component.rechercherEmploye(nom);
            if (employeTrouve != null) {
                return employeTrouve;
            }
        }
        return null;
    }

    public void deplacerEmploye(Component employe, Component nouvelleEquipe) {
        for (Component component : equipeEtEmployes) {
            if (component == employe) {
                equipeEtEmployes.remove(employe);
                nouvelleEquipe.ajouter(employe);
            } else {
                component.deplacerEmploye(employe, nouvelleEquipe);
            }
        }
    }
}
