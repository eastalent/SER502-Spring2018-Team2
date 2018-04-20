package intermediate.inter;

import intermediate.lexer.Token;
import intermediate.symbol.Type;

import java.io.PrintWriter;

public class Expression extends Node {
    public Token op;
    public Type type;

    public Expression(Token tok, Type p) {
        op = tok;
        type = p;
    }

    public Expression generateInterCode(PrintWriter writer) {
        return this;
    }

    public Expression reduce(PrintWriter writer) {
        return this;
    }

    public void jump (int trueTarget, int falseTarget, PrintWriter writer) {
        printJumps(toString(), trueTarget, falseTarget, writer);
    }

    public void printJumps(String condition, int trueTarget, int falseTarget, PrintWriter writer) {
        if (trueTarget != 0 && falseTarget != 0) {
            print(condition + " L" + trueTarget, writer);
            print(" " + falseTarget, writer);
        } else if (falseTarget != 0) {
            print(condition + " L" + falseTarget, writer);
        } else if (trueTarget != 0) {
            print(condition + " L" + trueTarget, writer);
        } else {
            print("", writer);
        }

    }

    @Override
    public String toString() {
        return op.toString();
    }

}
