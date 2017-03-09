package tdd.game;

import java.util.ArrayList;
import java.util.List;

import tdd.game.jobs.Job;
import tdd.game.skills.Skill;

public class WarriorDAOImpl implements WarriorDAO {
    
    private List<Skill<Job>> skills;
    
    public WarriorDAOImpl() {
        skills = new ArrayList<Skill<Job>>();
    }
    
    public List<Skill<Job>> getSkills() { // should put a parameter here, get skills for a specific job!
         return skills; // get skills by Jobs!
    }
    
    public void addSkill(Skill<Job> skill) {
        skills.add(skill); // add skills by Jobs!
    }
}
