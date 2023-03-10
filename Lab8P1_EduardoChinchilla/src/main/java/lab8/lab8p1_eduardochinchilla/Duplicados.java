
package lab8.lab8p1_eduardochinchilla;
import java.util.Random;

public class Duplicados {
    Random rand = new Random();
    
    private int x;
    
    private int [] array;
    
    public int [] getarray(){
    return array;
}
    
    public Duplicados(int x){
        this.x = x;
        array = new int[x];
        llenado();
    }
    public void SDuplicados(){
        for (int i =0; i<x;i++){
            int igual = array[i];
            for(int j = i+1;j<x;j++){
                if(array[j] == igual){
                    array[j]=0;
                }
            }
        }
    }
    public void llenado (){
        for (int i = 0; i < x;i++){
            array[i]=1+rand.nextInt(10);
        }
       
    }

}
