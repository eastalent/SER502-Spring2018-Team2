package intermediate.inter;

public class Statement extends Node {
    int after = 0;
    public static Statement Null = new Statement();
    public static Statement enclosing = Statement.Null;

    public void generateInterCode(int trueTarget, int falseTarget) {
        // Base generateInterCode() method in Statements
    }

}
