import java.util.ArrayList;

public class Subrace {
    private AbilityScores ASI;
    private ArrayList<Feature> feats;

    public AbilityScores getASI() {
        return this.ASI;
    }

    public void setASI(AbilityScores ASI) {
        this.ASI = ASI;
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

    public Subrace(AbilityScores ASI, ArrayList<Feature> feats) {
        this.ASI = ASI;
        this.feats = feats;
    }

}
