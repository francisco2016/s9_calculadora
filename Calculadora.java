
/**
 * Autor Francisco.
 */
public class Calculadora
{
    // instance variables - replace the example below with your own
    public static final  int MULTI = 5;

    /**
     * Constructor for objects of class Calculadora
     */
    public Calculadora()
    {

    }

    /**
     *  imprima todos los múltiplos de 5 entre 10 y 95 (ambos extremos no incluidos) 
     */
    public void multiplesOfFive(){
        int num =  15;
        while(num < 95){
            System.out.println(num);
            num = num + MULTI;  //MULTI es una variable con valor = 5
        }
        System.out.println();
    } 

    /**
     * saque por pantalla la suma de los números comprendidos entre el 0 y el 10 (ambos incluidos) haciendo uso de 
     * un bucle while 
     */
    public void sumValues(){
        int cont = 1;
        int suma = 0;
        while(cont <= 10){
            suma = suma +cont;
            System.out.println(cont+ " : " +suma);
            cont ++;
        }
        System.out.println();
    }

    /**
     *  que reciba dos parámetros enteros a y b y devuelva la suma de los valores comprendidos entre dichos 
     *  parámetros (ambos incluidos) 
     */
    public int sumValuesInterval(int num1, int num2){
        int num0 = 0;
        int sol = 0;

        if(num1 > num2){
            num0 = num1;  
            num1 = num2;   
            num2 = num0;
        }

        if( num1 < 0 || num2 < 0 ){
            sol = -1;
            System.out.println("Error, tenemos un valor negativo. ");
        }
        else{
            int cont = num1;
            while(cont <= num2){
                sol = sol + cont;
                cont ++;
            }
        }
        return sol;
    } 

}





