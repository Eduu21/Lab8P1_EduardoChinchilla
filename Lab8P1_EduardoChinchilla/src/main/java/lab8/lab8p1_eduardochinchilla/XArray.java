
package lab8.lab8p1_eduardochinchilla;


public class XArray {
    
    private int [] arreglo;
    
    private int [][] mat;
    
    public int [] getarreglo(){
        return arreglo;
    }
    
    public XArray (int [][] m){
        this.mat = mat;
        int tam = mat.length;

    }
    public void metodo (){
        int cont =0;
        for (int i =0;i<mat.length;i++){
            arreglo[cont++]= mat[i][i];
            arreglo [cont++] = mat[i][mat.length-i-1];
        }
    }
}
