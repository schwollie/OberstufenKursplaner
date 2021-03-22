
public class Subject {

    private String name;
    private String shortName = "NotSpecified";

    public Subject(String name, String shortName) {
        this.name = name;
        this.shortName = shortName;
    }

    public Subject(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "name='" + name + '\'' +
                ", shortName='" + shortName + '\'' +
                '}';
    }
}
