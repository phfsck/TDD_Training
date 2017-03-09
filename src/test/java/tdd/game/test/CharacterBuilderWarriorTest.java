package tdd.game.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import tdd.game.CharacterBuilderWarrior;
import tdd.game.WarriorDAO;
import tdd.game.WarriorDAOImpl;
import tdd.game.armors.Chainmail;
import tdd.game.jobs.Warrior;
import tdd.game.skills.TripleSlash;
import tdd.game.stats.Damage;
import tdd.game.stats.Defense;
import tdd.game.stats.Stats;
import tdd.game.weapons.Sword;

public class CharacterBuilderWarriorTest {

	private CharacterBuilderWarrior characterBuilder;
	private Warrior warrior;
	
	private WarriorDAO warriorDAO;

	@Before
	public void init() {
		characterBuilder = new CharacterBuilderWarrior();
		warrior = characterBuilder.build();
		warriorDAO = new WarriorDAOImpl();
		
	}

	@Test
	public void shouldTestBefore() {
		assertNotNull(characterBuilder);
		assertNotNull(warrior);
	}

	@Test
	public void shouldNotEquipWarriorUponInstantiantion() {
		assertFalse(warrior.isEquipped());
	}

	@Test
	public void shouldNotEquipWarriorIfHeOrSheOnlyHasWeapon() {
		characterBuilder.setWeapon(new Sword());
		assertFalse(warrior.isEquipped());
	}
	@Test
	public void shouldEquipWarriorIfHeOrSheHasWeaponThenAddDamage() {

		characterBuilder.setWeapon(new Sword());
		Stats stats = new Stats();
		stats.setDamage(new Damage(10));
		characterBuilder.setStats(stats);
		assertEquals(10,warrior.getStats().getDamage().getValue());
	}
	
	@Test
	public void shouldNotEquipWarriorIfHeOrSheHasWeaponThenShouldNotAddDamage() {
	    Stats stats = new Stats();
	    stats.setDamage(new Damage());
	    characterBuilder.setStats(stats);
		assertEquals(0,warrior.getStats().getDamage().getValue());
	}
	
	@Test
	public void shouldEquipWarriorIfHeOrSheHasArmorThenAddDefense() {

		characterBuilder.setArmor(new Chainmail());
		Stats stats = new Stats();
		stats.setDefense(new Defense(10));
		characterBuilder.setStats(stats);
		assertEquals(10,warrior.getStats().getDefense().getValue());
	}
	
	@Test
	public void shouldNotEquipWarriorIfHeOrSheHasArmorThenShouldNotAddDefense() {
	    Stats stats = new Stats();
	    stats.setDefense(new Defense());
	    characterBuilder.setStats(stats);
		assertEquals(0,warrior.getStats().getDefense().getValue());
	}

	@Test
	public void shouldNotEquipWarriorIfHeOrSheOnlyHasArmor() {
		characterBuilder.setArmor(new Chainmail());
		assertFalse(warrior.isEquipped());
	}

	@Test
	public void shouldBeEquiptOnceWarriorHasArmorAndWeapon() {
		characterBuilder.setArmor(new Chainmail())
			.setWeapon(new Sword());
		assertTrue(warrior.isEquipped());
	}
	
	@Test
	public void shouldHaveNoWarriorSkill() {
	    warrior.setSkills(warriorDAO.getSkills());
	    assertEquals(0, warrior.getSkills().size());
	}
	
	@Test
	public void shouldHaveWarriorSkill() {
	    warriorDAO.addSkill(new TripleSlash());
	    warrior.setSkills(warriorDAO.getSkills());
	    assertEquals(1, warrior.getSkills().size());
	}

	
}