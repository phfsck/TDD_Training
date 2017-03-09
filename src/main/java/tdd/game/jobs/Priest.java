package tdd.game.jobs;

import tdd.game.armors.Armor;
import tdd.game.stats.Stats;
import tdd.game.weapons.Weapon;

public class Priest extends Job {
    
    private Weapon weapon;
    private Armor armor;
    private Stats stats;
    
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
    
	public void setStats(Stats stats){
	    this.stats = stats;
	}
	
	public Stats getStats(){
	    return stats;
	}
}
