package com.example.cguo.hackillinois2019optum;
import java.util.*;

public class ModifiedData {

    private HashMap<Integer, List<Patient>> clusters = new HashMap<>();
    private HashMap<Integer, List<Employee>> clusterNurses = new HashMap<>();

    private class SortByDate implements Comparator<Patient>
    {
        // Used for sorting in ascending order of
        // roll number
        public int compare(Patient a, Patient b)
        {
            return a.getDaysTill() - b.getDaysTill();
        }
    }



    public void populateClusterMap(List<Patient> patients) {
        for (int i = 1; i <= 19; i++) {
            ArrayList<Patient> clusterPatients = new ArrayList<>();
            for (Patient patient : patients) {
                if (patient.getCluster() == i) {
                    clusterPatients.add(patient);
                }
                Collections.sort(clusterPatients, new SortByDate());
            }
            clusters.put(i, clusterPatients);
        }

        //System.out.println(clusters);

    }

    public void populateNursesMap(List<Employee> employees) {
        for (int i = 1; i <= 19; i++) {
            ArrayList<Employee> nurses = new ArrayList<>();
            for (Employee employee : employees) {
                if (employee.getCluster() == i) {
                    nurses.add(employee);
                }
            }
            this.clusterNurses.put(i, nurses);
        }

        //System.out.println(clusters);

    }

    public HashMap<Integer, List<Patient>> getClusters() {
        return clusters;
    }

    public HashMap<Integer, List<Employee>> getClusterNurses() {
        return clusterNurses;
    }
}
