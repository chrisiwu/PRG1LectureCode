package at.ac.hcw.block08.exercises.exercise01.rpg;

public class Elf extends NonPlayerCharacter {
    public Elf(String name) {
        super(name, 90, 20);
    }

    @Override
    public void takeDamage(int amount) {
        if (Math.random() < 0.7) { // 70% chance to take damage
            super.takeDamage(amount);
        } else {
            System.out.println(this.name + " (Elf) dodges the attack!");
        }
    }
}