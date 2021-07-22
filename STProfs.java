import java.util.Objects;

public class STProfs {
    private boolean STRSTprof;
    private boolean DEXSTprof;
    private boolean CONSTprof;
    private boolean INTSTprof;
    private boolean WISSTprof;
    private boolean CHASTprof;

    public STProfs() {
    }

    public STProfs(boolean STRSTprof, boolean DEXSTprof, boolean CONSTprof, boolean INTSTprof, boolean WISSTprof, boolean CHASTprof) {
        this.STRSTprof = STRSTprof;
        this.DEXSTprof = DEXSTprof;
        this.CONSTprof = CONSTprof;
        this.INTSTprof = INTSTprof;
        this.WISSTprof = WISSTprof;
        this.CHASTprof = CHASTprof;
    }

    public boolean getSTR() {
        return this.STRSTprof;
    }

    public void setSTR(boolean STRSTprof) {
        this.STRSTprof = STRSTprof;
    }

    public boolean getDEX() {
        return this.DEXSTprof;
    }

    public void setDEX(boolean DEXSTprof) {
        this.DEXSTprof = DEXSTprof;
    }

    public boolean getCON() {
        return this.CONSTprof;
    }

    public void setCON(boolean CONSTprof) {
        this.CONSTprof = CONSTprof;
    }

    public boolean getINT() {
        return this.INTSTprof;
    }

    public void setINT(boolean INTSTprof) {
        this.INTSTprof = INTSTprof;
    }

    public boolean getWIS() {
        return this.WISSTprof;
    }

    public void setWIS(boolean WISSTprof) {
        this.WISSTprof = WISSTprof;
    }

    public boolean getCHA() {
        return this.CHASTprof;
    }

    public void setCHA(boolean CHASTprof) {
        this.CHASTprof = CHASTprof;
    }

    public STProfs STRSTprof(boolean STRSTprof) {
        setSTR(STRSTprof);
        return this;
    }

    public STProfs DEXSTprof(boolean DEXSTprof) {
        setDEX(DEXSTprof);
        return this;
    }

    public STProfs CONSTprof(boolean CONSTprof) {
        setCON(CONSTprof);
        return this;
    }

    public STProfs INTSTprof(boolean INTSTprof) {
        setINT(INTSTprof);
        return this;
    }

    public STProfs WISSTprof(boolean WISSTprof) {
        setWIS(WISSTprof);
        return this;
    }

    public STProfs CHASTprof(boolean CHASTprof) {
        setCHA(CHASTprof);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof STProfs)) {
            return false;
        }
        STProfs sTProfs = (STProfs) o;
        return STRSTprof == sTProfs.STRSTprof && DEXSTprof == sTProfs.DEXSTprof && CONSTprof == sTProfs.CONSTprof && INTSTprof == sTProfs.INTSTprof && WISSTprof == sTProfs.WISSTprof && CHASTprof == sTProfs.CHASTprof;
    }

    @Override
    public int hashCode() {
        return Objects.hash(STRSTprof, DEXSTprof, CONSTprof, INTSTprof, WISSTprof, CHASTprof);
    }

    @Override
    public String toString() {
        return "{" +
            " STRSTprof='" + getSTR() + "'" +
            ", DEXSTprof='" + getDEX() + "'" +
            ", CONSTprof='" + getCON() + "'" +
            ", INTSTprof='" + getINT() + "'" +
            ", WISSTprof='" + getWIS() + "'" +
            ", CHASTprof='" + getCHA() + "'" +
            "}";
    }

}
