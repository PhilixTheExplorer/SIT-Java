import java.util.ArrayList;

class Player {

  private int id;
  private String name;
  private int level;
  private int money;
  private ArrayList<Character> characters = new ArrayList<>();
  private static int playerCount = 0;

  public Player(String name) {
    this.name = name;
    this.money = 10;
    this.level = 1;
    this.id = playerCount++;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getLevel() {
    return level;
  }

  public int getMoney() {
    return money;
  }

  public void adventure(Character character) {
    if (characters.isEmpty()) {
      System.out.println("You do not own any character");
    } else if (!characters.contains(character)) {
      System.out.println("You do not own this character");
    } else {
      this.level += 5;
      this.money += 10;
      character.increaseLevel(5);
    }
  }

  public void buyCharacter(Character character) {
    int cost = character.getRank() * 5;
    if (cost > 15) {
      System.out.println("The rank of this character are not supported");
    } else if (cost > money) {
      System.out.println("You do not have enough money");
    } else {
      this.money -= cost;
      characters.add(character);
    }
  }

  public void getAllCharacter() {
    for (Character character : characters) {
      System.out.println(character.getName());
    }
  }
}

abstract class Character {

  private String name;
  private int level;
  private int rank;

  public Character(String name, int rank) {
    this.name = name;
    this.rank = rank;
    this.level = 1;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getLevel() {
    return level;
  }

  public void increaseLevel(int level) {
    this.level += level;
  }

  public int getRank() {
    return rank;
  }
}

class Geo extends Character {

  public Geo(String name, int rank) {
    super(name, rank);
  }

  public void stoneStatue(Enemy enemy) {
    double attack = this.getLevel() * 0.2 + this.getRank() * 2;
    enemy.setHealthPoint(enemy.getHealthPoint() - attack);
    if (enemy.getHealthPoint() <= 0) {
      System.out.println("You defeated an enemy");
      this.increaseLevel(1);
    }
  }
}

class Anemo extends Character {

  public Anemo(String name, int rank) {
    super(name, rank);
  }

  public void windFlow(Enemy enemy) {
    double attack = this.getLevel() * 0.5 + this.getRank() * 1.5;
    enemy.setHealthPoint(enemy.getHealthPoint() - attack);
    if (enemy.getHealthPoint() <= 0) {
      System.out.println("You defeated an enemy");
      this.increaseLevel(1);
    }
  }
}

class Electro extends Character {

  public Electro(String name, int rank) {
    super(name, rank);
  }

  public void electricCurrent(Enemy enemy) {
    double attack = this.getLevel() * 0.1 + this.getRank() * 2 + 5;
    enemy.setHealthPoint(enemy.getHealthPoint() - attack);
    if (enemy.getHealthPoint() <= 0) {
      System.out.println("You defeated an enemy");
      this.increaseLevel(1);
    }
  }
}

class Enemy {

  private double healthPoint;

  public Enemy(double healthPoint) {
    this.healthPoint = healthPoint;
  }

  public double getHealthPoint() {
    return healthPoint;
  }

  public void setHealthPoint(double health) {
    this.healthPoint = health;
  }
}

public class AdventureGame {

  public static void main(String[] args) {
    Player p1 = new Player("Float");
    Player p2 = new Player("BABA");
    System.out.println("--------------------------------");
    System.out.println("Player: " + p1.getName());
    System.out.println("Player Id: " + p1.getId());
    System.out.println("Level: " + p1.getLevel() + " Money: " + p1.getMoney());
    System.out.println("--------------------------------");
    System.out.println("Player: " + p2.getName());
    System.out.println("Player Id: " + p2.getId());
    System.out.println("Level: " + p2.getLevel() + " Money: " + p2.getMoney());
    System.out.println("--------------------------------");
    Geo ZhongLi = new Geo("Zhong Li", 3);
    Anemo Venti = new Anemo("Venti", 2);
    Electro RaidenShogun = new Electro("Raiden Shogun", 3);
    Electro Beidou = new Electro("Beidou", 1);
    p1.adventure(Beidou);
    p1.buyCharacter(RaidenShogun);
    p1.buyCharacter(Beidou);
    System.out.println("--------------------------------");
    System.out.println("Player: " + p1.getName());
    System.out.println("Player Id: " + p1.getId());
    System.out.println("Level: " + p1.getLevel() + " Money: " + p1.getMoney());
    System.out.println("--------------------------------");
    System.out.println(
      "Character: " + Beidou.getName() + " Level: " + Beidou.getLevel()
    );
    p1.adventure(Beidou);
    System.out.println("--------------------------------");
    System.out.println("Player: " + p1.getName());
    System.out.println("Player Id: " + p1.getId());
    System.out.println("Level: " + p1.getLevel() + " Money: " + p1.getMoney());
    System.out.println("--------------------------------");

    Enemy e1 = new Enemy(10);
    System.out.println(e1.getHealthPoint());
    Beidou.electricCurrent(e1);
    System.out.println(e1.getHealthPoint());
    Beidou.electricCurrent(e1);
    System.out.println("--------------------------------");
    p1.adventure(RaidenShogun);
    p1.buyCharacter(ZhongLi);
    p1.getAllCharacter();
    p1.adventure(ZhongLi);
    p1.adventure(ZhongLi);
    p1.buyCharacter(RaidenShogun);
    System.out.println("--------------------------------");
    Enemy e2 = new Enemy(5);
    System.out.println("Enemy Health: " + e2.getHealthPoint());
    System.out.println(
      "Character: " + ZhongLi.getName() + " Level: " + ZhongLi.getLevel()
    );
    ZhongLi.stoneStatue(e2);
    System.out.println(
      "Character: " + ZhongLi.getName() + " Level: " + ZhongLi.getLevel()
    );
    System.out.println("--------------------------------");
    Anemo RiceShower = new Anemo("Rice Shower", 500);
    p1.buyCharacter(RiceShower);
  }
}
