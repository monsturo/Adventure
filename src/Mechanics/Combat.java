package Mechanics;

import Creatures.Creature;
import Skills.Active.Offensive.Offense;

import java.util.ArrayList;
import java.util.Random;

public class Combat {
    private Random random = new Random();
    private int round = 0;
    public void soloFight(Creature c1, Creature c2){
        c1.setTempHp(c1.getHp());
        c2.setTempHp(c2.getHp());
        while (c1.getTempHp() > 0 && c2.getTempHp() > 0){
            if (c1.getSpd() > c2.getSpd()){
                resolveAttack(c1, c2);
                if (c2.getTempHp() > 0) {
                    resolveAttack(c2, c1);
                } else {
                    c1.setExp(c1.getExp() + c2.getExp());
                    System.out.println(c1.getName() + " has earned " + c2.getExp() + " exp!");
                    if (c1.getExp() > c1.getLvl() * 100){

                    }
                }
            } else {
                resolveAttack(c2, c1);
                if (c1.getTempHp() > 0) {
                    resolveAttack(c1, c2);
                }
            }
            round++;
            if (round == 4) round = 0;
        }
    }

    private void resolveAttack(Creature c1, Creature c2) {
        if (c1.getAttSkill(round) != null) {
            if (!(c1.getAttSkill(round).attempt(c1, c2, round))) {
                System.out.print(c1.getName() + " attacks " + c2.getName());
                attack(c1, c2);
            }
        } else {
            System.out.print(c1.getName() + " attacks " + c2.getName());
            attack(c1, c2);
        }
    }

    public void groupFight(ArrayList<Creature> t1, ArrayList<Creature> t2){

    }

    private void attack(Creature c1, Creature c2) {
        double cth = 80 + c1.getHit() - c2.getEva();
        int hit = random.nextInt(100);
        if (hit < cth){
            int damage = Math.max(0, c1.getDamage() - c2.getDef());
            if (c2.getDefSkill(round) != null) {
                if (!(c2.getDefSkill(round).attempt(c2, damage, Offense.Type.PHYS))) {
                    defence(c2, damage, Offense.Type.PHYS);
                }
            } else {
                defence(c2, damage, Offense.Type.PHYS);
            }
        } else {
            System.out.println(", but misses");
        }
    }

    private void defence(Creature c, int damage, Offense.Type type){
        if (type.equals(Offense.Type.PHYS)){
            System.out.println(" for " + (damage - c.getDef() + " damage!"));
            c.setTempHp(c.getTempHp() - Math.max(0, damage));
            if (c.getTempHp() <= 0) {
                System.out.println(c.getName() + " has died!");
            }
        } else {
            System.out.println(" for " + (damage - c.getmDef() + " damage!"));
            c.setTempHp(c.getTempHp() - Math.max(0, damage));
            if (c.getTempHp() <= 0) {
                System.out.println(c.getName() + " has died!");
            }
        }
    }
}
