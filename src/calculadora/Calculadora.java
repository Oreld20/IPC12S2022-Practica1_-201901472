package calculadora;
import java.util.Scanner;
/**
 *
 * @author Oreld
 */
public class Calculadora {

    public static void main(String[] args) {
Scanner Usuario = new Scanner(System.in);
        //Menu principal
        for (int i = 0; i <=10; i++) {
        System.out.println("Menu Principal");   
        System.out.println(" 1. Aritmetica");
        System.out.println(" 2. Trigonometria");
        System.out.println(" 3. Estadistica");
        System.out.println(" 4. Calculo");
        System.out.println(" 5. Salir");
        System.out.println("Ingrese una opcion:");
        int Entrada = Usuario.nextInt();
        
        if (Entrada == 1){// Aritmetica
            System.out.println("Aritmetica");
            System.out.println(" 1. Suma");
            System.out.println(" 2. Resta");
            System.out.println(" 3. Multiplicacion");
            System.out.println(" 4. Division");
            System.out.println(" 5. Potencia");
            System.out.println(" 6. Salir");
             int Aritmetica = Usuario.nextInt();
             switch (Aritmetica){ //operaciones aritmeticas
                 case 1://Suma
                     System.out.println("Suma");
                     int suma;
                     System.out.println("Ingrese un primer dato");
                     int Numero1 = Usuario.nextInt();
                     System.out.println("Ingrese un segundo dato");
                     int Numero2 = Usuario.nextInt();
                     suma = Numero1 + Numero2;
                     System.out.println("La suma es :" + suma);
                     break;
                     
                 case 2://Resta
                     System.out.println("Resta");
                     int resta;
                     System.out.println("Ingrese un primer dato");
                     int Numero11 = Usuario.nextInt();
                     System.out.println("Ingrese un segundo dato");
                     int Numero21 = Usuario.nextInt();
                     resta = Numero11 - Numero21;
                     System.out.println("La Resta es :" + resta);
                     break;
                     
                 case 3://Multiplicacion
                     System.out.println("Multiplicaion");
                     int producto;
                     System.out.println("Ingrese un primer dato");
                     int Numero12 = Usuario.nextInt();
                     System.out.println("Ingrese un segundo dato");
                     int Numero22 = Usuario.nextInt();
                     producto = Numero12 * Numero22;
                     System.out.println("La producto es :" + producto);
                     break;
                     
                 case 4://Division
                     System.out.println("Division");
                     int cocinete;
                     System.out.println("Ingrese un primer dato");
                     int Numero13 = Usuario.nextInt();
                     System.out.println("Ingrese un segundo dato");
                     int Numero23 = Usuario.nextInt();
                     if (Numero23 <=0){
                         System.out.println("Nos son permitidas diviciones negativas o entre cero");
                       }else{
                         cocinete = Numero13 / Numero23;
                     System.out.println("La cociente es :" + cocinete);
                     }
                     break;
                     
                 case 5://Potencia
                     System.out.println("Potencia");
                     int resultado = 0;
                     int potencia = 1;
                     System.out.println("Ingrese el valor de la base");
                     int Numero14 = Usuario.nextInt();
                     System.out.println("Ingrese el valor de el exponente");
                     int Numero24 = Usuario.nextInt();
                     for (int x = 1; x<= Numero24; x++){
                         resultado = Numero14 + resultado;
                         potencia = potencia * Numero14;
                     }
                     System.out.println("La potencias es: " + potencia);
                     break;
                     
                 case 6://Salida
                     System.out.println("Saliendo..");
                     break;
             }}
        else{
        if (Entrada ==2){//Trigonometria
            System.out.println("Trigononetria");
            System.out.println(" 1. Seno");
            System.out.println(" 2. Coseno");
            System.out.println(" 3. Tangente");
            System.out.println(" 4. Salir");
            int Trigonometria = Usuario.nextInt();
            switch(Trigonometria){//operaciones trigonometricas
                case 1: //Seno
                    System.out.println("Seno");
                    int x , y , z= 10;
                    double Dividendo , Divisor, Signo, seno=0;
                    double angulo = Usuario.nextInt();
                    for ( x = 0; x <=z; x++) {
                     Dividendo=1;
                        for ( y = 0; y < 2*x+1 ; y++) {
                            Dividendo=Dividendo * x; 
                        }
                        Divisor=1;
                        for (y = 1; y <= 2*x+1 ; y++) {
                           Divisor= Divisor * y;
                        }
                        if(x%2==0){
                        Signo=1;
                        }else {
                        Signo= -1;
                        }
                        seno = seno + (Dividendo/Divisor)*Signo;
                    }
                    System.out.println("el seno de: " + angulo + " es: " + seno);
                    
                    break;
    
                case 2://Coseno
                    System.out.println("Coseno");
                      int xx , yy , zz= 10;
                    double dividendo , divisor, signo, coseno=0;
                    double Angulo = Usuario.nextInt();
                    for ( xx = 0; xx <=zz; xx++) {
                     Dividendo=1;
                        for ( yy = 0; yy < 2*xx ; yy++) {
                            Dividendo=Dividendo * xx; 
                        }
                        Divisor=1;
                        for (yy = 1; yy <= 2*xx ; yy++) {
                           Divisor= Divisor * yy;
                        }
                        if(xx%2==0){
                        Signo=1;
                        }else {
                        Signo= -1;
                        }
                        coseno = coseno + (Dividendo/Divisor)*Signo;
                    }
                    System.out.println("el Coseno de: " + Angulo + " es: " + coseno);
                    
                   
                    
                    break;
                    
                case 3://Tangente
                    System.out.println("Tangente");
                    double tan;
                    int xxx , yyy , zzz= 10;
                    double superior , inferior, cambio, sin=0;
                    double cant = Usuario.nextInt();
                    for ( xxx = 0; xxx <=zzz; xxx++) {
                     superior=1;
                        for ( yyy = 0; yyy < 2*xxx+1 ; yyy++) {
                            superior=superior * xxx; 
                        }
                        inferior=1;
                        for (yyy = 1; yyy <= 2*xxx+1 ; yyy++) {
                           inferior= inferior * yyy;
                        }
                        if(xxx%2==0){
                        cambio=1;
                        }else {
                        cambio= -1;
                        }
                        sin = sin + (superior/inferior)*cambio;
                    }
                    int xxxx , yyyy , zzzz= 10;
                    double Superior , Inferior, Cambio, cos=0;
                    for ( xxxx = 0; xxxx <=zzzz; xxxx++) {
                     Superior=1;
                        for ( yyyy = 0; yyyy < 2*xxxx ; yyyy++) {
                            Superior=Superior * xxxx; 
                        }
                        Inferior=1;
                        for (yyyy = 1; yyyy <= 2*xxxx ; yyyy++) {
                           Inferior= Inferior * yyyy;
                        }
                        if(xxxx%2==0){
                        Cambio=1;
                        }else {
                        Cambio= -1;
                        }
                        cos = cos + ( Superior / Inferior )*Cambio;
                    }
                    tan = sin/cos;
                    System.out.println("la tangente de: " + cant + " es: " + tan);
                    
                    break;
                    
                case 4://Salida
                    System.out.println("Saliendo..");
                    break;
            }}
        else{
        if (Entrada ==3){ //Estadistica
            System.out.println("Estadistica");
            System.out.println("1. Promedio");
            System.out.println("2. Media");
            System.out.println("3. Moda");
            System.out.println("4. Varianza");
            System.out.println("5. Desviacion Estandard");
            System.out.println("6. Salir");
              int Estadistica = Usuario.nextInt();
              switch (Estadistica){ //Operaciones estadisticas
                  
                  case 1://Promedio
                      System.out.println("Promedio");
                      int n;
                      double suma =0 ;
                      double calificacion = 0;
                      double promedio;
                      System.out.println("Ingrese la cantidad de notas que promediara");
                      n = Usuario.nextInt();
                      System.out.println("Ingrese las notas en forma de lista");
                      for (int j = 1; j <= n; j++) {
                          calificacion = Usuario.nextInt();
                         suma = suma + calificacion; 
                      }
                      promedio = suma / n ;
                      System.out.println("El promedio es: " + promedio);
                     break;
                      
                  case 2://Media
                      System.out.println("Introduce numeros para calcular la media.");
       System.out.println("Cuando hayas introducido todos los numeros que deseas.");
       System.out.println("Presiona 0 + enter para calcular.");
       double num=0, sumas=0, cantidad=0;
       double media;
       num=Usuario.nextInt();
while(num>0){
sumas=sumas + num;
cantidad++;
    System.out.println("Introduzca otro numero");
    num=Usuario.nextInt();
}if (num ==0){
media = sumas/cantidad;
       System.out.println("La media es de: " + media);
}
                   break;
                   
                  case 3:
                      System.out.println("Moda");
                      break;
                  case 4:
                      System.out.println("Desviacion Estandard");
                  case 5:
                      System.out.println("Saliendo..");
                      break;
                      
              }}
        else{
        if (Entrada == 4){//Calculo
            System.out.println("Calculo");
            System.out.println("1. Resolver sistema de ecuaciones lineales NxN por Gauss-Jordan ");
            System.out.println("2. Salir");
            int calculo  = Usuario.nextInt();
        switch (calculo){ //operaciones de calculo
            case 1:
                System.out.println("Gauss-Jordan");
                break;
            case 2:
                System.out.println("Salir");
                break;
        
        }}
        else{
        if (Entrada == 5){
            System.out.println("Saliendo");
        
        }}
        
            
        }
        }
        }
        }
        
        }
        }
        
        
        

   
