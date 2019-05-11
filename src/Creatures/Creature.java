package Creatures;

import Equipment.Accessory.Accessory;
import Equipment.Accessory.None;
import Equipment.Armor.Armor;
import Equipment.Main_Hand.MainHand;
import Equipment.Main_Hand.Unarmed;
import Equipment.Off_Hand.OffHand;
import Skills.Active.Defensive.Defence;
import Skills.Active.Offensive.Offense;
import Skills.Passive.Defensive.Defensive;
import Skills.Passive.Offensive.Offensive;

import java.util.ArrayList;

public abstract class Creature {

    private String name;

    //Equipment
    private Armor.Armors armor = Armor.Armors.UNARMORED;
    private MainHand mainHand = new Unarmed();
    private OffHand offHand = new Equipment.Off_Hand.Unarmed();
    private Accessory accessory = new None();

    //Base stats
    private int str, con, inti, spd, lvl, exp;

    //Derived stats
    private int hp, sp, def, mdef, hit, eva;

    //Temporary
    private double tempHp;

    //Mods
    private int mHp, mDef, mMdef, mHit, mEva;

    //Skills
    private ArrayList<Offense> attSkill;
    private ArrayList<Defence> defSkill;
    private Offensive pasOff = null;
    private Defensive pasDef = null;

    Creature(){}

    public Creature(int s, int c, int i, int sp) {
            setStr(s);
            setCon(c);
            setInti(i);
            setSpd(sp);
            attSkill = new ArrayList<>();
            defSkill = new ArrayList<>();
            for (int e = 0; e < 4; e++){
                attSkill.add(null);
                defSkill.add(null);
            }
            lvl = 1;
    }

    public Creature(int s, int c, int i, int sp, int lvl, int exp) {
        setStr(s);
        setCon(c);
        setInti(i);
        setSpd(sp);
        this.lvl = lvl;
        setExp(exp);
        attSkill = new ArrayList<>();
        defSkill = new ArrayList<>();
        for (int e = 0; e < 4; e++){
            attSkill.add(null);
            defSkill.add(null);
        }
    }

    public int getStr() {
        return str;
    }

    public void setStr(int str) {
        this.str = str;
    }

    public int getCon() {
        return con;
    }

    public void setCon(int con) {
        this.con = con;
    }

    public int getInti() {
        return inti;
    }

    public void setInti(int inti) {
        this.inti = inti;
    }

    public int getSpd() {
        return spd;
    }

    public void setSpd(int spd) {
        this.spd = spd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHp() {
        return Math.floor(0.5 * str) + con + (2 * lvl);
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getSp() {
        return sp;
    }

    public void setSp(int sp) {
        this.sp = sp;
    }

    public int getDef() {
        return armor.getDef() + offHand.getDef() + lvl ;
    }

    public int getDamage() { return str + mainHand.getAtt() + lvl;}

    public void setDef(int def) {
        this.def = def;
    }

    public int getMdef() {
        return mdef;
    }

    public void setMdef(int mdef) {
        this.mdef = mdef;
    }

    public double getHit() {
        return hit * mainHand.getWeight();
    }

    public void setHit(int hit) {
        this.hit = hit;
    }

    public double getEva() {
        return spd * armor.getWeight() * offHand.getWeight();
    }

    public void setEva(int eva) {
        this.eva = eva;
    }

    public Armor.Armors getArmor() {
        return armor;
    }

    public void setArmor(Armor.Armors armor) {
        this.armor = armor;
    }

    public MainHand getMainHand() {
        return mainHand;
    }

    public void setMainHand(MainHand mainHand) {
        this.mainHand = mainHand;
    }

    public OffHand getOffHand() {
        return offHand;
    }

    public void setOffHand(OffHand offHand) {
        this.offHand = offHand;
    }

    public Accessory getAccessory() {
        return accessory;
    }

    public void setAccessory(Accessory accessory) {
        this.accessory = accessory;
    }

    public int getmHp() {
        return mHp;
    }

    public void setmHp(int mHp) {
        this.mHp += mHp;
    }

    public int getmDef() {
        return mDef;
    }

    public void setmDef(int mDef) {
        this.mDef += mDef;
    }

    public int getmMdef() {
        return mMdef;
    }

    public void setmMdef(int mMdef) {
        this.mMdef += mMdef;
    }

    public int getmHit() {
        return mHit;
    }

    public void setmHit(int mHit) {
        this.mHit += mHit;
    }

    public int getmEva() {
        return mEva;
    }

    public void setmEva(int mEva) {
        this.mEva += mEva;
    }

    public Offense getAttSkill(int i) {
        return attSkill.get(i);
    }

    public void setAttSkill(Offense attSkill, int i) {
        this.attSkill.set(i, attSkill);
    }

    public Defence getDefSkill(int i) {
        return defSkill.get(i);
    }

    public void setDefSkill(Defence defSkill, int i) {
        this.defSkill.set(i, defSkill);
    }

    public Offensive getPasOff() {
        return pasOff;
    }

    public void setPasOff(Offensive pasOff) {
        this.pasOff = pasOff;
    }

    public Defensive getPasDef() {
        return pasDef;
    }

    public void setPasDef(Defensive pasDef) {
        this.pasDef = pasDef;
    }

    public double getTempHp() {
        return tempHp;
    }

    public void setTempHp(double tempHp) {
        this.tempHp = tempHp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public int getExp(){
        return exp;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    public int getLvl(){
        return lvl;
    }
}
