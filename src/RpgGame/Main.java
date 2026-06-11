package RpgGame;

public class Main {

    public static void main (String[] args) {
            
        Warrior arthas = new Warrior("Arthas");
        Mage gandalf = new Mage ("Gandalf");
        
        //Show character's initial stats
        arthas.getStats();
        gandalf.getStats();

        //simular ataque
        arthas.attack(gandalf);
        gandalf.attack(arthas);

        //Show character's initial stats
        arthas.getStats();
        gandalf.getStats();
        System.out.println("Mana restante de " + gandalf.getName() + ": " + gandalf.getMana());

        //Regenerar mana de gandalf
        gandalf.meditate();
        System.out.println("Mana restante de " + gandalf.getName() + ": " + gandalf.getMana());

        //Curar personaje con Mago
        gandalf.heal(arthas);
        arthas.getStats();
    }
}
