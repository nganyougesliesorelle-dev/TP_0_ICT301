package DIP;

public class DIP_avant {
    public class LightBulb {
        public void turnOn() { System.out.println("Ampoule allumée"); }
        public void turnOff() { System.out.println("Ampoule éteinte"); }
    }

    public class Switch {
        private LightBulb bulb = new LightBulb(); // DÉPENDANCE DIRECTE (Mauvais)

        public void operate() {
            bulb.turnOn();
        }
    }
}
