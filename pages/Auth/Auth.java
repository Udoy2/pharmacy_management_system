package pages.Auth;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Auth {
    private static final String FILE_NAME = "db/currentLogged.csv";

    public static void login(int userId, String email, String name) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            writer.write(userId + "," + email + "," + name);
            writer.newLine();
            writer.close();
        }

        
    }

    public static boolean check() throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            return reader.readLine() != null;
        }
    }

    public static void logout() throws IOException {
        String[] lines = null;
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            lines = reader.lines().skip(1).toArray(String[]::new);
        }
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (String line : lines) {
                writer.write(line);
                writer.newLine();
            }
        }
    }

    public static String[] getAuth() throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String firstLine = reader.readLine();
            if (firstLine != null) {
                
                return firstLine.split(",");
            } else {
                
                return null;
            }
        }
    }



}
