package calculadora2019_1;
import java.util.*;
public class Calculadora2019_1 {
    private int ans;
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int control=1;
        while(control!=0){
            System.out.println("Digite:");
            System.out.println("       1- para sumar");
            System.out.println("       2- para restar");
            System.out.println("       3- para multiplicar");
            System.out.println("       4- para Dividar");
            System.out.println("       5- para elevar a potencia");
            System.out.println("       6- para adicionar al ans");
            System.out.println("       7- para sustraccion al ans");
            System.out.println("       0- para cerra el sistema");
            control=s.nextInt();
        }
    }
    
    public int suma(int a, int b){
        ans=a+b;
        return ans;
    }
    
    public int resta(int a, int b){
        ans=a-b;
        return ans;
    }
    
    public int adicionar(int v){
        ans=ans+v;
        return ans;
    }
    
    public int sustraer(int v){
        ans=ans-v;
        return ans;
    }
    
    public int devolver_ans(){
        return ans;
    }
    
    public void clear(){
        ans=0;
    }
    
    public int dividir(int a, int b){
        if (b==0){
            throw new ArithmeticException("no se puede dividir por cero");
        }
        ans=a/b;
        return ans;
    }
    
    public void operaciontiempo(){
        try{
            Thread.sleep(2000);
        }
        catch(InterruptedException e) {
            
        }
    }
}