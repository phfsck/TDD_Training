package tdd.game;

import tdd.game.armors.Armor;
import tdd.game.jobs.Priest;
import tdd.game.weapons.Weapon;

public class CharacterBuilderPriest {
    
    private Priest priest;
    
    public CharacterBuilderPriest() {
        priest = new Priest();
    }
    
    public CharacterBuilderPriest setWeapon(Weapon weapon) {
        priest.setWeapon(weapon);
        return this;
    }
    
    public CharacterBuilderPriest setArmor(Armor armor) {
        priest.setArmor(armor);
        return this;
    }
    
    public Priest build() {
        return priest;
    }
}
