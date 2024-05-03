package Assessment;

import java.util.ArrayList;
import java.util.List;

public class stringhandling {
    public static void main(String[] args) {
        String str = "username1+password1-username2+password2-username3+password3.......usernamen+passwordn";

        List<String> usernames = new ArrayList<>();
        List<String> passwords = new ArrayList<>();

        extractUsernamesAndPasswords(str, usernames, passwords);

        // Print usernames and passwords
        for (int i = 0; i < usernames.size(); i++) {
            System.out.println("Username: " + usernames.get(i) + ", Password: " + passwords.get(i));
        }
    }

    public static void extractUsernamesAndPasswords(String str, List<String> usernames, List<String> passwords) {
        String[] pairs = str.split("-");
        for (String pair : pairs) {
            String[] parts = pair.split("\\+");
            if (parts.length == 2) {
                usernames.add(parts[0]);
                passwords.add(parts[1]);
            }
        }
    }
}