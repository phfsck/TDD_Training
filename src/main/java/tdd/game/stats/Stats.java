package tdd.game.stats;

public class Stats {
    
    Damage damage;
    Defense defense;
    
    public void setDamage(Damage damage) {
        this.damage = damage;
    }
    
    public Damage getDamage() {
        return damage;
    }
    
    public void setDefense(Defense defense) {
        this.defense = defense;
    }
    
    public Defense getDefense() {
        return defense;
    }

}
