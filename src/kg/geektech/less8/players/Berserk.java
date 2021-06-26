package kg.geektech.less8.players;

import kg.geektech.less8.game.RPG_Game;

public class Berserk extends Hero{

    public Berserk(int health, int damage) {
        super(health, damage, SuperAbility.SAVE_DAMAGE_AND_REVERT);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        int saveDamageAndRevert = RPG_Game.random.nextInt(50);
        boss.setHealth(boss.getHealth() - saveDamageAndRevert - this.getDamage());
        System.out.println("Berserk " + " дал суперспособность " + saveDamageAndRevert );

        }

    }

