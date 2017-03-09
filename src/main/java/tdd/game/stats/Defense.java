package tdd.game.stats;

public class Defense {
    private int value = 0;
    
    public Defense() {}
    
    public Defense(int value) {
        this.value = value;
    }
    
    public int getValue(){
        return value;
    }
    
    public void setValue(int value){
        this.value = value;
    }
}
