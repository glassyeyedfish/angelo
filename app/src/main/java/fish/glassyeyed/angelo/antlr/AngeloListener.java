// Generated from Angelo.g4 by ANTLR 4.10

package fish.glassyeyed.angelo.antlr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AngeloParser}.
 */
public interface AngeloListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code Program}
	 * labeled alternative in {@link AngeloParser#prog_r}.
	 * @param ctx the parse tree
	 */
	void enterProgram(AngeloParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Program}
	 * labeled alternative in {@link AngeloParser#prog_r}.
	 * @param ctx the parse tree
	 */
	void exitProgram(AngeloParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AtomicWff}
	 * labeled alternative in {@link AngeloParser#wff_r}.
	 * @param ctx the parse tree
	 */
	void enterAtomicWff(AngeloParser.AtomicWffContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AtomicWff}
	 * labeled alternative in {@link AngeloParser#wff_r}.
	 * @param ctx the parse tree
	 */
	void exitAtomicWff(AngeloParser.AtomicWffContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NegWff}
	 * labeled alternative in {@link AngeloParser#wff_r}.
	 * @param ctx the parse tree
	 */
	void enterNegWff(AngeloParser.NegWffContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NegWff}
	 * labeled alternative in {@link AngeloParser#wff_r}.
	 * @param ctx the parse tree
	 */
	void exitNegWff(AngeloParser.NegWffContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ImpWff}
	 * labeled alternative in {@link AngeloParser#wff_r}.
	 * @param ctx the parse tree
	 */
	void enterImpWff(AngeloParser.ImpWffContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ImpWff}
	 * labeled alternative in {@link AngeloParser#wff_r}.
	 * @param ctx the parse tree
	 */
	void exitImpWff(AngeloParser.ImpWffContext ctx);
}