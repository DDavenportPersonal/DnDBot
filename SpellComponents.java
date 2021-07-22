public class SpellComponents {
    private boolean V;
    private boolean S;
    private boolean M;
    private String materials;

    public SpellComponents() {
    }

    public SpellComponents(boolean V, boolean S, boolean M, String materials) {
        this.V = V;
        this.S = S;
        this.M = M;
        this.materials = materials;
    }

    public boolean isV() {
        return this.V;
    }

    public boolean getV() {
        return this.V;
    }

    public void setV(boolean V) {
        this.V = V;
    }

    public boolean isS() {
        return this.S;
    }

    public boolean getS() {
        return this.S;
    }

    public void setS(boolean S) {
        this.S = S;
    }

    public boolean isM() {
        return this.M;
    }

    public boolean getM() {
        return this.M;
    }

    public void setM(boolean M) {
        this.M = M;
    }

    public String getMaterials() {
        return this.materials;
    }

    public void setMaterials(String materials) {
        this.materials = materials;
    }

    public SpellComponents V(boolean V) {
        setV(V);
        return this;
    }

    public SpellComponents S(boolean S) {
        setS(S);
        return this;
    }

    public SpellComponents M(boolean M) {
        setM(M);
        return this;
    }

    public SpellComponents materials(String materials) {
        setMaterials(materials);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " V='" + isV() + "'" +
            ", S='" + isS() + "'" +
            ", M='" + isM() + "'" +
            ", materials='" + getMaterials() + "'" +
            "}";
    }

}
