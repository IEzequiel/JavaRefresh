package RpgGame;

public class Mage extends Character implements Healer {

    private int mana;

    public Mage(String name) {
        super(name);
        super.setDamage(10);
        super.setLife(100);
        super.setMaxLife(100);
        super.setStrength(50);
        this.setMana(100);
    }

    public int getMana() {
        return mana;
    }

    private void setMana(int mana) {
        this.mana = mana;
    }

    //Method to replenish mana
    public void meditate (){
        System.out.println("Charging mana...");

        try {
            // 3000 milliseconds = 3 seconds
            Thread.sleep(3000); 
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        this.setMana(100);

        System.out.println("Mana's full!!");
    }

    @Override
    public void heal(Character player) {
        int lifePlayer = player.getLife();
        
         //Also, mage lose mana when heals, so we need to validate if we have enough
        if (this.mana >= 10){
            if(lifePlayer >= player.getMaxLife() - 20) {
                player.setLife(player.getMaxLife());
            } else {
                player.setLife(lifePlayer + 20);
                setMana(this.mana -= 10);
            }
        System.out.println(player.getName() + " was healed by 20 hp");
        } else {
            System.out.println("Not enough mana");
        }
    }

    @Override
    public void attack(Character target) {
        int targetDamage = super.getDamage();
        //Mage needs mana in order to attack, so we need to check if it has enough
        if (this.mana >= 20){
            target.receiveDamage(targetDamage);
            setMana(this.mana -= 20);
        System.out.println("You attacked  "+ target.getName() + " and took him " + targetDamage + " of his life");
        } else {
            System.out.println("Not enough mana");
        }      
    }
    
}
