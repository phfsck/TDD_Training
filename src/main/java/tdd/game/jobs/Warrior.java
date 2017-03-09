package tdd.game.jobs;

import java.util.List;

import tdd.game.armors.Armor;
import tdd.game.skills.Skill;
import tdd.game.stats.Stats;
import tdd.game.weapons.Weapon;

public class Warrior extends Job {
	private Weapon weapon;
	private Armor armor;
	private Stats stats;

	
	private List<Skill<Job>> skills;

	public Armor getArmor() {
		return armor;
	}

	public boolean isEquipped() {
		return (null != weapon) && (null != armor);
	}
	
	public Weapon getWeapon() {
		return weapon;
	}

	public void setWeapon(Weapon sword) {
		this.weapon = sword;
	}

	public void setArmor(Armor chainMail) {
		this.armor = chainMail;
	}
	
	public void setSkills(List<Skill<Job>> skills) {
	    this.skills = skills;
	}
	
	public List<Skill<Job>> getSkills() {
	    return skills;
	}
	
	public void setStats(Stats stats){
	    this.stats = stats;
	}
	
	public Stats getStats(){
	    return stats;
	}


}