class Human extends Character implements Playable {
    public Human(String name) {
        super(name, 100, 20);
    }

    @Override
    public void takeDamage(int amount) {
        setHealth(getHealth() - amount);
    }

    @Override
    public boolean isAlive() {
        return getHealth() > 0;
    }

    @Override
    public void useAbility(Character target) {
        System.out.println(getName() + " uses Healing ability!");
        setHealth(getHealth() + 15);
    }

    @Override
    public void attack(Character target) {
        System.out.println(getName() + " attacks " + target.getName());
        target.takeDamage(getDamage());
    }
}
