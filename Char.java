public class Char {
    boolean Inspiration;
    int ProficiencyBonus = 3;

    private Race race;
    private Subrace subrace;
    private CharClass charClass;
    private Subclass subclass;

    public Race getRace() {
        return this.race;
    }

    public void setRace(Race race) {
        this.race = race;
    }

    public Subrace getSubrace() {
        return this.subrace;
    }

    public void setSubrace(Subrace subrace) {
        this.subrace = subrace;
    }

    public CharClass getCharClass() {
        return this.charClass;
    }

    public void setCharClass(CharClass charClass) {
        this.charClass = charClass;
    }

    public Subclass getSubclass() {
        return this.subclass;
    }

    public void setSubclass(Subclass subclass) {
        this.subclass = subclass;
    }

    // Ability Scores
    private AbilityScores stats;

    public AbilityScores getAbilityScores() {
        return this.stats;
    }

    public void setAbilityScores(AbilityScores stats) {
        this.stats = stats;
        refreshMods();
    }

    //Ability Score Modifiers
    private AbilityScores mods;

    public AbilityScores getMods() {
        return this.mods;
    }

    public void setMods(AbilityScores mods) {
        this.mods = mods;
    }

    public void refreshMods() {
        this.mods.setSTR(this.stats.STRmod());
        this.mods.setDEX(this.stats.DEXmod());
        this.mods.setCON(this.stats.CONmod());
        this.mods.setINT(this.stats.INTmod());
        this.mods.setWIS(this.stats.WISmod());
        this.mods.setCHA(this.stats.CHAmod());
    }

    private int AC;

    public int getAC() {
        return AC;
    }

    public void setAC(int AC) {
        this.AC = AC;
    }

    public void setBaseAC() {
        this.AC = 10 + this.mods.getDEX();
    }

    private int initiative;

    public int getInitiative() {
        return initiative;
    }

    public void setInitiative(int initiative) {
        this.initiative = initiative;
    }

    //Saving Throws
    //Saving Throw Proficiencies
    private STProfs STProfs;

    public STProfs getSTprofs() {
        return this.STProfs;
    }

    public void setSTprofs(STProfs STProfs) {
        this.STProfs = STProfs;
        setSTmods(STProfs);
    }

    public void setSTmods(STProfs stProfs) {
        this.STMods.setSTR(this.STProfs.getSTR() ? (this.mods.getSTR() + ProficiencyBonus) : this.mods.getSTR());
        this.STMods.setDEX(this.STProfs.getDEX() ? (this.mods.getDEX() + ProficiencyBonus) : this.mods.getDEX());
        this.STMods.setCON(this.STProfs.getCON() ? (this.mods.getCON() + ProficiencyBonus) : this.mods.getCON());
        this.STMods.setINT(this.STProfs.getINT() ? (this.mods.getINT() + ProficiencyBonus) : this.mods.getINT());
        this.STMods.setWIS(this.STProfs.getWIS() ? (this.mods.getWIS() + ProficiencyBonus) : this.mods.getWIS());
        this.STMods.setCHA(this.STProfs.getCHA() ? (this.mods.getCHA() + ProficiencyBonus) : this.mods.getCHA());
    }

    //Saving Throw Modifiers
    private STMods STMods;

    public STMods getSTMods() {
        return this.STMods;
    }

    public void setSTMods(STMods STMods) {
        this.STMods = STMods;
    }

    //Skills
    //Skill Proficiencies
    private Skills skillProfs;

    public Skills getSkillProfs() {
        return this.skillProfs;
    }

    public void setSkillProfs(Skills skillProfs) {
        this.skillProfs = skillProfs;
        setSkillMods(skillProfs);
    }

    public void setSkillMods(Skills skillProfs) {
        setAcrobatics(this.skillProfs.getAcrobatics() ? (this.mods.getDEX() + ProficiencyBonus) : this.mods.getDEX());
        setAnimalHandling(this.skillProfs.getAnimalHandling() ? (this.mods.getWIS() + ProficiencyBonus) : this.mods.getWIS());
        setArcana(this.skillProfs.getArcana() ? (this.mods.getINT() + ProficiencyBonus) : this.mods.getINT());
        setAthletics(this.skillProfs.getAthletics() ? (this.mods.getSTR() + ProficiencyBonus) : this.mods.getSTR());
        setDeception(this.skillProfs.getDeception() ? (this.mods.getCHA() + ProficiencyBonus) : this.mods.getCHA());
        setHistory(this.skillProfs.getHistory() ? (this.mods.getINT() + ProficiencyBonus) : this.mods.getINT());
        setInsight(this.skillProfs.getInsight() ? (this.mods.getWIS() + ProficiencyBonus) : this.mods.getWIS());
        setIntimidation(this.skillProfs.getIntimidation() ? (this.mods.getCHA() + ProficiencyBonus) : this.mods.getCHA());
        setInvestigation(this.skillProfs.getInvestigation() ? (this.mods.getINT() + ProficiencyBonus) : this.mods.getINT());
        setMedicine(this.skillProfs.getMedicine() ? (this.mods.getWIS() + ProficiencyBonus) : this.mods.getWIS());
        setNature(this.skillProfs.getNature() ? (this.mods.getINT() + ProficiencyBonus) : this.mods.getINT());
        setPerception(this.skillProfs.getPerception() ? (this.mods.getWIS() + ProficiencyBonus) : this.mods.getWIS());
        setPerformance(this.skillProfs.getPerformance() ? (this.mods.getCHA() + ProficiencyBonus) : this.mods.getCHA());
        setPersuasion(this.skillProfs.getPersuasion() ? (this.mods.getCHA() + ProficiencyBonus) : this.mods.getCHA());
        setReligion(this.skillProfs.getReligion() ? (this.mods.getWIS() + ProficiencyBonus) : this.mods.getWIS());
        setSleightOfHand(this.skillProfs.getSleightOfHand() ? (this.mods.getDEX() + ProficiencyBonus) : this.mods.getDEX());
        setStealth(this.skillProfs.getStealth() ? (this.mods.getDEX() + ProficiencyBonus) : this.mods.getDEX());
        setSurvival(this.skillProfs.getSurvival() ? (this.mods.getWIS() + ProficiencyBonus) : this.mods.getWIS());
    }

    //Skill Modifiers
    private int Acrobatics;
    private int AnimalHandling;
    private int Arcana;
    private int Athletics;
    private int Deception;
    private int History;
    private int Insight;
    private int Intimidation;
    private int Investigation;
    private int Medicine;
    private int Nature;
    private int Perception;
    private int Performance;
    private int Persuasion;
    private int Religion;
    private int SleightOfHand;
    private int Stealth;
    private int Survival;

    public int getAcrobatics() {
        return Acrobatics;
    }
    public int getAnimalHandling() {
        return AnimalHandling;
    }
    public int getArcana() {
        return Arcana;
    }
    public int getAthletics() {
        return Athletics;
    }
    public int getDeception() {
        return Deception;
    }
    public int getHistory() {
        return History;
    }
    public int getInsight() {
        return Insight;
    }
    public int getIntimidation() {
        return Intimidation;
    }
    public int getInvestigation() {
        return Investigation;
    }
    public int getMedicine() {
        return Medicine;
    }
    public int getNature() {
        return Nature;
    }
    public int getPerception() {
        return Perception;
    }
    public int getPerformance() {
        return Performance;
    }
    public int getPersuasion() {
        return Persuasion;
    }
    public int getReligion() {
        return Religion;
    }
    public int getSleightOfHand() {
        return SleightOfHand;
    }
    public int getStealth() {
        return Stealth;
    }
    public int getSurvival() {
        return Survival;
    }

    public void setAcrobatics(int Acrobatics) {
        this.Acrobatics = Acrobatics;
    }
    public void setAnimalHandling(int AnimalHandling) {
        this.AnimalHandling = AnimalHandling;
    }
    public void setArcana(int Arcana) {
        this.Arcana = Arcana;
    }
    public void setAthletics(int Athletics) {
        this.Athletics = Athletics;
    }
    public void setDeception(int Deception) {
        this.Deception = Deception;
    }
    public void setHistory(int History) {
        this.History = History;
    }
    public void setInsight(int Insight) {
        this.Insight = Insight;
        setPassiveInsight();
    }
    public void setIntimidation(int Intimidation) {
        this.Intimidation = Intimidation;
    }
    public void setInvestigation(int Investigation) {
        this.Investigation = Investigation;
        setPassiveInvestigation();
    }
    public void setMedicine(int Medicine) {
        this.Medicine = Medicine;
    }
    public void setNature(int Nature) {
        this.Nature = Nature;
    }
    public void setPerception(int Perception) {
        this.Perception = Perception;
        setPassivePerception();
    }
    public void setPerformance(int Performance) {
        this.Performance = Performance;
    }
    public void setPersuasion(int Persuasion) {
        this.Persuasion = Persuasion;
    }
    public void setReligion(int Religion) {
        this.Religion = Religion;
    }
    public void setSleightOfHand(int SleightOfHand) {
        this.SleightOfHand = SleightOfHand;
    }
    public void setStealth(int Stealth) {
        this.Stealth = Stealth;
        setPassiveStealth();
    }
    public void setSurvival(int Survival) {
        this.Survival = Survival;
    }

    //Passive Skills
    private int PassiveInsight;
    private int PassiveInvestigation;
    private int PassivePerception;
    private int PassiveStealth;

    public int getPassiveInsight() {
        return PassiveInsight;
    }
    public int getPassiveInvestigation() {
        return PassiveInvestigation;
    }
    public int getPassivePerception() {
        return PassivePerception;
    }
    public int getPassiveStealth() {
        return PassiveStealth;
    }

    public void setPassiveInsight() {
        this.PassiveInsight = 10 + getInsight();
    }
    public void setPassiveInvestigation() {
        this.PassiveInvestigation = 10 + getInvestigation();
    }
    public void setPassivePerception() {
        this.PassivePerception = 10 + getPerception();
    }
    public void setPassiveStealth() {
        this.PassiveStealth = 10 + getStealth();
    }

    //Constructors
    public Char(AbilityScores stats, STProfs STProfs, Skills skillProfs) {
        setAbilityScores(stats);
        setSTprofs(STProfs);
        setSkillProfs(skillProfs);
        setBaseAC();
    }

}