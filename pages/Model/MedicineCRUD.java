package pages.Model;
import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;




public class MedicineCRUD {
    private static final String FILENAME = "db/medicine.csv";



    public static void createMedicine(String name, String manufacturer, int stock) {
        int id =  generateNewId();
        String record = id + "," + name + "," + manufacturer + "," + stock;

        try (PrintWriter writer = new PrintWriter(new FileWriter(FILENAME, true))) {
            writer.println(record);
            System.out.println("Record created successfully");
        } catch (IOException e) {
            System.out.println("Error creating record");
        }
    }

    public static int generateNewId() {
        int maxId = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(FILENAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] values = line.split(",");
                int id = Integer.parseInt(values[0]);
                if (id > maxId) {
                    maxId = id;
                }
            }
        } catch (IOException e) {
            // exception handeling
        } catch (NumberFormatException e) {
            // handle the exception...
        }
        
        return maxId + 1;
    }

    // other methods (readRecord, updateRecord, deleteRecord) go here

    public static void updateMedicine(int id, String name, String manufacturer, int stock) {
        // construct the new record to be written to the file
        String newRecord = id + "," + name + "," + manufacturer + "," + stock;

        // set a flag to indicate whether the record was updated or not
        boolean recordUpdated = false;

        try (BufferedReader reader = new BufferedReader(new FileReader(FILENAME))) {
            List<String> updatedRecords = new ArrayList<>();

            // read the existing records from the file
            String line;
            while ((line = reader.readLine()) != null) {
                // split the line into its constituent values
                String[] values = line.split(",");
                int currentId = Integer.parseInt(values[0]);

                // check if this is the record we want to update
                if (currentId == id) {
                    // add the updated record to the list of updated records
                    updatedRecords.add(newRecord);
                    recordUpdated = true;
                } else {
                    // add the original record to the list of updated records
                    updatedRecords.add(line);
                }
            }

            // check if the record was found and updated
            if (!recordUpdated) {
                System.out.println("Record with ID " + id + " not found");
                return;
            }

            // write the updated records back to the file
            try (PrintWriter writer = new PrintWriter(new FileWriter(FILENAME))) {
                for (String record : updatedRecords) {
                    writer.println(record);
                }
                System.out.println("Record updated successfully");
            } catch (IOException e) {
                System.out.println("Error updating record");
            }
        } catch (IOException e) {
            System.out.println("Error updating record");
        } catch (NumberFormatException e) {
            System.out.println("Error parsing ID");
        }
    }

    public static void deleteMedicine(int id) {
        boolean recordDeleted = false;

        try (BufferedReader reader = new BufferedReader(new FileReader(FILENAME))) {
            String line;
            List<String> updatedRecords = new ArrayList<>();
            while ((line = reader.readLine()) != null) {
                String[] values = line.split(",");
                int currentId = Integer.parseInt(values[0]);
                if (currentId == id) {
                    recordDeleted = true;
                } else {
                    updatedRecords.add(line);
                }
            }

            if (!recordDeleted) {
                System.out.println("Record with ID " + id + " not found");
                return;
            }

            try (PrintWriter writer = new PrintWriter(new FileWriter(FILENAME))) {
                for (String record : updatedRecords) {
                    writer.println(record);
                }
                System.out.println("Record deleted successfully");
            } catch (IOException e) {
                System.out.println("Error deleting record");
            }
        } catch (IOException e) {
            System.out.println("Error deleting record");
        }
    }

    public static List<Med> searchMedicine(String name) {
        List<Med> medList = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(FILENAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] values = line.split(",");
                if (name == null || name.isEmpty() || values[1].toLowerCase().contains(name.toLowerCase())) {
                    int id = Integer.parseInt(values[0]);
                    String medName = values[1];
                    String manufacturer = values[2];
                    int stock = Integer.parseInt(values[3]);
                    Med med = new Med(id, medName, manufacturer, stock);
                    medList.add(med);
                }
            }
        } catch (IOException | NumberFormatException e) {
            System.out.println("Error searching medicine");
        }

        return medList;
    }


    // public static void main(String[] args) {
    //     // MedicineCRUD.createMedicine("Aspirin", "Bayer", 100);
    //     // MedicineCRUD.createMedicine("Aspirin", "Bayer", 100);
    //     // MedicineCRUD.createMedicine("Aspirin", "Bayer", 100);
    //     // MedicineCRUD.createMedicine("Aspirin", "Bayer", 100);
    //     // MedicineCRUD.createMedicine("Aspirin", "Bayer", 100);
    //     // MedicineCRUD.createMedicine("Aspirin", "Bayer", 100);
    //     // MedicineCRUD.updateMedicine(1, "Tylenol", "Johnson & Johnson", 50);
    //     // MedicineCRUD.deleteMedicine(5);
    //     // for (Med medicine : MedicineCRUD.searchMedicine("Aspirin")) {
    //     //     System.out.println(medicine.getId());
    //     // }
    
    // }

}
