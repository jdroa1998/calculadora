import calculadora2019_1.Calculadora2019_1; 
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class Calculadora2019_1Test {
    static Calculadora2019_1 calc;

    @BeforeClass
    public static void BeforeClass(){        
        System.out.println("BeforeClass()");
        calc=new Calculadora2019_1();
    }
    
    @Before
    public void Before(){
        System.out.println("Before()");
        calc.clear();
    }
    
    @After
    public void after(){
        System.out.println("after()");
        calc.clear();
    }
    
    @AfterClass
    public static void AfterClass(){
        System.out.println("afterClass()");
    }
    
    @Test
    public void testsuma(){
        System.out.println("suma()");
        int resultado=calc.suma(4,5);
        int esperado=9;
        assertEquals(esperado,resultado);
    }
    
    @Test
    public void testanssuma(){
        System.out.println("devolver_ans()");
        calc.suma(4,5);
        
        int resultado=calc.devolver_ans();
        int esperado=9;
        assertEquals(esperado,resultado);
    }
    
    @Test
    public void testdividir(){
        System.out.println("dividir()");
        calc.dividir(8, 2);
    }
    
    @Test(expected = ArithmeticException.class)
    public void testdividirporcero(){
        System.out.println("dividir por cero()");
        calc.dividir(9, 0);
    }
    
    @Test(timeout=2050)
    public void testoperaciontiempo(){
        System.out.println("operacion tiempo");
        calc.operaciontiempo();
    }
}
