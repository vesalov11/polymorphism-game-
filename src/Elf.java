class Elf extends Character implements Playable {
    public Elf(String name) {
        super(name, 90, 25);
    }

    @Override
    public void takeDamage(int amount) {
        setHealth(getHealth() - amount / 2); // Reduces damage due to Dodge ability
    }

    @Override
    public boolean isAlive() {
        return getHealth() > 0;
    }

    @Override
    public void useAbility(Character target) {
        System.out.println(getName() + " uses Dodge ability!");
    }

    @Override
    public void attack(Character target) {
        System.out.println(getName() + " attacks " + target.getName());
        target.takeDamage(getDamage());
    }
}
