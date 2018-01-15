package facade.complex;

public class Autentification {
    String token;

    public String generateToken(String name, String password) {
        return "token";
    }

    public boolean isAuthentificated() {
        System.out.println("authentification");
        if (token == null) {
            token = generateToken("name", "pass");
            if (token == null) {
                return false;
            }
        }
        return true;
    }
}
