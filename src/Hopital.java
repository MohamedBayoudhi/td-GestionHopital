import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Hopital {
    public Map<Medecin, ListPatients> medecinPatients;

    public Hopital() {
        this.medecinPatients = new HashMap<>();
    }

    public void ajouterMedecin(Medecin m) {
        medecinPatients.put(m, new ListPatients());
    }

    public void ajouterPatient(Medecin m, Patient p) {
        if (medecinPatients.containsKey(m)) {
            medecinPatients.get(m).ajouterPatient(p);
        } else {
            ListPatients listPatients = new ListPatients();
            listPatients.ajouterPatient(p);
            medecinPatients.put(m, listPatients);
        }
    }

    public void afficherMap() {
        medecinPatients.forEach((medecin, listPatients) -> {
            System.out.println("Médecin: " + medecin);
            System.out.println("Patients: ");
            listPatients.afficherPatients();
        });
    }

    public void afficherMedecinPatients(Medecin m) {
        if (medecinPatients.containsKey(m)) {
            System.out.println("Médecin: " + m);
            System.out.println("Patients: ");
            medecinPatients.get(m).afficherPatients();
        } else {
            System.out.println("Le médecin n'est pas trouvé dans la carte.");
        }
    }
}
