package UMLAssociations;

import java.util.ArrayList;
import java.util.List;

public class Folder {
    List<File> files = new ArrayList<>();

    public Folder(List<File> files) {
        this.files = files;
    }

    @Override
    public String toString() {
        return "Folder{" +
                "files=" + files +
                '}';
    }
}
