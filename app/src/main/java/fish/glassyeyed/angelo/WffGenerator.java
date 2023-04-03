package fish.glassyeyed.angelo;

import fish.glassyeyed.angelo.antlr.AngeloBaseListener;
import fish.glassyeyed.angelo.antlr.AngeloBaseVisitor;
import fish.glassyeyed.angelo.antlr.AngeloParser;
import fish.glassyeyed.angelo.model.AbstractWff;
import fish.glassyeyed.angelo.model.AtomicWff;
import fish.glassyeyed.angelo.model.ImpWff;
import fish.glassyeyed.angelo.model.NegWff;

public class WffGenerator extends AngeloBaseVisitor<AbstractWff> {
    @Override
    public AbstractWff visitProgram(AngeloParser.ProgramContext ctx) {
        return this.visit(ctx.wff_r());
    }

    @Override
    public AbstractWff visitAtomicWff(AngeloParser.AtomicWffContext ctx) {
        return new AtomicWff(ctx.ID().getText());
    }

    @Override
    public AbstractWff visitNegWff(AngeloParser.NegWffContext ctx) {
        return new NegWff(this.visit(ctx.wff_r()));
    }

    @Override
    public AbstractWff visitImpWff(AngeloParser.ImpWffContext ctx) {
        return new ImpWff(this.visit(ctx.wff_r(0)), this.visit(ctx.wff_r(1)));
    }
}
