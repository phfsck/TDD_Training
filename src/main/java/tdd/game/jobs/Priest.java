package tdd.game.jobs;

import tdd.game.armors.Armor;
import tdd.game.weapons.Weapon;

public class Priest extends Job {
    
    private Weapon weapon;
    private Armor armor;
    
    public boolean isEquipped(){
        return (weapon != null ) && (armor != null) ;
    }
    
    public Weapon getWeapon(){
        return this.weapon;
    }
    
    public void setWeapon(Weapon weapon){
        this.weapon = weapon;
    }
    
    public Armor getArmor(){
        return this.armor;
    }
    
    public void setArmor(Armor armor){
        this.armor = armor;
    }
}
