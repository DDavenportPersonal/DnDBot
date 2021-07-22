import java.util.ArrayList;

public class Subrace {
    private ASI asi;
    private ArrayList<Feature> feats;

    public ASI getAsi() {
        return this.asi;
    }

    public void setAsi(ASI asi) {
        this.asi = asi;
    }

    public ArrayList<Feature> getFeats() {
        return this.feats;
    }

    public void setFeats(ArrayList<Feature> feats) {
        this.feats = feats;
    }

    public void addFeat(Feature feat) {
        this.getFeats().add(feat);
    }

    public Subrace(ASI asi, ArrayList<Feature> feats) {
        this.asi = asi;
        this.feats = feats;
    }

}
