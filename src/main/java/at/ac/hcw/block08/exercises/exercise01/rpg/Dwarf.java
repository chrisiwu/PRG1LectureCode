package at.ac.hcw.block08.exercises.exercise01.rpg;

public class Dwarf extends NonPlayerCharacter {
    public Dwarf(String name) {
        super(name, 110, 18);
    }

    @Override
    public void takeDamage(int amount) {
        System.out.println(this.name + " (Dwarf) resists 5 points of damage!");
        super.takeDamage(amount - 5);
    }
}