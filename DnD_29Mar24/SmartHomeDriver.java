import java.util.Scanner;
import java.util.ArrayList;

public class SmartHomeDriver {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int home_id = sc.nextInt();
        String host_name = sc.next();
        SmartHome myhome = new SmartHome(home_id, host_name);
        int fan_num = sc.nextInt();
        for (int i = 0; i < fan_num; i++) {
            int fan_id = sc.nextInt();
            String fan_name = sc.next();
            String fan_color = sc.next();
            boolean fan_swing = sc.nextBoolean();
            int fan_level = sc.nextInt();
            Fan f = new Fan(fan_id, fan_name, fan_color);
            f.setSwing(fan_swing);
            f.setLevel(fan_level);
            myhome.addDevice(f);
        }
        int light_num = sc.nextInt();
        for (int i = 0; i < light_num; i++) {
            int light_id = sc.nextInt();
            String light_name = sc.next();
            boolean light_auto = sc.nextBoolean();
            Light l = new Light(light_id, light_name, light_auto);
            myhome.addDevice(l);
        }
        int remove_num = sc.nextInt();
        for (int i = 0; i < remove_num; i++) {
            int index = sc.nextInt();
            Device x = myhome.getDevicebyIndex(index);
            myhome.removeDevice(x);
        }

        myhome.reportStatus();
    }
}

class SmartHome {
    private int id;
    private String hostName;
    private ArrayList<Device> devices = new ArrayList<>();

    public SmartHome(int id, String hostName) {
        this.id = id;
        this.hostName = hostName;
    }

    public int getId() {
        return id;
    }

    public void setHostName(String hn) {
        this.hostName = hn;
    }

    public String getHostName() {
        return hostName;
    }

    public void addDevice(Device sd) {
        devices.add(sd);
    }

    public void removeDevice(Device sd) {
        devices.remove(sd);
    }

    public Device getDevicebyIndex(int index) {
        return devices.get(index);
    }

    public void reportStatus() {
        int totalDevices = devices.size();
        System.out.println("Welcome " + getHostName() + " to your home: " + getId());
        System.out.println("Your total devices: " + totalDevices);
        for (int i = 0; i < totalDevices; i++) {
            Device d = devices.get(i);
            System.out.println("|---------------------|");
            System.out.println("Device id: " + d.getId());
            System.out.println("Device name: " + d.getDeviceName());
            System.out.println("Device status: ");
            d.printCurrentStatus();
        }
    }
}

abstract class Device {
    private int id;
    private String deviceName;
    private boolean status;

    public Device(int id, String deviceName) {
        this.id = id;
        this.deviceName = deviceName;
    }

    public int getId() {
        return id;
    }

    public void setDeviceName(String name) {
        this.deviceName = name;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void turnOn() {
        status = true;
    }

    public void turnOff() {
        status = false;
    }

    public boolean getStatus() {
        return status;
    }

    public abstract void printCurrentStatus();
}

class Fan extends Device {
    private String color;
    private boolean swing;
    private int level;

    public Fan(int id, String deviceName, String color) {
        super(id, deviceName);
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setSwing(boolean swing) {
        this.swing = swing;
    }

    public boolean getSwing() {
        return swing;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public void printCurrentStatus() {
        System.out.println("This fan is " + getColor());
        System.out.println("The current status is " + (getStatus() ? "on." : "off."));
        System.out.println("The swing is " + (getSwing() ? "on " : "off ") + "and level is " + getLevel());
    }
}

class Light extends Device {
    private boolean auto;

    public Light(int id, String deviceName, boolean auto) {
        super(id, deviceName);
        this.auto = auto;
    }

    public void setAuto(boolean auto) {
        this.auto = auto;
    }

    public boolean getAuto() {
        return auto;
    }

    public void printCurrentStatus() {
        System.out.println("This light is " + (getAuto() ? "an auto light." : "a normal light."));
    }
}