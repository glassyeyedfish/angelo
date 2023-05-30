package fish.glassyeyed.angelo.model;

import java.util.Set;

public class NegWff extends AbstractWff {
    private final AbstractWff child;

    public NegWff(AbstractWff child) {
        this.child = child;
    }

    @Override
    public Set<String> getAtoms() {
        return child.getAtoms();
    }

    @Override
    public String prettyPrint() {
        return "~" + child.prettyPrint();
    }
}
