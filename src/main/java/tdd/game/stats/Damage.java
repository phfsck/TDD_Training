package tdd.game.stats;

public class Damage {
    
    public Damage() {}
    
    public Damage (int value){
        this.value = value;
    }
    private int value = 0;
    
    public int getValue(){
        return value;
    }
    
    public void setValue(int value){
        this.value = value;
    }
}
