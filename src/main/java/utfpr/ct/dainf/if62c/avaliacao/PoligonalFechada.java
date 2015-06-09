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
public class PoligonalFechada extends Poligonal{
    
    public PoligonalFechada(int nVertices){
        super(nVertices);
    }
    
    @Override
    public double getComprimento(){
        double comprimento=0.0;
        
        for(int i=0;i<nVertices;i++){
            if(i==nVertices-1)
                comprimento += vertices[i].dist(vertices[0]);
            else
                comprimento += vertices[i].dist(vertices[i+1]);
        }
        
        return comprimento;
    }
}
