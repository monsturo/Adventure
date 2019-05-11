package Skills.Active.Offensive;

import Creatures.Creature;

public class PowerAttack extends Offense {
    public PowerAttack(double chance, Type type) {
        super(chance, type);
    }

    @Override
    public void use(Creature c1, Creature c2, int round){
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
}
