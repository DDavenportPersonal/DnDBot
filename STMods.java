import java.util.Objects;

public class STMods {
    private int STRST;
    private int DEXST;
    private int CONST;
    private int INTST;
    private int WISST;
    private int CHAST;

    public STMods() {
    }

    public STMods(int STRST, int DEXST, int CONST, int INTST, int WISST, int CHAST) {
        this.STRST = STRST;
        this.DEXST = DEXST;
        this.CONST = CONST;
        this.INTST = INTST;
        this.WISST = WISST;
        this.CHAST = CHAST;
    }

    public int getSTR() {
        return this.STRST;
    }

    public void setSTR(int STRST) {
        this.STRST = STRST;
    }

    public int getDEX() {
        return this.DEXST;
    }

    public void setDEX(int DEXST) {
        this.DEXST = DEXST;
    }

    public int getCON() {
        return this.CONST;
    }

    public void setCON(int CONST) {
        this.CONST = CONST;
    }

    public int getINT() {
        return this.INTST;
    }

    public void setINT(int INTST) {
        this.INTST = INTST;
    }

    public int getWIS() {
        return this.WISST;
    }

    public void setWIS(int WISST) {
        this.WISST = WISST;
    }

    public int getCHA() {
        return this.CHAST;
    }

    public void setCHA(int CHAST) {
        this.CHAST = CHAST;
    }

    public STMods STRST(int STRST) {
        setSTR(STRST);
        return this;
    }

    public STMods DEXST(int DEXST) {
        setDEX(DEXST);
        return this;
    }

    public STMods CONST(int CONST) {
        setCON(CONST);
        return this;
    }

    public STMods INTST(int INTST) {
        setINT(INTST);
        return this;
    }

    public STMods WISST(int WISST) {
        setWIS(WISST);
        return this;
    }

    public STMods CHAST(int CHAST) {
        setCHA(CHAST);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof STMods)) {
            return false;
        }
        STMods sTMods = (STMods) o;
        return STRST == sTMods.STRST && DEXST == sTMods.DEXST && CONST == sTMods.CONST && INTST == sTMods.INTST && WISST == sTMods.WISST && CHAST == sTMods.CHAST;
    }

    @Override
    public int hashCode() {
        return Objects.hash(STRST, DEXST, CONST, INTST, WISST, CHAST);
    }

    @Override
    public String toString() {
        return "{" +
            " STRST='" + getSTR() + "'" +
            ", DEXST='" + getDEX() + "'" +
            ", CONST='" + getCON() + "'" +
            ", INTST='" + getINT() + "'" +
            ", WISST='" + getWIS() + "'" +
            ", CHAST='" + getCHA() + "'" +
            "}";
    }

}
