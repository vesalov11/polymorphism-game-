class Orc extends Character implements Playable {
    public Orc(String name) {
        super(name, 80, 30);
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
        System.out.println(getName() + " uses Berserk ability!");
        target.takeDamage(getDamage() * 2);
    }

    @Override
    public void attack(Character target) {
        System.out.println(getName() + " attacks " + target.getName());
        target.takeDamage(getDamage());
    }
}
