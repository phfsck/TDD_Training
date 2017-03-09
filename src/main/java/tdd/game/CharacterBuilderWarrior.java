package tdd.game;

import tdd.game.armors.Armor;
import tdd.game.jobs.Warrior;
import tdd.game.stats.Stats;
import tdd.game.weapons.Weapon;

public class CharacterBuilderWarrior {

	private Warrior warrior;

	public CharacterBuilderWarrior() {
		warrior = new Warrior();
	}

	public CharacterBuilderWarrior setWeapon(Weapon sword) {
		warrior.setWeapon(sword);
		return this;
	}

	public CharacterBuilderWarrior setArmor(Armor chainMail) {
		warrior.setArmor(chainMail);
		return this;
	}
	public CharacterBuilderWarrior setStats(Stats stats){
	    warrior.setStats(stats);
	    return this;
	}
	public Warrior build() {
		return warrior;
	}


}