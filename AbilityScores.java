import java.util.Objects;

public class AbilityScores {
    private int STR;
    private int DEX;
    private int CON;
    private int INT;
    private int WIS;
    private int CHA;

    public AbilityScores() {
    }

    public AbilityScores(int STR, int DEX, int CON, int INT, int WIS, int CHA) {
        this.STR = STR;
        this.DEX = DEX;
        this.CON = CON;
        this.INT = INT;
        this.WIS = WIS;
        this.CHA = CHA;
    }

    public int getSTR() {
        return this.STR;
    }

    public int STRmod() {
        return (this.STR - 10) / 2;
    }

    public void setSTR(int STR) {
        this.STR = STR;
    }

    public int getDEX() {
        return this.DEX;
    }

    public int DEXmod() {
        return (this.DEX - 10) / 2;
    }

    public void setDEX(int DEX) {
        this.DEX = DEX;
    }

    public int getCON() {
        return this.CON;
    }

    public int CONmod() {
        return (this.CON - 10) / 2;
    }

    public void setCON(int CON) {
        this.CON = CON;
    }

    public int getINT() {
        return this.INT;
    }

    public int INTmod() {
        return (this.INT - 10) / 2;
    }

    public void setINT(int INT) {
        this.INT = INT;
    }

    public int getWIS() {
        return this.WIS;
    }

    public int WISmod() {
        return (this.WIS - 10) / 2;
    }

    public void setWIS(int WIS) {
        this.WIS = WIS;
    }

    public int getCHA() {
        return this.CHA;
    }

    public int CHAmod() {
        return (this.CHA - 10) / 2;
    }

    public void setCHA(int CHA) {
        this.CHA = CHA;
    }

    public AbilityScores STR(int STR) {
        setSTR(STR);
        return this;
    }

    public AbilityScores DEX(int DEX) {
        setDEX(DEX);
        return this;
    }

    public AbilityScores CON(int CON) {
        setCON(CON);
        return this;
    }

    public AbilityScores INT(int INT) {
        setINT(INT);
        return this;
    }

    public AbilityScores WIS(int WIS) {
        setWIS(WIS);
        return this;
    }

    public AbilityScores CHA(int CHA) {
        setCHA(CHA);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof AbilityScores)) {
            return false;
        }
        AbilityScores abilityScores = (AbilityScores) o;
        return STR == abilityScores.STR && DEX == abilityScores.DEX && CON == abilityScores.CON && INT == abilityScores.INT && WIS == abilityScores.WIS && CHA == abilityScores.CHA;
    }

    @Override
    public int hashCode() {
        return Objects.hash(STR, DEX, CON, INT, WIS, CHA);
    }

    @Override
    public String toString() {
        return "{" +
            " STR='" + getSTR() + "'" +
            ", DEX='" + getDEX() + "'" +
            ", CON='" + getCON() + "'" +
            ", INT='" + getINT() + "'" +
            ", WIS='" + getWIS() + "'" +
            ", CHA='" + getCHA() + "'" +
            "}";
    }

}
