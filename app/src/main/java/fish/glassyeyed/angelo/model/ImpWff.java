package fish.glassyeyed.angelo.model;

import java.util.Set;

public class ImpWff extends AbstractWff {
    private final AbstractWff leftChild;
    private final AbstractWff rightChild;

    public ImpWff(AbstractWff leftChild, AbstractWff rightChild) {
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }

    @Override
    public Set<String> getAtoms() {
        Set<String> atoms = leftChild.getAtoms();
        atoms.addAll(rightChild.getAtoms());
        return atoms;
    }

    @Override
    public String prettyPrint() {
        return "(" + leftChild.prettyPrint() + " -> " + rightChild.prettyPrint() + ")";
    }
}
