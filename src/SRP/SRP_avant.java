package SRP;

public class SRP_avant {
    public class Employee {
        String name;
        double salary;

        // Responsabilité 1 : Infos employé
        public String getName() {
            return name;
        }

        // Responsabilité 2 : Calcul financier (Le problème est ici)
        public double calculatePay() {
            return salary * 0.8; // Déduction de taxes
        }

    }
}
