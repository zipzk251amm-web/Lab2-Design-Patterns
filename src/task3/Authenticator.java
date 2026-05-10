package task3;

public class Authenticator {
    private static volatile Authenticator instance;
    private String loggedUser;
    
    private Authenticator() {
        loggedUser = null;
    }
    
    public static Authenticator getInstance() {
        if (instance == null) {
            synchronized (Authenticator.class) {
                if (instance == null) {
                    instance = new Authenticator();
                }
            }
        }
        return instance;
    }
    
    public void login(String username) {
        loggedUser = username;
        System.out.println("Користувач " + username + " увійшов");
    }
    
    public void logout() {
        System.out.println("Користувач " + loggedUser + " вийшов");
        loggedUser = null;
    }
    
    public String getLoggedUser() { return loggedUser; }
}