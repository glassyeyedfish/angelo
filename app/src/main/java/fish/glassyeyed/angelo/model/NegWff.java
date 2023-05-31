package fish.glassyeyed.angelo.model;

import java.util.Set;

public class NegWff extends AbstractWff {
    private final AbstractStatement child;

    public NegWff(AbstractStatement child) {
        this.child = child;
    }

    @Override
    public Set<String> getAtoms() {
        return child.getAtoms();
    }

    @Override
    public String toPrettyString() {
        return "~" + child.toPrettyString();
    }
}
