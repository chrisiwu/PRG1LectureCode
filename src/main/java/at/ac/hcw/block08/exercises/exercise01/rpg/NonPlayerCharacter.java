package at.ac.hcw.block08.exercises.exercise01.rpg;

/* in our RPG we want to have different kinds
     of NPCs, namely Orcs, Elfs and Dwarfs
   each NPC has the following attributes:
     name, health (int), attackPower (int)
   each NPC has the following methods:
     - takeDamage(int amount): reduces health,
         can be overridden
     - fight(NPC target): deals damage to
         another NPC, can be overridden
     - jump(): print "<ClassName> jumps" to console,
         not allowed to be overridden
     - override the toString method to print
         all stats (attributes)
   the superclass NPC also has a constructor that
     accepts name, health and attackPower as parameters
   write constructors for each subclass that
     only accept the name as parameter
   additionally, call the superclass constructor
     and set the values the following:
     - Orc: health = 120, attackPower = 30
     - Elf: health = 90, attackPower = 20
     - Dwarf: health = 110, attackPower = 18
   special characteristics of subclasses:
     - when orcs attack (fight method) and their health
         is >80, they do an extra damage of 10
     - dwarfs always take a reduced damage by 5
     - elfs have the chance to completely avoid attacks
         (agility), only take damage in 70% of attacks
         – use Math.random()
   create objects of all kinds of characters in
     your Main class and let the games begin! */

public class NonPlayerCharacter {
    protected String name;
    protected int health;
    protected int attackPower;

    public NonPlayerCharacter(String name, int health, int attackPower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }

    public void takeDamage(int amount) {
        health -= amount;
        System.out.println(this.name + " takes " + amount + " damage! (HP now: " + this.health + ")");
    }

    public void fight(NonPlayerCharacter target) {
        System.out.println(this.name + " attacks " + target.name + " for " + this.attackPower + " damage.");
        target.takeDamage(this.attackPower);
    }

    public final void jump() {
        System.out.println(getClass().getSimpleName() + " jumps.");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " - Name: " + this.name +
                ", Health: " + this.health +
                ", Attack Power: " + this.attackPower;
    }
}