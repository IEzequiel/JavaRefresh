package RpgGame;

import java.util.ArrayList;
import java.util.List;

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

    //Show all the guild members and their stats
    public void showMembersStats () {
        for (Character member : this.members) {
            System.out.println("********************************");
            System.out.println(member.getStats());
        }
    }

    //all guild attacks one enemy
    public void massAttack (Character character) {
        for (Character member : this.members) {
            member.attack(character);
        }
    }

    public void addMember (Character member){
        if (existingMember(member)) { //to avoid duplicates
            System.out.println(member.getName() + "is already member of this guild");
        }
        this.members.add(member);
    }

    private boolean existingMember(Character newMember) {
        boolean isMember = false;
        for (Character member : this.members) {
            if (member.getName().equalsIgnoreCase(newMember.getName())) {
                isMember = true;
                break;
            }
        }
        return isMember;
    }


}
