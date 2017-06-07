/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejdividido;

/**
 *
 * @author sena
 */
public class Ejercicio {
    
    
    
            int x;
            int y;
            int total;
            
            // variables ejercicio2
             int decremento;
             int i = 30;
            
            // varirables ejercicio3
             int cantidadNumero1=30;
             int cantidadNumero2=30;
             int cantidadNumero3=30;
             
    
    public int setx(int x)
    {
      this.x=x;  
                return x;
    }
    
      public int sety(int y)
    {
      this.y=y;  
                return y;
    }
    
      
      
      public int operacionMultiplicacion()
            {
              total=x*y;
            
            return 0;
            }
            
            public int resultadoMultipliacion()
        {
            
 
            System.out.println("La multiplicacion es:"+total);
            
             return 0;
                    
        }
            
            
            
            //EJERCICIO"2": Decrementar del numero 20 al 1 de 2 en 2
            
            
            
               
         
        public int NumeroDecrementar(int decremento)
        {
          this.decremento=decremento;  
          return decremento;
        }
        
        
        
        public void operacionDecremento()
        {
         while (i > 1){
             System.out.println("EL decremento es:"+i);
         
             i = i - decremento; 
             
        }
        }
        
        public void resultadoDecremento()
        {
           System.out.println(i); 
        }   
        
        //Ejercicio3 con for mostrar numeros pares de a,b,c
        
        
        
        public int setcantidadNumero1(int cantidadNumero1)
        {
            this.cantidadNumero1=cantidadNumero1;
            return cantidadNumero1;
        }
        
        public int setcantidadNumero2(int cantidadNumero2)
        {
            this.cantidadNumero2=cantidadNumero2;
            return cantidadNumero2;
        }
        
        public int setcantidadNumero3(int cantidadNumero3)
        {
            this.cantidadNumero3=cantidadNumero3;
            return cantidadNumero3;
        }
        
        
        
                
                
        public void operacionconfor()
        {
            
            
            for(int a=0; a<cantidadNumero1; a++ )
            {
                if (a%2==0)  System.out.println("Los numeros pares de A son:"+a);
            }
            
            
                for(int b=0; b<cantidadNumero2; b++)
                {
                  if (b%2==0)  System.out.println("Los numeros pares de B son:"+b);
                }
                
                    for(int c=0; c<cantidadNumero3; c++)
                    {
                        if ( c%2==0)
                          System.out.println("Los numeros pares de C son:" +c); 
                    }
                }
            }
        


            
        
        
       
        
        
       
        

       
            
         
            
            
            
           
                
            
            
            
            
        
         
        


            
            
            
            
            
            
            
            
            
            
            
            
            
   

