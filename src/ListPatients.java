import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListPatients implements InterfacePatient {
    private List<Patient> listP;

    public ListPatients() {
        this.listP = new ArrayList<>();
    }

    public void ajouterPatient(Patient p) {
        listP.add(p);
    }

    public void supprimerPatient(Patient p) {
        listP.remove(p);
    }

    public boolean rechercherPatient(Patient p) {
        return listP.stream().anyMatch(patient -> patient.equals(p));
    }

    public boolean rechercherPatient(int cin) {
        return listP.stream().anyMatch(patient -> patient.getCin() == cin);
    }

    public void afficherPatients() {
        listP.forEach(System.out::println);
    }

    public void trierPatientsParNom() {
        listP = listP.stream()
                .sorted((p1, p2) -> p1.getNom().compareToIgnoreCase(p2.getNom()))
                .collect(Collectors.toList());
    }

    public void PatientSansRedondance() {
        listP.stream().distinct().forEach(System.out::println);
    }
}
