/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.ct.dainf.if62c.avaliacao;

/**
 *
 * @author a1614193
 */
public abstract class Ponto2D extends Ponto{
    private double x,y,z;
    
    public Ponto2D()
    {
        super();
    }
    
    public Ponto2D(double x, double y, double z){
        super(x, y, z);
    }            
}
