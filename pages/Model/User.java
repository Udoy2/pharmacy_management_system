package pages.Model;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.*;

public class User {
    private static final String FILENAME = "db/users.csv";



    public static void createUser(String name, String email, String password) {
        int id = getNextId();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILENAME, true))) {
            String line = String.format("%d,%s,%s,%s\n", id, name, email, password);
            writer.write(line);
            System.out.printf("User %s created with ID %d\n", name, id);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void deleteUser(int userId) {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILENAME));
                PrintWriter writer = new PrintWriter(new FileWriter(FILENAME + ".tmp"))) {
            String line;
            boolean found = false;
            while ((line = reader.readLine()) != null) {
                String[] fields = line.split(",");
                int id = Integer.parseInt(fields[0]);
                if (id == userId) {
                    found = true;
                } else {
                    writer.println(line);
                }
            }
            if (found) {
                reader.close();
                writer.close();
                Files.move(Paths.get(FILENAME + ".tmp"), Paths.get(FILENAME), StandardCopyOption.REPLACE_EXISTING);
                System.out.printf("Deleted user with ID %d\n", userId);
            } else {
                Files.deleteIfExists(Paths.get(FILENAME + ".tmp"));
                System.out.printf("User with ID %d not found\n", userId);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void editUser(int userId, String userName, String userEmail, String userPassword) {

        try (BufferedReader reader = new BufferedReader(new FileReader(FILENAME));
                PrintWriter writer = new PrintWriter(new FileWriter(FILENAME + ".tmp"))) {
            String line;
            boolean found = false;
            while ((line = reader.readLine()) != null) {
                String[] fields = line.split(",");
                int id = Integer.parseInt(fields[0]);
                if (id == userId) {
                    writer.printf("%d,%s,%s,%s\n", userId, userName, userEmail, userPassword);
                    found = true;
                } else {
                    writer.println(line);
                }
            }
            if (found) {
                // Close the file before moving it
                reader.close();
                writer.close();
                Files.move(Paths.get(FILENAME + ".tmp"), Paths.get(FILENAME), StandardCopyOption.REPLACE_EXISTING);
                System.out.printf("Edited user with ID %d\n", userId);
            } else {
                Files.deleteIfExists(Paths.get(FILENAME + ".tmp"));
                System.out.printf("User with ID %d not found\n", userId);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static int getNextId() {
        int id = 1;
        try (BufferedReader reader = new BufferedReader(new FileReader(FILENAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] fields = line.split(",");
                int currentId = Integer.parseInt(fields[0]);
                if (currentId >= id) {
                    id = currentId + 1;
                }
            }
        } catch (FileNotFoundException e) {
            // Ignore, file does not exist yet
        } catch (IOException e) {
            e.printStackTrace();
        }
        return id;
    }

    public static List<String> getUser(int userId) {
        List<String> userInfo = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILENAME))) {
            String line;
            boolean found = false;
            while ((line = reader.readLine()) != null) {
                String[] fields = line.split(",");
                int id = Integer.parseInt(fields[0]);
                if (id == userId) {
                    userInfo.add(fields[0]); // ID
                    userInfo.add(fields[1]); // Name
                    userInfo.add(fields[2]); // Email
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.printf("User with ID %d not found\n", userId);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return userInfo;
    }

    public static boolean login(String userEmail, String userPassword) {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILENAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] fields = line.split(",");
                String email = fields[2];
                String password = fields[3];
                if (email.equals(userEmail) && password.equals(userPassword)) {
                    return true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
    public static String loggedInId(String userEmail, String userPassword) {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILENAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] fields = line.split(",");
                String email = fields[2];
                String password = fields[3];
                if (email.equals(userEmail) && password.equals(userPassword)) {
                    return fields[0];
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }

}
