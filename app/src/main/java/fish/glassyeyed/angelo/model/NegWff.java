package fish.glassyeyed.angelo.model;

public class NegWff extends AbstractWff {
    private final AbstractWff child;

    public NegWff(AbstractWff child) {
        this.child = child;
    }

    @Override
    public String prettyPrint() {
        return "~" + child.prettyPrint();
    }
}
