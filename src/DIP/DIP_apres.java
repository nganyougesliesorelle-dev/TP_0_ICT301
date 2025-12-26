package DIP;

public class DIP_apres {
    public interface Switchable {
        void turnOn();
        void turnOff();
    }
    public class LightBulb implements Switchable {
        public void turnOn() { System.out.println("Lumière allumée"); }
        public void turnOff() { System.out.println("Lumière éteinte"); }
    }

    public class Fan implements Switchable {
        public void turnOn() { System.out.println("Ventilateur tourne"); }
        public void turnOff() { System.out.println("Ventilateur arrêté"); }
    }
    public class Switch {
        private Switchable device;

        // On "injecte" l'appareil (on ne le crée pas à l'intérieur)
        public Switch(Switchable device) {
            this.device = device;
        }

        public void operate() {
            device.turnOn();
        }
    }
}
