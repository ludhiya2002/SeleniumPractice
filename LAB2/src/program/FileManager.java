package program;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class FileManager{

    public void writeToFile(customer[] customers) {
        try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("customer.obj"))) {
            os.writeObject(customers);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readFromFile() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("customer.obj"))) {
            customer[] customers = (customer[]) ois.readObject();
            for (customer customer : customers) {
                System.out.println("Customer ID: " + customer.getId() +
                        ", Name: " + customer.getName() +
                        ", Email: " + customer.getEmail() +
                        ", Phone: " + customer.getPhone());
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        customer[] customers = {
                new customer(1, "Ludhiya", "ludhiya2002@gmail.com", "1234567890"),
                new customer(2, "Sampath", "sampathkumar765@gmail.com", "0987654321"),
                new customer(3, "Neelamma", "neelamma345@gmail.com", "1122334455")
        };

        FileManager fileManager = new FileManager();
        fileManager.writeToFile(customers);
        fileManager.readFromFile();
    }
}

