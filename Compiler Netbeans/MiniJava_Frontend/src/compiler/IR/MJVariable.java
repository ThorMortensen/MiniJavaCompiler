package compiler.IR;

import java.util.ArrayList;

public class MJVariable extends IR {

    private MJType type;
    private String name;
    private ArrayList<MJExpression> exp;
    private MJExpression expr;
    private MJStatement statem;

    public MJVariable(MJType t, String name) {
        this.type = t;
        this.name = name;
    }

    public MJVariable(MJType t, String name, ArrayList<MJExpression> exp) {
        this.type = t;
        this.name = name;
        this.exp = new ArrayList<MJExpression>();
        for(MJExpression j : exp){
            this.exp.add(j);
        }

    }

    public MJVariable(MJType t, String name, MJExpression expr) {
        this.type = t;
        this.name = name;
        this.expr = expr;
    }

    public MJVariable(MJType t, String name, MJStatement statem) {
        this.type = t;
        this.name = name;
        this.statem = statem;
    }

    public MJType getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public ArrayList<MJExpression> getExpression() {
        return exp;
    }

    public MJExpression getExpr() {
        return expr;
    }

    public MJStatement getStatem() {
        return statem;
    }

    public ArrayList<MJExpression> getExp() {
        return this.exp;
    }
}
