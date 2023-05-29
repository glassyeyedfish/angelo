package fish.glassyeyed.angelo.model;

import java.util.List;

public abstract class AbstractWff {
    // TODO Use set instead of list to ensure no duplicates.
    public abstract List<String> getAtoms();
    public abstract String prettyPrint();
}
