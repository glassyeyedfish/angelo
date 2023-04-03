// Generated from Angelo.g4 by ANTLR 4.10

package fish.glassyeyed.angelo.antlr;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AngeloParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AngeloVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code Program}
	 * labeled alternative in {@link AngeloParser#prog_r}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(AngeloParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AtomicWff}
	 * labeled alternative in {@link AngeloParser#wff_r}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomicWff(AngeloParser.AtomicWffContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NegWff}
	 * labeled alternative in {@link AngeloParser#wff_r}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegWff(AngeloParser.NegWffContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ImpWff}
	 * labeled alternative in {@link AngeloParser#wff_r}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImpWff(AngeloParser.ImpWffContext ctx);
}