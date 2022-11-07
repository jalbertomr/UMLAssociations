package UMLAssociations;

public class File {
    String name;
    String content;
    Long size;

    public File(String name, String content) {
        this.name = name;
        this.content = content;
    }

    @Override
    public String toString() {
        return "File{" +
                "name='" + name + '\'' +
                ", content='" + content + '\'' +
                ", size=" + content.length() +
                '}';
    }
}
