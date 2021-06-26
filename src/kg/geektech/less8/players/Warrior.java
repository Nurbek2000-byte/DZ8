package kg.geektech.less8.players;

import kg.geektech.less8.game.RPG_Game;

public class Warrior<heroes> extends Hero{

    public Warrior(int health, int damage) {
        super(health, damage, SuperAbility.CRITICAL_DAMAGE);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        int criticalDamage = RPG_Game.random.nextInt(3) +2;
        boss.setHealth(boss.getHealth() - criticalDamage * this.getDamage());
        System.out.println("Warrior " + " дал суперспособность " + criticalDamage );

        }

    }


