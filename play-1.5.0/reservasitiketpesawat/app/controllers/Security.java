package controllers;
import models.Pembeli;

public class Security extends Secure.Security {

    // Add a role field
    public static String role;

    static boolean authenticate(String username, String password) {
        Pembeli pembeli = Pembeli.find("byUsernameAndPassword", username, password).first();
        if (pembeli != null) {
            // Determine the user's role based on the username
            role = determineRole(username);
            return true;
        }
        return false;
    }

    // Determine the user's role based on the username
    private static String determineRole(String username) {
        // For simplicity, let's say we determine the role based on the username
        return (username.equals("admin")) ? "administrator" : "user";
    }
}