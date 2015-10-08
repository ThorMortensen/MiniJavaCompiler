/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compiler.IR;

/**
 *
 *
 */
public class MJPlusEqual extends MJStatement{
    
    
    private MJIdentifierClass lhs;
    private MJExpression rhs;
    
    public MJPlusEqual(MJIdentifierClass lhs, MJExpression rhs){
     
        this.lhs = lhs;
        this.rhs = rhs;
    }
    
    public MJIdentifierClass getLhs(){
        return lhs;
    }
    
    public MJExpression getRhs(){
        return rhs;
    }
}