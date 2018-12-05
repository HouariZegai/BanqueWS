
public class Main {

    public static void main(String[] args) {
        try { // appel de l'opération "plus" du service Web
            org.me.banque.BanqueWS_Service service = new org.me.banque.BanqueWS_Service();
            org.me.banque.BanqueWS port = service.getBanqueWSPort();
            
            double montant = 10000;
            double result = port.retirer(montant);
            
            System.out.println("Solde = " + result);
        } catch (Exception ex) {
        }
    }
}
