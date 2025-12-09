package at.ac.hcw.block09.exercises.exercise01.rpg;

public class Elf extends NonPlayerCharacter implements Trader {
    public Elf(String name) {
        super(name, 90, 20);
    }

    @Override
    public void takeDamage(int amount) {
        if (Math.random() < 0.7) { // 70% chance to take damage
            health -= amount;
            System.out.println(this.name + " takes " + amount + " damage! (HP now: " + this.health + ")");
        } else {
            System.out.println(this.name + " (Elf) dodges the attack!");
        }
    }

    @Override
    public void fight(NonPlayerCharacter target) {
        System.out.println(this.name + " attacks " + target.name + " for " + this.attackPower + " damage.");
        target.takeDamage(this.attackPower);
    }

    @Override
    public void buy(String item) {
        System.out.println(this.name + " buys " + item + '.');
    }

    @Override
    public void sell(String item) {
        System.out.println(this.name + " sells " + item + '.');
    }
}