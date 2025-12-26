package ISP;

public class ISP_apres {
    public interface Caller {
        void call();
    }

    public interface SmsSender {
        void sendSms();
    }

    public interface Camera {
        void takePhoto();
    }
    // Le vieux téléphone ne prend que ce dont il a besoin
    public class OldNokia implements Caller, SmsSender {
        public void call() { System.out.println("Appel..."); }
        public void sendSms() { System.out.println("SMS envoyé."); }
    }

    // Le smartphone moderne combine toutes les interfaces
    public class SmartPhone implements Caller, SmsSender, Camera {
        public void call() { /* ... */ }
        public void sendSms() { /* ... */ }
        public void takePhoto() { System.out.println("Photo prise !"); }
    }
}
