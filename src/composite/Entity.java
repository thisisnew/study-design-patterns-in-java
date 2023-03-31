package composite;

import java.util.Map;

public abstract class Entity {
    public abstract String getName();

    public abstract int getSize();

    public Map.Entry add(Map.Entry entry) throws FileTreatmentException {
        throw new FileTreatmentException();
    }

    public void printList() {
        printList("");
    }

    protected abstract void printList(String prefix);

    @Override
    public String toString() {
        return getName() + " (" + getSize() + ")";
    }
}
