package fish.glassyeyed.angelo.model;

import java.util.Set;

public abstract class AbstractWff {
    // TODO Use set instead of list to ensure no duplicates.
    public abstract Set<String> getAtoms();
    public abstract String prettyPrint();
}
