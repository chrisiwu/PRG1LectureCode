package at.ac.hcw.block08.exercises.exercise01;

import at.ac.hcw.block08.exercises.exercise01.rpg.Dwarf;
import at.ac.hcw.block08.exercises.exercise01.rpg.Elf;
import at.ac.hcw.block08.exercises.exercise01.rpg.NonPlayerCharacter;
import at.ac.hcw.block08.exercises.exercise01.rpg.Orc;

public class Exercise01 {
    public static void main(String[] args) {
        NonPlayerCharacter orc = new Orc("Gorbag");
        NonPlayerCharacter elf = new Elf("Legolas");
        NonPlayerCharacter dwarf = new Dwarf("Gimli");

        System.out.println(orc);
        System.out.println(elf);
        System.out.println(dwarf);

        System.out.println("\n--- Battle Begins! ---\n");

        orc.fight(elf); // orc attacks elf
        elf.jump(); // elf jumps
        elf.fight(orc); // elf attacks orc
        dwarf.fight(orc); // dwarf attacks orc
        orc.fight(dwarf); // orc attacks dwarf
        dwarf.jump(); // dwarf jumps

        System.out.println("\n--- Final States ---");

        System.out.println(orc);
        System.out.println(elf);
        System.out.println(dwarf);
    }
}