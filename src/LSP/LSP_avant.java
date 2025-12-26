package LSP;

public class LSP_avant {
    public class ElectronicDevice {
        public void chargeBattery() {
            System.out.println("Chargement en cours...");
        }
    }

    public class Smartphone extends ElectronicDevice {
        // Tout va bien, un smartphone a une batterie.
    }

    public class DeskLamp extends ElectronicDevice {
        @Override
        public void chargeBattery() {
            // PROBLÈME : Une lampe de bureau est branchée sur secteur, elle n'a pas de batterie !
            throw new RuntimeException("Erreur : Pas de batterie sur cette lampe !");
        }
    }
}
