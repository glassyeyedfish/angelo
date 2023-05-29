package fish.glassyeyed.angelo.model;

import java.util.List;

public class ImpWff extends AbstractWff {
    private final AbstractWff leftChild;
    private final AbstractWff rightChild;

    public ImpWff(AbstractWff leftChild, AbstractWff rightChild) {
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }

    @Override
    public List<String> getAtoms() {
        List<String> atoms = leftChild.getAtoms();
        atoms.addAll(rightChild.getAtoms());
        return atoms;
    }

    @Override
    public String prettyPrint() {
        return "(" + leftChild.prettyPrint() + " -> " + rightChild.prettyPrint() + ")";
    }
}
