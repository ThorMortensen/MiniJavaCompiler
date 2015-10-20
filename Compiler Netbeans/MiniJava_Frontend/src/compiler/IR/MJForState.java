/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compiler.IR;

/**
 *
 * @author Thor
 */
public class MJForState extends MJVisitInitFor {

    private MJStatement state;

    public MJForState() {
    }

    public MJForState(MJStatement state, MJExpression condition, MJExpression expr, MJStatement block) {
        super(condition, expr, block);
        this.state = state;
    }

    public MJStatement getState() {
        return this.state;
    }
}
