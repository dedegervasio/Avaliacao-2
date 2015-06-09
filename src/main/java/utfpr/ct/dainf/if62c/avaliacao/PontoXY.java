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
public class PontoXY extends Ponto2D{
    private double x,y,z;
    
        public PontoXY()
    {
        super();
    }
    
    public PontoXY(double x, double y){
        super(x,y,0.0);
    }
    
        @Override
    public String toString() {
        return String.format("%sXY(%f,%f)", this.getNome(), this.x, this.y);
    }
}
