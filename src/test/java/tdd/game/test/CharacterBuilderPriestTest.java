package tdd.game.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import tdd.game.CharacterBuilderPriest;
import tdd.game.armors.Shield;
import tdd.game.jobs.Priest;
import tdd.game.weapons.Wand;


public class CharacterBuilderPriestTest {

    private CharacterBuilderPriest charBuilderPriest;
    private Priest priest;
    private Wand wand;
    private Shield shield;
    
    
    @Before
    public void init(){
        charBuilderPriest = new CharacterBuilderPriest();
        priest = charBuilderPriest.build();
        wand = new Wand();
        shield = new Shield();
    }
    @Test
    public void shouldTestBefore() {
        assertNotNull(charBuilderPriest);
    }
    
    @Test
    public void shouldNotEquipPriestUponInstantiation() {
        assertFalse(priest.isEquipped());
    }
    
    @Test
    public void shouldNotEquipPriestIfHeOrSheOnlyHasWeapon(){
        charBuilderPriest.setWeapon(wand);
        assertFalse(priest.isEquipped());      
    }

    @Test
    public void shouldNotEquipPriestIfHeOrSheOnlyHasArmor() {
        charBuilderPriest.setArmor(shield);
        assertFalse(priest.isEquipped());
    }

    @Test
    public void shouldEquipPriestBothShieldAndWand() {
        charBuilderPriest.setArmor(shield).setWeapon(wand);
        assertTrue(priest.isEquipped());
    }

}