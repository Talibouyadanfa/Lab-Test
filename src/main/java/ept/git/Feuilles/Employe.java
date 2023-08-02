package ept.git.Feuilles;

import ept.git.Component;


// Employé (Feuille)
public class Employe implements Component {
    private final String nom;
    private final double salaire;

    public Employe(String nom, double salaire) {
        this.nom = nom;
        this.salaire = salaire;
    }

    public String getNom() {
        return nom;
    }

    public double calculerSalaireTotal() {
        return salaire;
    }

    public Component rechercherEmploye(String nom) {
        if (this.nom.equals(nom)) {
            return this;
        }
        return null;
    }

    public void deplacerEmploye(Component employe, Component nouvelleEquipe) {
        // Ne fait rien, car un employé ne peut pas déplacer d'autres employés
    }


    @Override
    public void ajouter(Component employe) {

    }
}
