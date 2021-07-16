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

    int AC = 10 + DEXmod;
    int initiative = DEXmod;

    //Saving Throws
    //Saving Throw Proficiencies
    boolean STRSTprof;
    boolean DEXSTprof;
    boolean CONSTprof;
    boolean INTSTprof;
    boolean WISSTprof;
    boolean CHASTprof;

    //Saving Throw Modifiers
    int STRST = STRSTprof ? (STRmod + ProficiencyBonus) : STRmod;
    int DEXST = DEXSTprof ? (DEXmod + ProficiencyBonus) : DEXmod;
    int CONST = CONSTprof ? (CONmod + ProficiencyBonus) : CONmod;
    int INTST = INTSTprof ? (INTmod + ProficiencyBonus) : INTmod;
    int WISST = WISSTprof ? (WISmod + ProficiencyBonus) : WISmod;
    int CHAST = CHASTprof ? (CHAmod + ProficiencyBonus) : CHAmod;

    //Skills
    //Skill Proficiencies
    boolean AcrobaticsProf;
    boolean AnimalHandlingProf;
    boolean ArcanaProf;
    boolean AthleticsProf;
    boolean DeceptionProf;
    boolean HistoryProf;
    boolean InsightProf;
    boolean IntimidationProf;
    boolean InvestigationProf;
    boolean MedicineProf;
    boolean NatureProf;
    boolean PerceptionProf;
    boolean PerformanceProf;
    boolean PersuasionProf;
    boolean ReligionProf;
    boolean SleightOfHandProf;
    boolean StealthProf;
    boolean SurvivalProf;

    //Skill Modifiers
    int Acrobatics = AcrobaticsProf ? (DEXmod + ProficiencyBonus) : DEXmod;
    int AnimalHandling = AnimalHandlingProf ? (WISmod + ProficiencyBonus) : WISmod;
    int Arcana = ArcanaProf ? (INTmod + ProficiencyBonus) : INTmod;
    int Athletics = AthleticsProf ? (STRmod + ProficiencyBonus) : STRmod;
    int Deception = DeceptionProf ? (CHAmod + ProficiencyBonus) : CHAmod;
    int History = HistoryProf ? (INTmod + ProficiencyBonus) : INTmod;
    int Insight = InsightProf ? (WISmod + ProficiencyBonus) : WISmod;
    int Intimidation = IntimidationProf ? (CHAmod + ProficiencyBonus) : CHAmod;
    int Investigation = InvestigationProf ? (INTmod + ProficiencyBonus) : INTmod;
    int Medicine = MedicineProf ? (WISmod + ProficiencyBonus) : WISmod;
    int Nature = NatureProf ? (INTmod + ProficiencyBonus) : INTmod;
    int Perception = PerceptionProf ? (WISmod + ProficiencyBonus) : WISmod;
    int Performance = PerformanceProf ? (CHAmod + ProficiencyBonus) : CHAmod;
    int Persuasion = PersuasionProf ? (CHAmod + ProficiencyBonus) : CHAmod;
    int Religion = ReligionProf ? (INTmod + ProficiencyBonus) : INTmod;
    int SleightofHand = SleightOfHandProf ? (DEXmod + ProficiencyBonus) : DEXmod;
    int Stealth = StealthProf ? (DEXmod + ProficiencyBonus) : DEXmod;
    int Survival = SurvivalProf ? (WISmod + ProficiencyBonus) : WISmod;

    //Passive Skills
    int PassiveInsight = 10 + Insight;
    int PassiveInvestigation = 10 + Investigation;
    int PassivePerception = 10 + Perception;
    int PassiveStealth = 10 + Stealth;

    //Constructors
    public Char(int[] AbilityScores, boolean[] STprofs, boolean[] SkillProfs) {
        if (AbilityScores.length == 6 && STprofs.length == 6 && SkillProfs.length == 18) {
            setSTR(AbilityScores[0]);
            setDEX(AbilityScores[1]);
            setCON(AbilityScores[2]);
            setINT(AbilityScores[3]);
            setWIS(AbilityScores[4]);
            setCHA(AbilityScores[5]);
    
            STRSTprof = STprofs[0];
            DEXSTprof = STprofs[1];
            CONSTprof = STprofs[2];
            INTSTprof = STprofs[3];
            WISSTprof = STprofs[4];
            CHASTprof = STprofs[5];
            AcrobaticsProf = SkillProfs[0];
            AnimalHandlingProf = SkillProfs[1];
            ArcanaProf = SkillProfs[2];
            AthleticsProf = SkillProfs[3];
            DeceptionProf = SkillProfs[4];
            HistoryProf = SkillProfs[5];
            InsightProf = SkillProfs[6];
            IntimidationProf = SkillProfs[7];
            InvestigationProf = SkillProfs[8];
            MedicineProf = SkillProfs[9];
            NatureProf = SkillProfs[10];
            PerceptionProf = SkillProfs[11];
            PerformanceProf = SkillProfs[12];
            PersuasionProf = SkillProfs[13];
            ReligionProf = SkillProfs[14];
            SleightOfHandProf = SkillProfs[15];
            StealthProf = SkillProfs[16];
            SurvivalProf = SkillProfs[17];
        }
    }

}