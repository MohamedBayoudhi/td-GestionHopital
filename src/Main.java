public class Main {
    //Ici, je vais tester les fonctionnalités des autres classes.
    public static void main(String[] args) {
        // tout d'abord création d'instances de Medecin et Patient pour les tests
        Medecin medecin1 = new Medecin(12345678, "Ali", "Ben Jommaa", 789);
        Medecin medecin2 = new Medecin(11524789, "Mohsen", "Rabhi", 456);

        Patient patient1 = new Patient(11125318, "Mohamed ", "Bayoudhi", 123);
        Patient patient2 = new Patient(18546324, "Hazem", "Jbehi", 437);
        Patient patient3 = new Patient(54876598, "Ines", "Sghayer", 787);

        // test de la classe ListPatients
        ListPatients listPatients = new ListPatients();
        listPatients.ajouterPatient(patient1);
        listPatients.ajouterPatient(patient2);
        listPatients.afficherPatients();

        // Test de la classe SetMedecins
        SetMedecins setMedecins = new SetMedecins();
        setMedecins.ajouterMedecin(medecin1);
        setMedecins.ajouterMedecin(medecin2);
        setMedecins.afficherMedecins();
        System.out.println("Nombre de médecins : " + setMedecins.nombreMedecins());

        // Test de la classe Hopital
        Hopital hopital = new Hopital();
        hopital.ajouterMedecin(medecin1);
        hopital.ajouterMedecin(medecin2);
        hopital.ajouterPatient(medecin1, patient1);
        hopital.ajouterPatient(medecin1, patient2);
        hopital.ajouterPatient(medecin2, patient3);
        hopital.afficherMap();
        hopital.afficherMedecinPatients(medecin1);
        hopital.afficherMedecinPatients(medecin2);
    }
}
