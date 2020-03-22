package andoroid.wings.websarva.namebattler.RecordClass;

import java.util.Date;

// playerのデータ(ステータス)受け取るレコードクラス
public class PlayerRecord {
    private String name = null;
    private String job = null;
    private int hp = 0;
    private int mp = 0;
    private int str = 0;
    private int def = 0;
    private int agi = 0;
    private int luck = 0;
    private Date makePlayerDate = null;

    public PlayerRecord(){}

    public PlayerRecord(String name, String job, int hp, int mp, int str, int def, int agi, int luck, Date makePlayerDate) {
        this.name = name;
        this.job = job;
        this.hp = hp;
        this.mp = mp;
        this.str = str;
        this.def = def;
        this.def = agi;
        this.luck = luck;
        this.makePlayerDate = makePlayerDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getAgi() {
        return agi;
    }

    public void setAgi(int agi) {
        this.agi = agi;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public int getStr() {
        return str;
    }

    public void setStr(int str) {
        this.str = str;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public int getLuck() {
        return luck;
    }

    public void setLuck(int luck) {
        this.luck = luck;
    }

    public Date getMakePlayerDate() {
        return makePlayerDate;
    }

    public void setMakePlayerDate(Date makePlayerDate) {
        this.makePlayerDate = makePlayerDate;
    }



}
