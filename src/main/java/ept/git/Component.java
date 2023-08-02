package ept.git;

public interface Component {
    String getNom();
    void afficherDetails();
    double calculerSalaireTotal();
    Component rechercherEmploye(String nom);
    void deplacerEmploye(Component employe, Component nouvelleEquipe);
    void supprimer();

    void ajouter(Component employe);
}
