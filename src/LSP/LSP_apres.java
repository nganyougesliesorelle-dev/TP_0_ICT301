package LSP;

public class LSP_apres {
    public class ElectronicDevice {
        public void turnOn() {
            System.out.println("L'appareil s'allume.");
        }
    }
    public class BatteryPoweredDevice extends ElectronicDevice {
        public void chargeBattery() {
            System.out.println("Batterie en charge...");
        }
    }
    public class Smartphone extends BatteryPoweredDevice {
        // Il peut s'allumer ET charger sa batterie.
    }

    public class DeskLamp extends ElectronicDevice {
        // Elle peut s'allumer, mais on ne peut pas l'appeler pour charger une batterie.
    }
}
