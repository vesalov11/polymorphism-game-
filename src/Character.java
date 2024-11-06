abstract class Character {
    private String name;
    private int health;
    private int damage;

    public Character(String name, int health, int damage) {
        this.name = name;
        this.health = health;
        this.damage = damage;
    }

    public String getName() { return name; }
    public int getHealth() { return health; }
    public void setHealth(int health) { this.health = health; }
    public int getDamage() { return damage; }

    public abstract void takeDamage(int amount);
    public abstract boolean isAlive();
    public abstract void useAbility(Character target);

    public void showInfo() {
        System.out.println("Name: " + name + ", Health: " + health + ", Damage: " + damage);
    }
}
