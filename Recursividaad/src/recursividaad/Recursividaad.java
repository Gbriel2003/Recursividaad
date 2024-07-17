package recursividaad;

import java.util.Scanner;


public class Recursividaad {

    public static void main(String[] args) {
        // EJERCICIO 1 
      /* Scanner entrada = new Scanner(System.in);
        
        int size = 0;
        while(true){ // VALIDACION POR SI EL USUARIO INGRESA UN TAMAÑO INVALIDO DEL ARREGLO 
            System.out.print("Ingrese el tamaño del arreglo: ");
            if (entrada.hasNextInt()){
                size = entrada.nextInt();
                if (size > 0) {
                    break;
                } else {
                    System.out.println("Por favor ingrese un numero positivo"); 
                } 
            } 
        }
        
        int[] numeros = new int[size];
        
        for (int i= 0; i<size; i++){
            while(true){ // VALIDACION POR SI EL USUARIO INGRESA UNA LETRA O UN CARACTER NO VALIDO PARA LA SUMA 
                System.out.print("\n" + i +"._ ingrese los valores del arreglo: ");
                if (entrada.hasNextInt()){
                    numeros[i] = entrada.nextInt();
                    break;
                } else{
                    System.out.println("Ingrese un dato valido (un numero entero)");
                    entrada.next();
                }
            }
        }
        int TotalSum = SumaArreglo(numeros, size - 1);
        System.out.println("La suma total del arreglo es: "+ TotalSum);
        entrada.close();
       
    }
         public static int SumaArreglo(int[] arreglo, int indice) {
        // Caso base si el indice es menor que 0, significa que hemos terminado de sumar
        if (indice < 0) {
            return 0;
        } else {
            // Caso recursivo: sumamos el elemento actual al resultado de sumar el resto
            return arreglo[indice] + SumaArreglo(arreglo, indice - 1);
        }
    }   */
      
      // EJERCICIO 2
      
      class nodo{ //
          String palabra;
          nodo siguiente;
      
      
        public nodo(String palabra){
          this.palabra = palabra;
          this.siguiente = null;
        }
      }  
      
      class ListaCircular{
          nodo cabeza;
          
          public ListaCircular(){
              cabeza = null;
          }
 
            public void agregar(String palabra) {
   
            nodo nuevoNodo = new nodo(palabra);
            
                if (cabeza == null) {
                cabeza = nuevoNodo;
                cabeza.siguiente = cabeza;
                } else {
                    nodo actual = cabeza;
                    while (actual.siguiente != cabeza) {
                    actual = actual.siguiente;
                }
                    actual.siguiente = nuevoNodo;
                    nuevoNodo.siguiente = cabeza;
                    }
            }
                private String concatenarPalabrasRecursivo(nodo nodoActual, nodo nodoInicio) { // funcion recursiva para concatenar las palabras 
                    if (nodoActual.siguiente == nodoInicio) { // Caso base si hemos llegado de nuevo al inicio
                    return nodoActual.palabra;
                    } else {
                    return nodoActual.palabra + " " + concatenarPalabrasRecursivo(nodoActual.siguiente, nodoInicio);
                    }
                }
                
                public String concatenarPalabras(){ // funcion para iniciar la concatenacion recursivamenre 
                    if (cabeza == null){
                    return "";
                    }
                    return concatenarPalabrasRecursivo(cabeza, cabeza);
        }
                

        }
    }
}
 
