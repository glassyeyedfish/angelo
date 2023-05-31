package fish.glassyeyed.angelo;

import fish.glassyeyed.angelo.antlr.AngeloBaseVisitor;
import fish.glassyeyed.angelo.antlr.AngeloParser;
import fish.glassyeyed.angelo.model.*;

public class ModelGenerator extends AngeloBaseVisitor<AbstractStatement> {
    // TODO reimplement functions
    @Override
    public Program visitProgram(AngeloParser.ProgramContext ctx) {
    }

    @Override
    public AbstractStatement visitAtomicWff(AngeloParser.AtomicWffContext ctx) {
    }

    @Override
    public AbstractStatement visitNegWff(AngeloParser.NegWffContext ctx) {
    }

    @Override
    public AbstractStatement visitImpWff(AngeloParser.ImpWffContext ctx) {
    }
}
