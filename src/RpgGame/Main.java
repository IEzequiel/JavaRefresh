package RpgGame;

import java.util.List;
import java.util.Optional;

public class Main {

    public static void main (String[] args) {

        //Practice - Week 4
        //Ex1 Simulate a dead character and attack
        Warrior davion = new Warrior("Davion");
        Warrior arthas = new Warrior("Arthas");
        davion.setLife(0);
        try {
            davion.attack(arthas);
        } catch (Exception e) {
            System.out.println("You can't attack if you are dead...");
        }
        System.out.println(arthas.getStats());
        
        //Ex2 Count alive members
        Guild horde = new Guild("Horde");
        Mage luna = new Mage("Luna");
        Mage arana = new Mage("Arana");
        horde.addMember(davion);
        horde.addMember(arthas);
        horde.addMember(luna);
        horde.addMember(arana);
        System.out.println("Members alive: " + horde.countAliveMembers());

        //Ex3 Search strongest member
        horde.getStrongestMember().ifPresent(member -> System.out.println("Strongest member: " + member.getName()));

        
        /* //Practice - Week 3
        //1) Create a new Guild
        Guild horde = new Guild("Horde");

        //2) Create characters and add them to the Guild
        Warrior davion = new Warrior("Davion");
        Warrior arthas = new Warrior("Arthas");
        Mage luna = new Mage("Luna");
        Mage arana = new Mage("Arana");

        //3) add the new characters to horde guild
        horde.addMember(davion);
        horde.addMember(arthas);
        horde.addMember(luna);
        horde.addMember(arana);

        //4) create a boss: a new character more powerful with 500 life
        Warrior voldemort = new Warrior("Voldemort");
        voldemort.setLife(500);

        //5) order the guild to attack the boss
        horde.massAttack(voldemort);

        //6) show boss stats
        System.out.println(voldemort.getStats()); 

        // 7) show guild members stats
        List<Character> roster = horde.getMembersList();
            for (Character member : roster) {
                System.out.println("********************************");
                System.out.println(member.getStats());
            }
            */
    }
}
