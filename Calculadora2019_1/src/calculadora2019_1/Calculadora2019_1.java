package calculadora2019_1;
import java.util.*;

public class Calculadora2019_1 {
    private static int ans;
    static Scanner s=new Scanner(System.in);
    public static void main(String[] args){
        
        int control=1,x=0,y=0,ans2=0;
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
            if(control<5 && control!=0){
                System.out.println("Digite el primer numero para la operacion");
                x=s.nextInt();
                System.out.println("Digite el segundo numero para la operacion");
                y=s.nextInt();
            }
            if(control==1){
                System.out.println(x+" + "+y+" = "+suma(x,y));
            }
            else if(control==2){
                System.out.println(x+" - "+y+" = "+resta(x,y));
            }
            else if(control==3){
                System.out.println(x+" * "+y+" = "+multiplicar(x,y));
            }
            else if(control==4){
                dividir(x,y);
            }
            else if(control==5){
                System.out.println("Digite la base de la potencia");
                x=s.nextInt();
                System.out.println("Digite el exponente de la potencia");
                y=s.nextInt();
                System.out.println(x+" ^ "+y+" = "+potencia(x,y));
            }
            else if(control==6){
                System.out.println("Digite numero a adicionar");
                y=s.nextInt();
                ans2=ans;
                System.out.println("ans ="+ans2+" + "+y+" = "+adicionar(y));
            }
            else if(control==7){
                System.out.println("Digite numero a sustraer");
                y=s.nextInt();
                ans2=ans;
                System.out.println("ans ="+ans2+" - "+y+" = "+sustraer(y));
            }
            else if(control==0){
                System.out.println("Cerrando sistema...");
            }
        }
    }
    
    public static int suma(int a, int b){
        ans=a+b;
        return ans;
    }
    
    public static int resta(int a, int b){
        ans=a-b;
        return ans;
    }
    public static int multiplicar(int a, int b){
        ans=a*b;
        return ans;
    }
    public static int potencia(int a, int b){
        ans=(int)Math.pow(a,b);
        return ans;
    }
    
    public static int adicionar(int v){
        ans=ans+v;
        return ans;
    }
    
    public static int sustraer(int v){
        ans=ans-v;
        return ans;
    }
    
    public static int devolver_ans(){
        return ans;
    }
    
    public static void clear(){
        ans=0;
    }
    
    public static int dividir(int a, int b){
        while (b==0){
            System.out.println("introduzca un divisor mayor a cero");
            b=s.nextInt();
        }
        ans=a/b;
        System.out.println(a+" / "+b+" = "+ans);
        return ans;
    }
 
}