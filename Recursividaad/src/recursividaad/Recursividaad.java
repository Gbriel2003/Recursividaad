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
      
      /* class nodo{ //se crea la clase nodo 
          String palabra;
          nodo siguiente;
      
      
        public nodo(String palabra){
          this.palabra = palabra;
          this.siguiente = null;
        }
      }  
      
      class ListaCircular{ //creacion de la clase listacircular
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
                private String concatenarPalabrasRecursivamente(nodo nodoActual, nodo nodoInicio) { // funcion recursiva para concatenar las palabras 
                    if (nodoActual.siguiente == nodoInicio) { // Caso base si hemos llegado de nuevo al inicio
                    return nodoActual.palabra;
                    } else {
                    return nodoActual.palabra + " " + concatenarPalabrasRecursivamente(nodoActual.siguiente, nodoInicio);
                    }
                }
                
                public String concatenarPalabras(){ // funcion para iniciar la concatenacion recursivamenre 
                    if (cabeza == null){
                    return "";
                    }
                    return concatenarPalabrasRecursivamente(cabeza, cabeza);
                }
      }
                ListaCircular lista = new ListaCircular(); // se crea un constructor de la clase listacircular para agregar los elementos a la lista
        
                // se  agregan las palabras a la lista circular
                lista.agregar("hola");
                lista.agregar("profe");
                lista.agregar("como");
                lista.agregar("esta?");
                lista.agregar("esto");
                lista.agregar("lo");
                lista.agregar("estoy");
                lista.agregar("haciendo");
                lista.agregar("sin");
                lista.agregar("luz");
                lista.agregar("jajajajajaj");

                // se concatenan las palabras y se muestra el resultado
                String resultado = lista.concatenarPalabras();
                System.out.println("el resultado de la concatenacion es: " + resultado);   */
      
     //EJERCICIO 3
     class nodo{ 
         String valor;
         nodo siguiente;
         
         public nodo(String valor){
            this.valor = valor;
            this.siguiente = null;
         }            
     }
     
     class pila{
         nodo cima;
         
         public pila(){
             cima = null;
         }
         
         void apilar (String valor){
             nodo nuevonodo = new nodo(valor);
             nuevonodo.siguiente = cima;
             cima = nuevonodo;
         }
         
         public String desapilar(){
             if (cima == null){
                 return null;
             }
             String valor = cima.valor;
             cima = cima.siguiente;
             return valor;
         }
         
         public boolean estavacia(){
             return cima == null;
         }
     }
     
    }
}
 
