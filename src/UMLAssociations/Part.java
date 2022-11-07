package UMLAssociations;

public class Part {
    public String name;
    public boolean isFunctional = true;

    public Part(String name) {
        this.name = name;
    }

    public void fix(){
        if(!isFunctional){
            isFunctional = true;
        }
    }

    @Override
    public String toString() {
        return "Part{" +
                "name='" + name + '\'' +
                ", isFunctional=" + isFunctional +
                '}';
    }
}
