package RpgGame;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Guild {

    private String guildName;
    private List<Character> members;
    
    //Constructor
    public Guild(String guildName) {
        this.setGuildName(guildName);
        this.members = new ArrayList<>();
    }

    public String getGuildName() {
        return guildName;
    }

    private void setGuildName(String guildName) {
        this.guildName = guildName;
    }

    // Return a copy list of the guild members
    public List<Character> getMembersList() {
        return new ArrayList<>(this.members);
        }

    //all guild attacks one enemy
    public void massAttack (Character enemy) {

        this.members.stream().forEach(member -> member.attack(enemy));
        /*
        for (Character member : this.members) {
            member.attack(character);
        }*/
    }

    public boolean addMember (Character member){
        boolean exist = false;
        if (existingMember(member)) { //to avoid duplicates
            exist = true;
        } else {
            this.members.add(member);
                }
        return exist; 
    }

    private boolean existingMember(Character newMember) {
        
        //Updated method (Java 8+) more declarative
        boolean answer = this.members.stream().anyMatch(member -> member.getName().equalsIgnoreCase(newMember.getName()));
        return answer;
        
    }

    //Week 4 - Get healers 
    public List<Character> getHealers(){
        return this.members.stream()
               .filter(member -> member instanceof Healer).toList(); 
    }

    //Week 4 - Count alive members
    public long countAliveMembers (){
        return this.members.stream().filter(member -> member.getLife() > 0).count();
    }

    //Week 4 - Search strongest member
    public Optional<Character> getStrongestMember() {
        return this.members.stream().max(Comparator.comparingInt(member -> member.getStrength()));
    }

}
