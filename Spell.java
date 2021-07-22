public class Spell {
    private String name;
    private int level;
    private String castingTime;
    private enum school{
        ABJURATION,
        CONJURATION,
        DIVINATION,
        ENCHANTMENT,
        EVOCATION,
        ILLUSION,
        NECROMANCY,
        PSIONIC,
        TRANSMUTATION
    };
    private boolean concentration;
    private String range;
    private String components;
    private String duration;
    private String description;
    private CharClass[] classes;
    private Subclass[] subclasses;
    private Race[] races;
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

    public boolean isConcentration() {
        return this.concentration;
    }

    public boolean getConcentration() {
        return this.concentration;
    }

    public void setConcentration(boolean concentration) {
        this.concentration = concentration;
    }

    public String getRange() {
        return this.range;
    }

    public void setRange(String range) {
        this.range = range;
    }

    public String getComponents() {
        return this.components;
    }

    public void setComponents(String components) {
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

    public Subclass[] getSubclasses() {
        return this.subclasses;
    }

    public void setSubclasses(Subclass[] subclasses) {
        this.subclasses = subclasses;
    }

    public Race[] getRaces() {
        return this.races;
    }

    public void setRaces(Race[] races) {
        this.races = races;
    }

    public String getSource() {
        return this.source;
    }

    public void setSource(String source) {
        this.source = source;
    }


    public Spell(String name, int level, String castingTime, boolean concentration, String range, String components, String duration, String description, CharClass[] classes, Subclass[] subclasses, Race[] races, String source) {
        this.name = name;
        this.level = level;
        this.castingTime = castingTime;
        this.concentration = concentration;
        this.range = range;
        this.components = components;
        this.duration = duration;
        this.description = description;
        this.classes = classes;
        this.subclasses = subclasses;
        this.races = races;
        this.source = source;
    }

}
