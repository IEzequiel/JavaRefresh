package RpgGame;

public class Warrior extends Character {

    
    private int rage;
    // Constructor
    public Warrior(String name) {

        super(name);
        super.setDamage(20);
        super.setLife(200);
        super.setMaxLife(200);
        super.setStrength(80);      
        this.setRage(50);
    }

    public int getRage() {
        return rage;
    }

    private void setRage(int rage) {
        this.rage = rage;
    }
    

    @Override
    public void attack (Character target) {
        int targetDamage = super.getDamage();
        target.receiveDamage(targetDamage);
        System.out.println("You attacked "+ target.getName() + " and took him " + targetDamage + " of his life");
    }


}
