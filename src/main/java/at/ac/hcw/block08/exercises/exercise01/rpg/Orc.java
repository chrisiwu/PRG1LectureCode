package at.ac.hcw.block08.exercises.exercise01.rpg;

public class Orc extends NonPlayerCharacter {
    public Orc(String name) {
        super(name, 120, 30);
    }

    @Override
    public void fight(NonPlayerCharacter target) {
        int extra = (this.health > 80) ? 10 : 0;
        int totalDamage = this.attackPower + extra;

        System.out.println(this.name + " (Orc) attacks with ferocity " + target.name + " for " + totalDamage + " damage.");
        target.takeDamage(totalDamage);
    }
}