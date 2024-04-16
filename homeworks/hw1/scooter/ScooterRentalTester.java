package homeworks.hw1.scooter;

public class ScooterRentalTester {

    public static void main(String[] args) {
        RentalCompany company = new RentalCompany();

        // Create and add some scooters to the rental company
        Scooter scooter1 = new Scooter();
        scooter1.setModel("Sparrow X10");
        scooter1.setBatteryLevel(80);
        scooter1.setX(41.752861824954145); // Arbitrary home coordinates
        scooter1.setY(44.83697384876083);
        scooter1.setAvailable(true); // Available initially
        company.addScooter(scooter1); // Add scooter after defining the properties

        Scooter scooter2 = new Scooter();
        scooter2.setModel("Zingo Z5");
        scooter2.setBatteryLevel(65);
        scooter2.setX(41.752861824954145); // Arbitrary home coordinates
        scooter2.setY(44.83697384876083);
        scooter2.setAvailable(true); // Available initially
        company.addScooter(scooter2); // Add after defining all the properties

        company.displayAllScooters(); // Displays all scooters and info about them

        // Rent the scooter and go from home to the University
        company.rentScooter(scooter1.getId());
        scooter1.setX(41.7121106); // University coordinates
        scooter1.setY(44.7489232);

        // Leave the scooter at the University
        company.returnScooter(scooter1.getId(), 41.7121106, 44.7489232);

        // Wait for 1 hour; To test the program, feel free to lower the value inside the parentheses
        try {
            Thread.sleep(3600000); // Sleep for 1 hour (1 hour = 3600000 milliseconds)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Rent the scooter again after 1 hour
        company.rentScooter(scooter1.getId());
        scooter1.setX(41.752861824954145); // Arbitrary home coordinates
        scooter1.setY(44.83697384876083);

        // Leave the scooter near home
        company.returnScooter(scooter1.getId(), 41.752861824954145, 44.83697384876083);

        // Display all scooters
        company.displayAllScooters(); // Display the second time to demonstrate change in coordinates
    }
}
