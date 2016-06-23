
/**
 * Autor Francisco.
 */
public class Calculadora
{
    // instance variables - replace the example below with your own
    public static final  int MULTI = 5;

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

    /**
     * que devuelva verdadero si el parámetro n es primo o falso en caso contrario
     * Debes usar un bucle while que divida el número entre todos los valores comprendidos entre 2 y (n -1). Si alguna 
     * de estas divisiones da de resto 0, entonces el número no es primo. Se debe comprobar que el parámetro es mayor que 1;
     * en caso contrario se informa por pantalla del error y se devuelve false
     */
    public boolean isPrime(int n){
        int cont = 2;
        boolean primo = true;

        if(n < 2){
            System.out.println("Erro, nº menor de 2. ");
            primo = false;
        }
        while(cont < n){
            if(n % cont == 0){
                primo = false;
            }
            cont ++;
        }
        return primo;
    }
    
    /**
     * realizar multiplicaciones entre enteros positivos. Debes decidir por ti mismo qué parámetros debe recibir 
     * dicho método. El método devuelve un valor de tipo entero. Se pone como condición que para realizarlo solo
     * se pueden emplear las operaciones matemáticas suma y resta, no estando permitido usar ninguna otra 
     * operación matemática. Si los parámetros no son enteros positivos el método deben devolver -1 e informar
     * por pantalla del error. 
     */
    public int productoConSumas(int n1, int n2){
        int sol = 0;
        int cont = 1;
        if(n1 < 0 || n2 < 0){
            System.out.println("Error, nº negativo a la vista.");
            sol = -1;
        }
        else{
            while(cont <= n1){
                sol = sol +n2;
                cont ++;
            }
        }
        return sol;
    }
}
















