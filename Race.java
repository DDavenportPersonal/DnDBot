import java.util.ArrayList;

public class Race {
    private ASI asi;
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
    private String[] toolProfs;
    private String[] languages;
    private ArrayList<Feature> feats;

    public ASI getASI() {
        return asi;
    }

    public void setASI(ASI asi) {
        this.asi = asi;
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

    public ArrayList<Feature> getFeats() {
        return this.feats;
    }

    public void setFeats(ArrayList<Feature> feats) {
        this.feats = feats;
    }

}
