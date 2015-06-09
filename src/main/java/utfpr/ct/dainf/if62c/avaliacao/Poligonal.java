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
public class Poligonal {
    protected int nVertices;
    protected Ponto2D[] vertices;
    
    public Poligonal(int nVertices){
        this.nVertices = nVertices;
        if (nVertices < 2)
            throw new RuntimeException("Poligonal deve ter ao menos 2 vértices");
        else{
            vertices = new Ponto2D[nVertices];
        }
    }
    public int getN(){
        return this.nVertices;
    }
    
    public Ponto2D get(int valor){
        if(valor<0 || valor>=this.nVertices)
            return null;
        else
            return vertices[valor];
    }
    
    public void set(int valor, Ponto2D ponto){
        if(valor<0 || valor>=this.nVertices)
            return;
        else for(int i=0; i<nVertices;i++)
        {
            if(vertices[i]!= null && ponto.getClass() != vertices[i].getClass())
            {
                throw new RuntimeException("Vértices devem estar no mesmo plano");
            }
        }
        vertices[valor] = ponto;
    }
    
    public double getComprimento(){
        double comprimento=0.0;
        
        for(int i=0;i<nVertices-1;i++){
            comprimento += vertices[i].dist(vertices[i+1]);
        }
        
        return comprimento;
    }
}
