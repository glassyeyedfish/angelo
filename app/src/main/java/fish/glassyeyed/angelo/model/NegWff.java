package fish.glassyeyed.angelo.model;

import java.util.List;

public class NegWff extends AbstractWff {
    private final AbstractWff child;

    public NegWff(AbstractWff child) {
        this.child = child;
    }

    @Override
    public List<String> getAtoms() {
        return child.getAtoms();
    }

    @Override
    public String prettyPrint() {
        return "~" + child.prettyPrint();
    }
}
