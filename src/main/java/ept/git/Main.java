package ept.git;


import ept.git.Composite.Departement;
import ept.git.Composite.Equipe;
import ept.git.Feuilles.Employe;

public class Main {
    public static void main(String[] args) {
        // Création de la structure hiérarchique de l'entreprise
        Departement departementA = new Departement("Département A");
        Departement departementB = new Departement("Département B");

        Equipe equipeA1 = new Equipe("Équipe A1");
        Equipe equipeA2 = new Equipe("Équipe A2");
        Equipe equipeB1 = new Equipe("Équipe B1");
        Equipe equipeB2 = new Equipe("Équipe B2");

        Employe employe1 = new Employe("Employé 1", 5000);
        Employe employe2 = new Employe("Employé 2", 4500);
        Employe employe3 = new Employe("Employé 3", 4800);
        Employe employe4 = new Employe("Employé 4", 5200);
        Employe employe5 = new Employe("Employé 5", 5500);
        Employe employe6 = new Employe("Employé 6", 4600);
        Employe employe7 = new Employe("Employé 7", 4900);
        Employe employe8 = new Employe("Employé 8", 5100);

        departementA.ajouter(equipeA1);
        departementA.ajouter(equipeA2);
        departementB.ajouter(equipeB1);
        departementB.ajouter(equipeB2);

        equipeA1.ajouter(employe1);
        equipeA1.ajouter(employe2);
        equipeA2.ajouter(employe3);
        equipeA2.ajouter(employe4);
        equipeB1.ajouter(employe5);
        equipeB1.ajouter(employe6);
        equipeB2.ajouter(employe7);
        equipeB2.ajouter(employe8);

        // Affichage de la structure hiérarchique de l'entreprise
        System.out.println("Structure hiérarchique de l'entreprise :");
        departementA.afficherDetails();
        departementB.afficherDetails();

        // Calcul du salaire total de l'entreprise
        double salaireTotal = departementA.calculerSalaireTotal() + departementB.calculerSalaireTotal();
        System.out.println("Salaire total de l'entreprise : " + salaireTotal);

        // Recherche d'un employé spécifique
        String nomEmployeRecherche = "Employé 3";
        Component employeRecherche = departementA.rechercherEmploye(nomEmployeRecherche);
        if (employeRecherche != null) {
            System.out.println("Employé trouvé : " + nomEmployeRecherche);
            employeRecherche.afficherDetails();
        } else {
            System.out.println("Employé " + nomEmployeRecherche + " non trouvé.");
        }

        // Déplacer un employé d'une équipe à une autre
        Component employeDeplacer = equipeA1.rechercherEmploye("Employé 2");
        if (employeDeplacer != null) {
            equipeA1.deplacerEmploye(employeDeplacer, equipeA2);
            System.out.println("Employé déplacé avec succès.");
        } else {
            System.out.println("Employé à déplacer non trouvé.");
        }

        // Suppression d'un département
        departementA.supprimer();
    }
}
