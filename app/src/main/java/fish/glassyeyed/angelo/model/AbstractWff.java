package fish.glassyeyed.angelo.model;

import java.util.Set;

public abstract class AbstractWff extends AbstractStatement {
    public abstract Set<String> getAtoms();
}
