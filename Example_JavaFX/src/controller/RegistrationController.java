package controller;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import model.Person;
import view.RegistrationView;

public class RegistrationController {
    private RegistrationView registrationView;

    public RegistrationController(RegistrationView registrationView) {
        this.registrationView = registrationView;
    }

    public void startRegistration() {
        registrationView.showRoleSelectionView();
    }

    public void showRegistrationView(String role) {
        registrationView.showRegistrationView(role);
    }

    public void registerPerson(String role, String fullName, String id, String email, String courseId, String courseName) {
        Person person = new Person(fullName, id, email, courseId, courseName);
        saveToDatabase(person, role + ".csv");
        registrationView.showRegistrationSuccess(role);
    }

    private void saveToDatabase(Person person, String filename) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename, true))) {
            oos.writeObject(person);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Person> loadDatabase(String role) {
        ArrayList<Person> records = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(role + ".csv"))) {
            while (true) {
                Person person = (Person) ois.readObject();
                records.add(person);
            }
        } catch (EOFException e) {
            // End of file reached
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return records;
    }
}
