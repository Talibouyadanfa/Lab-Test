package ept.git;

public interface Component {
    String getNom();
    double calculerSalaireTotal();
    void deplacerEmploye(Component employe, Component nouvelleEquipe);

    void ajouter(Component employe);
}
