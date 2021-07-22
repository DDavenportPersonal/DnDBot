import java.util.ArrayList;

public class Race {
    private AbilityScores ASI;
    private String age;
    private String alignment;
    private String size;
    private enum sizeCat{
        TINY,
        SMALL,
        MEDIUM,
        LARGE,
        HUGE,
        GARGANTUAN
    };
    private int speed;
    private ArrayList<Tools> tools;
    private ArrayList<Language> languages;
    private ArrayList<Feature> feats;

    public AbilityScores getASI() {
        return ASI;
    }

    public void setASI(AbilityScores ASI) {
        this.ASI = ASI;
    }

    public String getAge() {
        return this.age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAlignment() {
        return this.alignment;
    }

    public void setAlignment(String alignment) {
        this.alignment = alignment;
    }

    public String getSize() {
        return this.size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public ArrayList<Tools> getTools() {
        return this.tools;
    }

    public void setTools(ArrayList<Tools> toolProfs) {
        this.tools = toolProfs;
    }

    public ArrayList<Language> getLanguages() {
        return this.languages;
    }

    public void setLanguages(ArrayList<Language> languages) {
        this.languages = languages;
    }

    public ArrayList<Feature> getFeats() {
        return this.feats;
    }

    public void setFeats(ArrayList<Feature> feats) {
        this.feats = feats;
    }

}
