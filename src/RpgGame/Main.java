package RpgGame;

public class Main {

    public static void main (String[] args) {
        
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

        //7) show guild members stats
        horde.showMembersStats();

    }
}
