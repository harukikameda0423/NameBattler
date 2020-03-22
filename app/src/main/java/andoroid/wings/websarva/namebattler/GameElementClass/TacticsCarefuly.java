package andoroid.wings.websarva.namebattler.GameElementClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class TacticsFullPower {


    /**
     * skillか通常攻撃可選択
     */
    public Map<String, Object> selectAttackType(Player player, Party playerParty) {
        int atk_random; //最小値を0、設定したSTRを最大とし乱数によりその値を生成

        // skill使用時のダメージ量
        int skill_damage = 0;
        int tmp_skill_damage = 0;

        Map<String, Object> useSkill = new HashMap<>();

        //乱数生成の為のrandom
        Random random = new Random();
        //プレイヤーの攻撃力乱数生成
        atk_random = random.nextInt(player.getStr() + 1);

        // 現在の自身のMP内で使用できる最大のダメージ量をもつskillを優先して使用する
        for (Map<String, Object> skill : player.getSkillList()) {
            // 一時保存用
            Map<String, Object> tmpSkill = new HashMap<>();
            if (player.getMp() > (int)skill.get("SKILL_MP")) {
                tmpSkill = skill;

                // スキルの対象が味方の場合は回復魔法
                if ((int)skill.get("TARGET_PLAYER_FLG") == 1) {
                    // 僧侶が回復魔法を使用するか判定
                    if ((int)skill.get("JOB_ID") == 2) {
                        // パーティの最大HPの３０％よりも低い場合回復を行う
                        if (playerParty.getMaxTotalHP() * 0.3 >= playerParty.getTotalHP()) {
                            useSkill = skill;
                            break;
                        }
                        continue;
                    }
                }
                else {
                    // 戦士の場合のダメージ計算
                    if ((int) skill.get("JOB_ID") == 0) {
                        tmp_skill_damage = (int) Math.ceil(atk_random * (Double)tmpSkill.get("SKILL_DAMAGE"));
                    }
                    else {
                        tmp_skill_damage = ((Double)tmpSkill.get("SKILL_DAMAGE")).intValue();
                    }

                    // 初回
                    if (useSkill.isEmpty()) {
                        useSkill = tmpSkill;
                        skill_damage = tmp_skill_damage;

                    }
                    // スキルダメージが一番高いスキルを実行
                    else if (skill_damage < tmp_skill_damage) {
                        useSkill = tmpSkill;
                        skill_damage = tmp_skill_damage;
                    }
                }
            }
        }
        if (useSkill.isEmpty()) useSkill.put("NORMAL", atk_random);
        return useSkill;
    }
}

