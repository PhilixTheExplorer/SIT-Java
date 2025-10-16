class Car {

  int id;
  String brand;
  String color;
  String owner;
  double totalDrivingDist;

  public Car(int id) {
    this.id = id;
  }

  public Car(int id, String brand, String color, String owner) {
    this.id = id;
    this.brand = brand;
    this.color = color;
    this.owner = owner;
  }

  public void setId(int id) {
    this.id = id;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }

  public int getId() {
    return id;
  }

  public String getBrand() {
    return brand;
  }

  public String getColor() {
    return color;
  }

  public String getOwner() {
    return owner;
  }

  public void drive(double dist) {
    totalDrivingDist += dist;
  }

  public double getTotalDrivingDist() {
    return totalDrivingDist;
  }
}

public class CarCaller {

  public static void main(String[] args) {
    Car car1 = new Car(15012016);
    Car car2 = new Car(20022011, "Jajuar XKR-S", "Blue", "Paul");
    Car car3 = new Car(11112015, "Mercedes-AMG GT", "Yello", "Smith");

    car1.setBrand("Lamborghini Veneno");
    car1.setColor("Black");
    car1.setOwner("James");

    car1.drive(120);
    car2.drive(300);
    car2.drive(50);
    car1.drive(15);

    System.out.println("----- car1 Info -----");
    System.out.println(
      "id: " +
      car1.getId() +
      " brand: " +
      car1.getBrand() +
      " color: " +
      car1.getColor() +
      " owner: " +
      car1.getOwner() +
      " total driving distance: " +
      car1.getTotalDrivingDist()
    );

    System.out.println("----- car2 Info -----");
    System.out.println(
      "id: " +
      car2.getId() +
      " brand: " +
      car2.getBrand() +
      " color: " +
      car2.getColor() +
      " owner: " +
      car2.getOwner() +
      " total driving distance: " +
      car2.getTotalDrivingDist()
    );

    System.out.println("----- car3 Info -----");
    System.out.println(
      "id: " +
      car3.getId() +
      " brand: " +
      car3.getBrand() +
      " color: " +
      car3.getColor() +
      " owner: " +
      car3.getOwner() +
      " total driving distance: " +
      car3.getTotalDrivingDist()
    );
  }
}
