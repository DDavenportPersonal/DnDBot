public class Char {
    boolean Inspiration;
    int ProficiencyBonus = 3;
    int Speed = 30;

    // Ability Scores
    private int STR;
    private int DEX;
    private int CON;
    private int INT;
    private int WIS;
    private int CHA;

    public int getSTR() {
        return STR;
    }
    public int getDEX() {
        return DEX;
    }
    public int getCON() {
        return CON;
    }
    public int getINT() {
        return INT;
    }
    public int getWIS() {
        return WIS;
    }
    public int getCHA() {
        return CHA;
    }

    public void setSTR(int STR) {
        this.STR = STR;
        setSTRmod((STR - 10) / 2);
    }
    public void setDEX(int DEX) {
        this.DEX = DEX;
        setDEXmod((DEX - 10) / 2);
    }
    public void setCON(int CON) {
        this.CON = CON;
        setCONmod((CON - 10) / 2);
    }
    public void setINT(int INT) {
        this.INT = INT;
        setINTmod((INT - 10) / 2);
    }
    public void setWIS(int WIS) {
        this.WIS = WIS;
        setWISmod((WIS - 10) / 2);
    }
    public void setCHA(int CHA) {
        this.CHA = CHA;
        setCHAmod((CHA - 10) / 2);
    }

    public void setAllAbilityScores(int[] AbilityScores) {
        if (AbilityScores.length == 6){
            setSTR(AbilityScores[0]);
            setDEX(AbilityScores[1]);
            setCON(AbilityScores[2]);
            setINT(AbilityScores[3]);
            setWIS(AbilityScores[4]);
            setCHA(AbilityScores[5]);
        }
    }

    //Ability Score Modifiers
    private int STRmod;
    private int DEXmod;
    private int CONmod;
    private int INTmod;
    private int WISmod;
    private int CHAmod;

    public int getSTRmod() {
        return STRmod;
    }
    public int getDEXmod() {
        return DEXmod;
    }
    public int getCONmod() {
        return CONmod;
    }
    public int getINTmod() {
        return INTmod;
    }
    public int getWISmod() {
        return WISmod;
    }
    public int getCHAmod() {
        return CHAmod;
    }

    public void setSTRmod(int STRmod) {
        this.STRmod = STRmod;
    }
    public void setDEXmod(int DEXmod) {
        this.DEXmod = DEXmod;
        setInitiative(DEXmod);
    }
    public void setCONmod(int CONmod) {
        this.CONmod = CONmod;
    }
    public void setINTmod(int INTmod) {
        this.INTmod = INTmod;
    }
    public void setWISmod(int WISmod) {
        this.WISmod = WISmod;
    }
    public void setCHAmod(int CHAmod) {
        this.CHAmod = CHAmod;
    }

    private int AC;

    public int getAC() {
        return AC;
    }

    public void setAC(int AC) {
        this.AC = AC;
    }

    public void setBaseAC() {
        this.AC = 10 + getDEXmod();
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
    private boolean STRSTprof;
    private boolean DEXSTprof;
    private boolean CONSTprof;
    private boolean INTSTprof;
    private boolean WISSTprof;
    private boolean CHASTprof;

    public boolean getSTRSTprof() {
        return STRSTprof;
    }
    public boolean getDEXSTprof() {
        return DEXSTprof;
    }
    public boolean getCONSTprof() {
        return CONSTprof;
    }
    public boolean getINTSTprof() {
        return INTSTprof;
    }
    public boolean getWISSTprof() {
        return WISSTprof;
    }
    public boolean getCHASTprof() {
        return CHASTprof;
    }

    public void setSTRSTprof(boolean STRSTprof) {
        this.STRSTprof = STRSTprof;
        setSTRST(STRSTprof ? (STRmod + ProficiencyBonus) : STRmod);
    }
    public void setDEXSTprof(boolean DEXSTprof) {
        this.DEXSTprof = DEXSTprof;
        setDEXST(DEXSTprof ? (DEXmod + ProficiencyBonus) : DEXmod);
    }
    public void setCONSTprof(boolean CONSTprof) {
        this.CONSTprof = CONSTprof;
        setCONST(CONSTprof ? (CONmod + ProficiencyBonus) : CONmod);
    }
    public void setINTSTprof(boolean INTSTprof) {
        this.INTSTprof = INTSTprof;
        setINTST(INTSTprof ? (INTmod + ProficiencyBonus) : INTmod);
    }
    public void setWISSTprof(boolean WISSTprof) {
        this.WISSTprof = WISSTprof;
        setWISST(WISSTprof ? (WISmod + ProficiencyBonus) : WISmod);
    }
    public void setCHASTprof(boolean CHASTprof) {
        this.CHASTprof = CHASTprof;
        setCHAST(CHASTprof ? (CHAmod + ProficiencyBonus) : CHAmod);
    }

    public void setAllSTprofs(boolean[] STprofs) {
        if (STprofs.length == 6) {
            setSTRSTprof(STprofs[0]);
            setDEXSTprof(STprofs[1]);
            setCONSTprof(STprofs[2]);
            setINTSTprof(STprofs[3]);
            setWISSTprof(STprofs[4]);
            setCHASTprof(STprofs[5]);
        }
    }

    //Saving Throw Modifiers
    private int STRST;
    private int DEXST;
    private int CONST;
    private int INTST;
    private int WISST;
    private int CHAST;

    public int getSTRST() {
        return STRST;
    }
    public int getDEXST() {
        return DEXST;
    }
    public int getCONST() {
        return CONST;
    }
    public int getINTST() {
        return INTST;
    }
    public int getWISST() {
        return WISST;
    }
    public int getCHAST() {
        return CHAST;
    }

    public void setSTRST(int STRST) {
        this.STRST = STRST;
    }
    public void setDEXST(int DEXST) {
        this.DEXST = DEXST;
    }
    public void setCONST(int CONST) {
        this.CONST = CONST;
    }
    public void setINTST(int INTST) {
        this.INTST = INTST;
    }
    public void setWISST(int WISST) {
        this.WISST = WISST;
    }
    public void setCHAST(int CHAST) {
        this.CHAST = CHAST;
    }

    //Skills
    //Skill Proficiencies
    private boolean AcrobaticsProf;
    private boolean AnimalHandlingProf;
    private boolean ArcanaProf;
    private boolean AthleticsProf;
    private boolean DeceptionProf;
    private boolean HistoryProf;
    private boolean InsightProf;
    private boolean IntimidationProf;
    private boolean InvestigationProf;
    private boolean MedicineProf;
    private boolean NatureProf;
    private boolean PerceptionProf;
    private boolean PerformanceProf;
    private boolean PersuasionProf;
    private boolean ReligionProf;
    private boolean SleightOfHandProf;
    private boolean StealthProf;
    private boolean SurvivalProf;

    public boolean getAcrobaticsProf() {
        return AcrobaticsProf;
    }
    public boolean getAnimalHandlingProf() {
        return AnimalHandlingProf;
    }
    public boolean getArcanaProf() {
        return ArcanaProf;
    }
    public boolean getAthleticsProf() {
        return AthleticsProf;
    }
    public boolean getDeceptionProf() {
        return DeceptionProf;
    }
    public boolean getHistoryProf() {
        return HistoryProf;
    }
    public boolean getInsightProf() {
        return InsightProf;
    }
    public boolean getIntimidationProf() {
        return IntimidationProf;
    }
    public boolean getInvestigationProf() {
        return InvestigationProf;
    }
    public boolean getMedicineProf() {
        return MedicineProf;
    }
    public boolean getNatureProf() {
        return NatureProf;
    }
    public boolean getPerceptionProf() {
        return PerceptionProf;
    }
    public boolean getPerformanceProf() {
        return PerformanceProf;
    }
    public boolean getPersuasionProf() {
        return PersuasionProf;
    }
    public boolean getReligionProf() {
        return ReligionProf;
    }
    public boolean getSleightOfHandProf() {
        return SleightOfHandProf;
    }
    public boolean getStealthProf() {
        return StealthProf;
    }
    public boolean getSurvivalProf() {
        return SurvivalProf;
    }

    public void setAcrobaticsProf(boolean AcrobaticsProf) {
        this.AcrobaticsProf = AcrobaticsProf;
        setAcrobatics(AcrobaticsProf ? (getDEXmod() + ProficiencyBonus) : getDEXmod());
    }
    public void setAnimalHandlingProf(boolean AnimalHandlingProf) {
        this.AnimalHandlingProf = AnimalHandlingProf;
        setAnimalHandling(AnimalHandlingProf ? (getWISmod() + ProficiencyBonus) : getWISmod());
    }
    public void setArcanaProf(boolean ArcanaProf) {
        this.ArcanaProf = ArcanaProf;
        setArcana(ArcanaProf ? (getINTmod() + ProficiencyBonus) : getINTmod());
    }
    public void setAthleticsProf(boolean AthleticsProf) {
        this.AthleticsProf = AthleticsProf;
        setAthletics(AthleticsProf ? (getSTRmod() + ProficiencyBonus) : getSTRmod());
    }
    public void setDeceptionProf(boolean DeceptionProf) {
        this.DeceptionProf = DeceptionProf;
        setDeception(DeceptionProf ? (getCHAmod() + ProficiencyBonus) : getCHAmod());
    }
    public void setHistoryProf(boolean HistoryProf) {
        this.HistoryProf = HistoryProf;
        setHistory(HistoryProf ? (getINTmod() + ProficiencyBonus) : getINTmod());
    }
    public void setInsightProf(boolean InsightProf) {
        this.InsightProf = InsightProf;
        setInsight(InsightProf ? (getWISmod() + ProficiencyBonus) : getWISmod());
    }
    public void setIntimidationProf(boolean IntimidationProf) {
        this.IntimidationProf = IntimidationProf;
        setIntimidation(IntimidationProf ? (getCHAmod() + ProficiencyBonus) : getCHAmod());
    }
    public void setInvestigationProf(boolean InvestigationProf) {
        this.InvestigationProf = InvestigationProf;
        setInvestigation(InvestigationProf ? (getINTmod() + ProficiencyBonus) : getINTmod());
    }
    public void setMedicineProf(boolean MedicineProf) {
        this.MedicineProf = MedicineProf;
        setMedicine(MedicineProf ? (getWISmod() + ProficiencyBonus) : getWISmod());
    }
    public void setNatureProf(boolean NatureProf) {
        this.NatureProf = NatureProf;
        setNature(NatureProf ? (getINTmod() + ProficiencyBonus) : getINTmod());
    }
    public void setPerceptionProf(boolean PerceptionProf) {
        this.PerceptionProf = PerceptionProf;
        setPerception(PerceptionProf ? (getWISmod() + ProficiencyBonus) : getWISmod());
    }
    public void setPerformanceProf(boolean PerformanceProf) {
        this.PerformanceProf = PerformanceProf;
        setPerformance(PerformanceProf ? (getCHAmod() + ProficiencyBonus) : getCHAmod());
    }
    public void setPersuasionProf(boolean PersuasionProf) {
        this.PersuasionProf = PersuasionProf;
        setPersuasion(PersuasionProf ? (getCHAmod() + ProficiencyBonus) : getCHAmod());
    }
    public void setReligionProf(boolean ReligionProf) {
        this.ReligionProf = ReligionProf;
        setReligion(ReligionProf ? (getWISmod() + ProficiencyBonus) : getWISmod());
    }
    public void setSleightOfHandProf(boolean SleightOfHandProf) {
        this.SleightOfHandProf = SleightOfHandProf;
        setSleightOfHand(SleightOfHandProf ? (getDEXmod() + ProficiencyBonus) : getDEXmod());
    }
    public void setStealthProf(boolean StealthProf) {
        this.StealthProf = StealthProf;
        setStealth(StealthProf ? (getDEXmod() + ProficiencyBonus) : getDEXmod());
    }
    public void setSurvivalProf(boolean SurvivalProf) {
        this.SurvivalProf = SurvivalProf;
        setSurvival(SurvivalProf ? (getWISmod() + ProficiencyBonus) : getWISmod());
    }

    public void setAllSkillProfs(boolean[] SkillProfs) {
        if (SkillProfs.length == 18) {
            setAcrobaticsProf(SkillProfs[0]);
            setAnimalHandlingProf(SkillProfs[1]);
            setArcanaProf(SkillProfs[2]);
            setAthleticsProf(SkillProfs[3]);
            setDeceptionProf(SkillProfs[4]);
            setHistoryProf(SkillProfs[5]);
            setInsightProf(SkillProfs[6]);
            setIntimidationProf(SkillProfs[7]);
            setInvestigationProf(SkillProfs[8]);
            setMedicineProf(SkillProfs[9]);
            setNatureProf(SkillProfs[10]);
            setPerceptionProf(SkillProfs[11]);
            setPerformanceProf(SkillProfs[12]);
            setPersuasionProf(SkillProfs[13]);
            setReligionProf(SkillProfs[14]);
            setSleightOfHandProf(SkillProfs[15]);
            setStealthProf(SkillProfs[16]);
            setSurvivalProf(SkillProfs[17]);
        }
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
    public Char(int[] AbilityScores, boolean[] STprofs, boolean[] SkillProfs) {
        if (AbilityScores.length == 6 && STprofs.length == 6 && SkillProfs.length == 18) {
            setAllAbilityScores(AbilityScores);
            setAllSTprofs(STprofs);
            setAllSkillProfs(SkillProfs);
            setBaseAC();
        }
    }

}