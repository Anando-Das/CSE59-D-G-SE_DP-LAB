class Sensor {
    String name;
    int batteryLevel;

    public void charge() {
        batteryLevel = 100;
        System.out.println("Sensor fully charged");
    }
}


public class Main4 {
    public static void main(String[] args) {
        
        Sensor p_sensor = new Sensor();

        p_sensor.name = "P sensor A";
        p_sensor.batteryLevel = 12;
        p_sensor.charge();

        System.out.println("New battery level: " + p_sensor.batteryLevel + "%");

    }
}

