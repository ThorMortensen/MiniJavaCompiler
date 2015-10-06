/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compiler.IR;

/**
 *
 * @author NannaJosefine
 */
public class MJPostIncrement extends MJExpression {
       private MJIdentifierClass ident;

    public MJIdentifierClass getIdent() {
        return ident;
    }
    
    public MJPostIncrement(MJIdentifierClass ident) {
        this.ident = ident;   
    }
    
    public MJPostIncrement(){       
    }
}
