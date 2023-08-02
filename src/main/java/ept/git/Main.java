package ept.git;


import ept.git.Composite.Equipe;
import ept.git.Feuilles.Employe;

public class Main {
    public static void main(String[] args) {
        // Création de la structure hiérarchique de l'entreprise

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



        equipeA1.ajouter(employe1);
        equipeA1.ajouter(employe2);
        equipeA2.ajouter(employe3);
        equipeA2.ajouter(employe4);
        equipeB1.ajouter(employe5);
        equipeB1.ajouter(employe6);
        equipeB2.ajouter(employe7);
        equipeB2.ajouter(employe8);


        // Calcul du salaire total de l'entreprise en se basant sur les equipes.
        double salaireTotal2 = equipeA1.calculerSalaireTotal()+ equipeA2.calculerSalaireTotal()+ equipeB1.calculerSalaireTotal()+ equipeB2.calculerSalaireTotal();
        System.out.println("Salaire total de l'entreprise : " + salaireTotal2);

        // Déplacer un employé d'une équipe à une autre
        Component employeDeplacer = equipeA1.rechercherEmploye("Employé 2");
        if (employeDeplacer != null) {
            equipeA1.deplacerEmploye(employeDeplacer, equipeA2);
            System.out.println("Employé déplacé avec succès.");
        } else {
            System.out.println("Employé à déplacer non trouvé.");
        }


    }
}
