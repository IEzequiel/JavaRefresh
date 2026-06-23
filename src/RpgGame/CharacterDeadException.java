package RpgGame;

public class CharacterDeadException extends RuntimeException {
    public CharacterDeadException (String message){
        super(message);
    }
}
