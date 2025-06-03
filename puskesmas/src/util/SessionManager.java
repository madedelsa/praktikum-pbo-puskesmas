package util;

public class SessionManager {
    private static String loggedInUsername;
    private static String loggedInRole;

    public static void setLoggedInUser(String username, String role) {
        loggedInUsername = username;
        loggedInRole = role;
    }

    public static String getLoggedInUsername() {
        return loggedInUsername;
    }

    public static String getLoggedInRole() {
        return loggedInRole;
    }

    public static void clearSession() {
        loggedInUsername = null;
        loggedInRole = null;
    }

    public static boolean isLoggedIn() {
        return loggedInUsername != null && loggedInRole != null;
    }
}