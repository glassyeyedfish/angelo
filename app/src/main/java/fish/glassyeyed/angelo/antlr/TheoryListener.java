// Generated from Theory.g4 by ANTLR 4.5

package fish.glassyeyed.angelo.antlr;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TheoryParser}.
 */
public interface TheoryListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TheoryParser#theory}.
	 * @param ctx the parse tree
	 */
	void enterTheory(TheoryParser.TheoryContext ctx);
	/**
	 * Exit a parse tree produced by {@link TheoryParser#theory}.
	 * @param ctx the parse tree
	 */
	void exitTheory(TheoryParser.TheoryContext ctx);
}