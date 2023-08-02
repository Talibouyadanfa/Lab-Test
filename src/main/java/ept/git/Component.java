package ept.git;

public interface Component {
    String getNom();

    double calculerSalaireTotal();
    Component rechercherEmploye(String nom);
    void deplacerEmploye(Component employe, Component nouvelleEquipe);

    void ajouter(Component employe);
}
