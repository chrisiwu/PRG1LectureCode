package at.ac.hcw.block09.exercises.exercise01.rpg;

public class Troll extends NonPlayerCharacter implements TurnToStone {
    public Troll(String name) {
        super(name, 160, 25);
    }

    @Override
    public void takeDamage(int amount) {
        health -= amount;
        System.out.println(this.name + " takes " + amount + " damage! (HP now: " + this.health + ")");
    }

    @Override
    public void fight(NonPlayerCharacter target) {
        System.out.println(this.name + " attacks " + target.name + " for " + this.attackPower + " damage.");
        target.takeDamage(this.attackPower);
    }

    @Override
    public void turnToStone() {
        System.out.println(this.name + " turns to stone when sun is shining!");
    }
}
