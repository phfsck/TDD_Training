package tdd.game.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import tdd.game.CharacterBuilderPriest;
import tdd.game.armors.Shield;
import tdd.game.jobs.Priest;
import tdd.game.stats.Stats;
import tdd.game.weapons.Wand;

import tdd.game.armors.Chainmail;
import tdd.game.stats.Damage;
import tdd.game.stats.Defense;


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
    
	@Test
	public void shouldEquipPriestIfHeOrSheHasWeaponThenAddDamage() {

		charBuilderPriest.setWeapon(new Wand());
		Stats stats = new Stats();
		stats.setDamage(new Damage(10));
		charBuilderPriest.setStats(stats);
		assertEquals(10,priest.getStats().getDamage().getValue());
	}
	
	@Test
	public void shouldNotEquipPriestIfHeOrSheHasWeaponThenShouldNotAddDamage() {
	    Stats stats = new Stats();
	    stats.setDamage(new Damage());
	    charBuilderPriest.setStats(stats);
		assertEquals(0,priest.getStats().getDamage().getValue());
	}
	
	@Test
	public void shouldEquipPriestIfHeOrSheHasArmorThenAddDefense() {

		charBuilderPriest.setArmor(new Chainmail());
		Stats stats = new Stats();
		stats.setDefense(new Defense(10));
		charBuilderPriest.setStats(stats);
		assertEquals(10,priest.getStats().getDefense().getValue());
	}
	
	@Test
	public void shouldNotEquipPriestIfHeOrSheHasArmorThenShouldNotAddDefense() {
	    Stats stats = new Stats();
	    stats.setDefense(new Defense());
	    charBuilderPriest.setStats(stats);
		assertEquals(0,priest.getStats().getDefense().getValue());
	}

}