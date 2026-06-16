package RpgGame;

import java.util.ArrayList;
import java.util.List;

public class Guild {

    private String guildName;
    private List<Character> members;
    
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


}
