package fish.glassyeyed.angelo.model;

import java.util.Set;

public class ImpWff extends AbstractWff {
    private final AbstractStatement leftChild;
    private final AbstractStatement rightChild;

    public ImpWff(AbstractStatement leftChild, AbstractStatement rightChild) {
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
    public String toPrettyString() {
        return "(" + leftChild.toPrettyString() + " -> " + rightChild.toPrettyString() + ")";
    }
}
