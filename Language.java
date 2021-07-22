public class Language {
    private String name;
    private String script;
    private String[] speakers;
    private boolean exotic;
    private String dialect;
    private String description;

    public Language() {
    }

    public Language(String name, String script, String[] speakers, boolean exotic, String dialect, String description) {
        this.name = name;
        this.script = script;
        this.speakers = speakers;
        this.exotic = exotic;
        this.dialect = dialect;
        this.description = description;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getScript() {
        return this.script;
    }

    public void setScript(String script) {
        this.script = script;
    }

    public String[] getSpeakers() {
        return this.speakers;
    }

    public void setSpeakers(String[] speakers) {
        this.speakers = speakers;
    }

    public String getDialect() {
        return this.dialect;
    }

    public void setDialect(String dialect) {
        this.dialect = dialect;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Language name(String name) {
        setName(name);
        return this;
    }

    public Language script(String script) {
        setScript(script);
        return this;
    }

    public Language speakers(String[] speakers) {
        setSpeakers(speakers);
        return this;
    }

    public Language dialect(String dialect) {
        setDialect(dialect);
        return this;
    }

    public Language description(String description) {
        setDescription(description);
        return this;
    }

    public boolean isExotic() {
        return this.exotic;
    }

    public boolean getExotic() {
        return this.exotic;
    }

    public void setExotic(boolean exotic) {
        this.exotic = exotic;
    }

}
