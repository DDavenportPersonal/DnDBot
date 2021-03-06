public class Spell {
    private String name;
    private int level;
    private String castingTime;
    private String school;
    private boolean concentration;
    private boolean ritual;
    private String range;
    private SpellComponents components;
    private String duration;
    private String description;
    private CharClass[] classes;
    private String source;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return this.level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getCastingTime() {
        return this.castingTime;
    }

    public void setCastingTime(String castingTime) {
        this.castingTime = castingTime;
    }

    public String getSchool() {
        return this.school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public boolean isConcentration() {
        return this.concentration;
    }

    public boolean getConcentration() {
        return this.concentration;
    }

    public void setConcentration(boolean concentration) {
        this.concentration = concentration;
    }

    public boolean isRitual() {
        return this.ritual;
    }

    public boolean getritual() {
        return this.ritual;
    }

    public void setRitual(boolean ritual) {
        this.ritual = ritual;
    }

    public String getRange() {
        return this.range;
    }

    public void setRange(String range) {
        this.range = range;
    }

    public SpellComponents getComponents() {
        return this.components;
    }

    public void setComponents(SpellComponents components) {
        this.components = components;
    }

    public String getDuration() {
        return this.duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CharClass[] getClasses() {
        return this.classes;
    }

    public void setClasses(CharClass[] classes) {
        this.classes = classes;
    }

    public String getSource() {
        return this.source;
    }

    public void setSource(String source) {
        this.source = source;
    }


    public Spell(String name, int level, String castingTime, String school, boolean concentration, String range, SpellComponents components, String duration, String description, CharClass[] classes, Subclass[] subclasses, Race[] races, String source) {
        this.name = name;
        this.level = level;
        this.castingTime = castingTime;
        this.school = school;
        this.concentration = concentration;
        this.range = range;
        this.components = components;
        this.duration = duration;
        this.description = description;
        this.classes = classes;
        this.source = source;
    }

}
