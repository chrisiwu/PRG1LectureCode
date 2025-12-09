package at.ac.hcw.block09.exercises.exercise01.rpg;

public class Orc extends NonPlayerCharacter {
    public Orc(String name) {
        super(name, 120, 30);
    }

    @Override
    public void takeDamage(int amount) {
        health -= amount;
        System.out.println(this.name + " takes " + amount + " damage! (HP now: " + this.health + ")");
    }

    @Override
    public void fight(NonPlayerCharacter target) {
        int extra = (this.health > 80) ? 10 : 0;
        int totalDamage = this.attackPower + extra;

        System.out.println(this.name + " (Orc) attacks with ferocity " + target.name + " for " + totalDamage + " damage.");
        target.takeDamage(totalDamage);
    }
}