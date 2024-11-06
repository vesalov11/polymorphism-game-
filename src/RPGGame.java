import java.util.Random;

public class RPGGame {
    public static void main(String[] args) {
        Character[] characters = {
                new Human("Arthur"),
                new Orc("Grom"),
                new Elf("Legolas")
        };

        Random random = new Random();
        int rounds = 10;

        System.out.println("Battle starts!");

        for (int i = 0; i < rounds; i++) {
            System.out.println("\n--- Round " + (i + 1) + " ---");

            for (Character character : characters) {
                if (character.isAlive()) {
                    character.showInfo();
                }
            }

            Character attacker = characters[random.nextInt(characters.length)];
            Character target;

            do {
                target = characters[random.nextInt(characters.length)];
            } while (target == attacker || !target.isAlive());

            if (attacker instanceof Playable) {
                if (random.nextBoolean()) {
                    ((Playable) attacker).attack(target);
                } else {
                    attacker.useAbility(target);
                }
            }

            if (!target.isAlive()) {
                System.out.println(target.getName() + " has been defeated!");
            }
        }

        Character winner = characters[0];
        for (Character character : characters) {
            if (character.isAlive() && character.getHealth() > winner.getHealth()) {
                winner = character;
            }
        }

        System.out.println("\nThe battle is over!");
        System.out.println("Winner: " + winner.getName() + " with health: " + winner.getHealth());
    }
}
