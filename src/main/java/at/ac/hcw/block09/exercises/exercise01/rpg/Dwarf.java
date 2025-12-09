package at.ac.hcw.block09.exercises.exercise01.rpg;

public class Dwarf extends NonPlayerCharacter implements Trader {
    public Dwarf(String name) {
        super(name, 110, 18);
    }

    @Override
    public void takeDamage(int amount) {
        int reducedDamage = amount - 5;

        health -= reducedDamage;
        System.out.println(this.name + " (Dwarf) resists 5 points of damage!");
        System.out.println(this.name + " takes " + reducedDamage + " damage! (HP now: " + this.health + ")");
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