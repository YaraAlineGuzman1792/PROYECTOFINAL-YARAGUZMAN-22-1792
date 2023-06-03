/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package frame;

public class CalculadoraJP {    
    //Atributos de Clase, pueden ser Publicos, Privados y Protegidos (en herencia)
    public String tipoCalculadora;
    public String color;
    public int dimensionPantalla;
    private String numeroDeSerie;
    private String nombrePropietario;
    
    //Constructor de la calse
    public CalculadoraJP(String propietario){
        this.tipoCalculadora="Calculadora Básica";
        this.dimensionPantalla=10;
        this.numeroDeSerie="M1Q2M3C4J5C6B7";
        this.color="Azul";
        this.nombrePropietario=propietario;
    }
    
    //Constructor vacio
    public CalculadoraJP(){}
    
    //Are de declaración de metodos
    //en clase hemos dicho "funciones" anteriormente, pero en POO son metodos.
    public double sumar(double primerNumero, double segundoNumero){
        return primerNumero + segundoNumero;
    }
    
    public double restar(double primerNumero, double segundoNumero){
        return primerNumero - segundoNumero;
    }
    
    public double multiplicar(double primerNumero, double segundoNumero){
        return primerNumero * segundoNumero;
    }
    
    public double dividir(double primerNumero, double segundoNumero){
        return primerNumero / segundoNumero;
    }
    
    public double raizCuadrada(double numero){
        return Math.sqrt(numero);
    }
    
    public boolean esPrimo(int numeroBuscado){
        boolean primo = false;
        int contador = 0;
        for(int i = numeroBuscado; i > 0; i--){
            if(numeroBuscado % i == 0 ){
                contador++;
            }
        }
        if(7
                == 2){
            return true;
        }else{
            return false;
        }
    }    
}
