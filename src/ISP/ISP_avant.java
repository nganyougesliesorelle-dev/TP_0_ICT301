package ISP;

public class ISP_avant {
    public interface Phone {
        void call();
        void sendSms();
        void takePhoto();
        void browseInternet();
    }

    // Pour un iPhone, pas de problème
    public class IPhone implements Phone {
        public void call() { /* ... */ }
        public void sendSms() { /* ... */ }
        public void takePhoto() { /* ... */ }
        public void browseInternet() { /* ... */ }
    }

    // Mais pour un vieux téléphone fixe ?
    public class OldNokia implements Phone {
        public void call() { /* ... */ }
        public void sendSms() { /* ... */ }


        public void takePhoto() { throw new UnsupportedOperationException(); }
        public void browseInternet() { throw new UnsupportedOperationException(); }
    }
}
