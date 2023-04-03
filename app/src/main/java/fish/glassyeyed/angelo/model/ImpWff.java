package fish.glassyeyed.angelo.model;

public class ImpWff extends AbstractWff {
    private final AbstractWff leftChild;
    private final AbstractWff rightChild;

    public ImpWff(AbstractWff leftChild, AbstractWff rightChild) {
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }

    @Override
    public String prettyPrint() {
        return "(" + leftChild.prettyPrint() + " -> " + rightChild.prettyPrint() + ")";
    }
}
