package homeworks.hw1.scooter;

public class Scooter {

    // Unique identifier for the scooter.
    protected int id;

    // Model name of the scooter (e.g., Sparrow X10).
    String model;

    // Current battery level (percentage).
    int batteryLevel;

    // Scooter location;
    double x, y;

    // Indicates if the scooter is available
    boolean available;

    // Get the unique identifier of the scooter
    public int getId() {
        return id;
    }

    // Set the unique identifier of the scooter
    public void setId(int id) {
        this.id = id;
    }

    // Get the model name of the scooter
    public String getModel() {
        return model;
    }

    // Set the model name of the scooter
    public void setModel(String model) {
        this.model = model;
    }

    // Get the current battery level of the scooter
    public int getBatteryLevel() {
        return batteryLevel;
    }

    // Set the current battery level of the scooter
    public void setBatteryLevel(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    // Get the X coordinate of the scooter's location
    public double getX() {
        return x;
    }

    // Set the X coordinate of the scooter's location
    public void setX(double x) {
        this.x = x;
    }

    // Get the Y coordinate of the scooter's location
    public double getY() {
        return y;
    }

    // Set the Y coordinate of the scooter's location
    public void setY(double y) {
        this.y = y;
    }

    // Check if the scooter is available for use by returning the value of boolean 'available' (either true or false)
    public boolean isAvailable() {
        return available;
    }

    // Set the availability status of the scooter (true or false)
    public void setAvailable(boolean available) {
        this.available = available;
    }

    // Generate a scooter representation of the scooter object
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Scooter{");
        sb.append("id=").append(id); // Append scooter's unique identifier
        sb.append(", model='").append(model).append('\''); // Append scooter's model name
        sb.append(", batteryLevel=").append(batteryLevel); // Append scooter's battery level
        sb.append(", x=").append(x); // Append scooter's X coordinate
        sb.append(", y=").append(y); // Append scooter's Y coordinate
        sb.append(", available=").append(available); // Append scooter's availability status
        sb.append('}');
        return sb.toString(); // Return the constructed string
    }
}
