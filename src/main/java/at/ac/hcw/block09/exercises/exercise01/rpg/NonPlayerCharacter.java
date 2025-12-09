package at.ac.hcw.block09.exercises.exercise01.rpg;

/* extend your RPG from last time using
     abstract classes and interfaces:
   make NPC class abstract and decide
     which methods to make abstract or
     leave concrete respectively
   create a Trader interface that is
     implemented by Elfs and Dwarfs
   in your main method, let your objects
     trade some goods, calling the
     interface methods
   create a new class Troll that
     inherits from NPC
   create a new interface TurnToStone
     that enables Troll objects to turn
     into stone (e.g. when sun is shining)
   design some further extensions to our RPG ... */

public abstract class NonPlayerCharacter {
    protected String name;
    protected int health;
    protected int attackPower;

    public NonPlayerCharacter(String name, int health, int attackPower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }

    public abstract void takeDamage(int amount);

    public abstract void fight(NonPlayerCharacter target);

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