package homeworks.hw1.scooter;

import java.util.ArrayList;
import java.util.List;

public class RentalCompany extends Scooter { // Subclass of Scooter to not create same variables again and again
    List<Scooter> scooters = new ArrayList<>();

    // Method to get a list of available scooters
    // @return List of available scooters
    public List<Scooter> availableScooters() {
        List<Scooter> result = new ArrayList<>();
        for (Scooter scooter : scooters) {
            if (scooter.isAvailable()) {
                result.add(scooter);
            }
        }
        return result;
    }

    // Method to add a scooter to the rental company
    // @param scooter The scooter to be added
    public void addScooter(Scooter scooter) {
        scooter.setId(id++); // Assign a unique ID to the scooter
        scooters.add(scooter); // Add the scooter to the list of scooters
    }

    // Method to remove a scooter from the rental company by its ID
    // @param id the ID of the scooter to be removed
    // @return True if the scooter was successfully removed, false otherwise
    public boolean removeScooter(int id) {
        boolean removed = false;
        for (Scooter scooter : scooters) {
            if (scooter.getId() == id) {
                scooters.remove(scooter); // Remove the scooter from the list
                removed = true;
                break;
            }
        }
        return removed; // Return true if the scooter was successfully removed, false otherwise.
    }

    // Method to rent a scooter by its ID
    // @param id The ID of the scooter to be rented
    public void rentScooter(int id) {
        for (Scooter scooter : scooters) {
            if (scooter.getId() == id && scooter.isAvailable()) {
                scooter.setAvailable(false); // Mark the scooter as not available after renting
                // Print a message indicating whether the rent was successful or not (due to the scooter not being available)
                System.out.println("Scooter '" + scooter.getModel() + "' with ID " + id + " has been rented.");
                break;
            } else {
                System.out.println("Scooter '" + scooter.getModel() + "' with ID " + id + " is not available.");
            }
        }
    }

    /**
     * Method for returning a rented scooter
     *
     * @param id The ID of the scooter to be returned
     * @param x  The X coordinate of the return location
     * @param y  The Y coordinate of the return location
     */
    public void returnScooter(int id, double x, double y) {
        for (Scooter scooter : scooters) {
            if (scooter.getId() == id && !scooter.isAvailable()) {
                scooter.setAvailable(true); // Mark the scooter as available after returning
                System.out.println("Scooter '" + scooter.getModel() + "' with ID " + id + " has been returned at coordinates x:'" + x + "' and y:'" + y + "'.");
                break;
            }
        }
    }

    // Method to display information about all scooters in the company
    public void displayAllScooters() {
        for (Scooter scooter : scooters) {
            System.out.println(scooter.toString());
        }
    }
}