package tdd.game;

import java.util.List;

import tdd.game.jobs.Job;
import tdd.game.skills.Skill;

public interface WarriorDAO {

    public List<Skill<Job>> getSkills();
    public void addSkill(Skill<Job> skill);

}
