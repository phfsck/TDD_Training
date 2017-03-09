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
	    // set warrior's skill here and assert
	}
}