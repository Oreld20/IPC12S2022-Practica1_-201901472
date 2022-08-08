package calculadora;
import java.util.Scanner;
/**
 *
 * @author Oreld
 */
public class Calculadora {

    public static void main(String[] args) {
Scanner Usuario = new Scanner(System.in);
        //Menu principal--------------------------------------------------------
        for (int i = 0; i <=10; i++) {
        System.out.println("Menu Principal");   
        System.out.println(" 1. Aritmetica");
        System.out.println(" 2. Trigonometria");
        System.out.println(" 3. Estadistica");
        System.out.println(" 4. Calculo");
        System.out.println(" 5. Salir");
        System.out.println("Ingrese una opcion:");
        int Entrada = Usuario.nextInt();
        
        if (Entrada == 1){// Aritmetica-----------------------------------------
            System.out.println("Aritmetica");
            System.out.println(" 1. Suma");
            System.out.println(" 2. Resta");
            System.out.println(" 3. Multiplicacion");
            System.out.println(" 4. Division");
            System.out.println(" 5. Potencia");
            System.out.println(" 6. Salir");
            System.out.println("Ingrese una opcion para continuar: ");
             int Aritmetica = Usuario.nextInt();
             switch (Aritmetica){ //operaciones aritmeticas
                 
                 case 1://Suma--------------------------------------------------
                     System.out.println("---------------------------");
                     System.out.println("Suma");
                     int suma;
                     System.out.println("Ingrese un primer dato");
                     int Numero1 = Usuario.nextInt();
                     System.out.println("Ingrese un segundo dato");
                     int Numero2 = Usuario.nextInt();
                     suma = Numero1 + Numero2;
                     System.out.println("La suma es : " + suma);
                     System.out.println("---------------------------");
                      System.out.println("Presione 0 si desea salir");
                      Aritmetica = Usuario.nextInt();
                     break;
                     
                 case 2://Resta-------------------------------------------------
                     System.out.println("---------------------------");
                     System.out.println("Resta");
                     int resta;
                     System.out.println("Ingrese un primer dato");
                     int Numero11 = Usuario.nextInt();
                     System.out.println("Ingrese un segundo dato");
                     int Numero21 = Usuario.nextInt();
                     resta = Numero11 - Numero21;
                     System.out.println("La Resta es : " + resta);
                     System.out.println("---------------------------");
                     System.out.println("Presione 0 si desea salir");
                      Aritmetica = Usuario.nextInt();
                     break;
                     
                 case 3://Multiplicacion----------------------------------------
                     System.out.println("---------------------------");
                     System.out.println("Multiplicaion");
                     int producto;
                     System.out.println("Ingrese un primer dato");
                     int Numero12 = Usuario.nextInt();
                     System.out.println("Ingrese un segundo dato");
                     int Numero22 = Usuario.nextInt();
                     producto = Numero12 * Numero22;
                     System.out.println("La producto es :" + producto);
                     System.out.println("---------------------------");
                     System.out.println("Presione 0 si desea salir");
                      Aritmetica = Usuario.nextInt();
                     break;
                     
                 case 4://Division----------------------------------------------
                     System.out.println("---------------------------");
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
                     System.out.println("---------------------------");
                     System.out.println("Presione 0 si desea salir");
                      Aritmetica = Usuario.nextInt();
                     break;
                     
                 case 5://Potencia----------------------------------------------
                     System.out.println("---------------------------");
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
                     System.out.println("---------------------------");
                     System.out.println("Presione 0 si desea salir");
                      Aritmetica = Usuario.nextInt();
                     break;
                     
                 case 6://Salida
                     System.out.println("Saliendo..");
                     break;
                 default:
                     System.out.println("Opcion no permitida");
             }}
        else{
        if (Entrada ==2){//Trigonometria----------------------------------------
            System.out.println("Trigononetria");
            System.out.println(" 1. Seno");
            System.out.println(" 2. Coseno");
            System.out.println(" 3. Tangente");
            System.out.println(" 4. Salir");
            System.out.println("Ingrese una opcion para continuar: ");
            int Trigonometria = Usuario.nextInt();
            switch(Trigonometria){//operaciones trigonometricas
                
                case 1: //Seno--------------------------------------------------
                    System.out.println("---------------------------");
                    System.out.println("Seno");
                    int x , y , z= 10;
                    double Dividendo , Divisor, Signo, seno=0;
                    System.out.println("Ingrese la cantidad que desea calcular: ");
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
                    System.out.println("---------------------------");
                    System.out.println("Presione 0 si desea salir");
                      Trigonometria = Usuario.nextInt();
                    
                    break;
    
                case 2://Coseno-------------------------------------------------
                    System.out.println("---------------------------");
                    System.out.println("Coseno");
                      int xx , yy , zz= 10;
                    double dividendo , divisor, signo, coseno=0;
                    System.out.println("Ingrese la cantidad que desea calcular: ");
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
                    System.out.println("---------------------------");
                    System.out.println("Presione 0 si desea salir");
                      Trigonometria = Usuario.nextInt();
                    
                   
                    
                    break;
                    
                case 3://Tangente-----------------------------------------------
                    System.out.println("---------------------------");
                    System.out.println("Tangente");
                    double tan;
                    int xxx , yyy , zzz= 10;
                    double superior , inferior, cambio, sin=0;
                    System.out.println("Ingrese la cantidad que desea calcular: ");
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
                    System.out.println("---------------------------");
                    System.out.println("Presione 0 si desea salir");
                      Trigonometria = Usuario.nextInt();
                    
                    break;
                    
                case 4://Salida
                    System.out.println("Saliendo..");
                    break;
                    
                    default:
                     System.out.println("Opcion no permitida");
            }}
        else{
        if (Entrada ==3){ //Estadistica-----------------------------------------
            System.out.println("Estadistica");
            System.out.println("1. Promedio");
            System.out.println("2. Media");
            System.out.println("3. Moda");
            System.out.println("4. Varianza");
            System.out.println("5. Desviacion Estandard");
            System.out.println("6. Salir");
            System.out.println("Ingrese una opcion para continuar: ");
              int Estadistica = Usuario.nextInt();
              switch (Estadistica){ //Operaciones estadisticas
                  
                  case 1://Promedio---------------------------------------------
                       System.out.println("----------------------");
                      System.out.println("Promedio");
                      int n;
                      double suma =0 ;
                      double calificacion = 0;
                      double promedio;
                      System.out.println("Ingrese la cantidad de datos que promediara : ");
                      n = Usuario.nextInt();
                      System.out.println("Ingrese una cantidad: ");
                      for (int j = 1; j <= n; j++) {
                          calificacion = Usuario.nextInt();
                         suma = suma + calificacion; 
                          System.out.println("Ingrese la siguiente cantidad : ");
                      }
                      promedio = suma / n ;
                      System.out.println("El promedio es: " + promedio);
                      System.out.println("---------------------------");
                      System.out.println("si deseas salir presiona 0");
                      Estadistica = Usuario.nextInt();
                     break;
                      
                  case 2://Media------------------------------------------------
                      
        System.out.println("----------------------");
        System.out.println("Media");              
       int l;
       int sumi=0;
       System.out.println("ingrse la cantidad de datos a la que desea calcular la media: ");
       l=Usuario.nextInt();
       
       System.out.println("Ingrse un primer dato; ");
       for (int r = 1; r <= l; r++){
         int datu=Usuario.nextInt();
           sumi= sumi + datu;
           System.out.println("Ingrse otro dato: "); 
       }
       System.out.println("-----------------------");
       System.out.println("La media es: " +sumi/l );
       System.out.println("si deseas salir presiona 0");
                      Estadistica = Usuario.nextInt();
                   break;
                   
                  case 3: //Moda------------------------------------------------
                      
        System.out.println("----------------------");               
       System.out.println("Moda");
                      
                      int o;
       System.out.println("ingrese la cantidad de datos:");
o= Usuario.nextInt();
double vecto [] = new double[o];
for (int k = 0; k < vecto.length; k++) {
           System.out.println("Ingrese un numero:");
           vecto[k]=Usuario.nextDouble();
}

int contador=0;
double repeat [] = new double[o];

       for (int k = 0; k <vecto.length; k++) {
           for (int h = 0; h < vecto.length; h++) {
               if (vecto[k]==vecto[h]){
               vecto [h] = repeat[k];
               contador++;
                       
               }
           }
           
       }
       for (int k = 0; k < repeat.length; k++) {
           System.out.println("numeros repetidos" + repeat[k]);
       }

                      break;
                      
                  case 4://Varianza---------------------------------------------
                      System.out.println("----------------------");
                      System.out.println("Varianza");
                       
                      double midia;
                      
                      
double vorianza = 0;
int r;
       System.out.println("cantidad de numeros");
       r=Usuario.nextInt();
       //Almacen de datos que ingrese el usuario
       double can [] = new double[r];
       for (int c = 0; c < can.length; c++) {
           System.out.println("Ingrese un numero:");
           can[c]=Usuario.nextDouble();
       }
       double suma11 = 0;
       for (int c = 0; c <can.length; c++) {// Suma de todos los datos
           suma11= suma11 + can [c];
       }
       midia = suma11 / r;//Calculo de la media
        for (int c = 0; c < can.length; c++) {// Resta de la media a cada uno de los datos
            can[c]=can[c] - midia;        
       }
       for (int c = 0; c < can.length; c++) {
           can[c]= can[c] * can[c] ; // multiplicacion de los datos por si mismos   
       }
        for (int c = 0; c < can.length; c++) { // Suma de los datos de varianza
           vorianza= vorianza + can[c];
           }
       System.out.println("varianza es: " + vorianza/10);
       System.out.println("---------------------------");
                      System.out.println("si deseas salir presiona 0");
                      Estadistica = Usuario.nextInt();
                      break;
                      
                  case 5: //Desviacion estandard--------------------------------
                      System.out.println("----------------------");
                      System.out.println("Desviacion Estandard");
                     double modia;
        double varianza = 0;
        double desviacion;
        double total;

        int m;
       System.out.println("cantidad de numeros");
       m=Usuario.nextInt();
       //Almacen de datos que ingrese el usuario
       double datos [] = new double[m];
       for (int y = 0; y < datos.length; y++) {
           System.out.println("Ingrese numeros numero:");
           datos[y]=Usuario.nextDouble();
       }
       double suma1 = 0;
       for (int y = 0; y <datos.length; y++) {// Suma de todos los datos
           suma1= suma1 + datos [y];
       }
       modia = suma1 / m;//Calculo de la media
       
        for (int y = 0; y < datos.length; y++) {// Resta de la media a cada uno de los datos
            datos[y]=datos[y] - modia;        
       }
       for (int y = 0; y < datos.length; y++) {
           datos[y]= datos[y] * datos[y] ; // multiplicacion de los datos por si mismos   
       }
        for (int y = 0; y < datos.length; y++) { // Suma de los datos de varianza
           varianza= varianza + datos[y];
           }
       desviacion = (varianza / m-1)*1/20; //Calculo final de la desviacion
           System.out.println("La desviacion es: " + desviacion);
           System.out.println("---------------------------");
                      System.out.println("si deseas salir presiona 0");
                      Estadistica = Usuario.nextInt();
                      break;
                      
                  case 6:
                      System.out.println("Saliendo..");
                  break;
                  
                  default:
                     System.out.println("Opcion no permitida");
              }}
        else{
        if (Entrada == 4){//Calculo---------------------------------------------
            System.out.println("Calculo");
            System.out.println("1. Resolver sistema de ecuaciones lineales NxN por Gauss-Jordan ");
            System.out.println("2. Salir");
            System.out.println("Ingrese una opcion para continuar: ");
            int calculo  = Usuario.nextInt();
        switch (calculo){ 
            
            case 1://Gauss Jhorda-----------------------------------------------
                
                System.out.println("Gauss-Jordan");
                 System.out.println("--------------------------------------------------");
       System.out.println("Matrices");
       System.out.println("Ingrese el tamaño de la matriz cuadrada");
   int tam = Usuario.nextInt();
   int vec0[]=new int[tam];
   int vec1[]=new int [tam];
   int vec2[]=new int [tam];
   System.out.println("Ingrese el primer valor de la primera fila: ");
       for (int f = 0; f < vec0.length; f++) {
           
           vec0[f]=Usuario.nextInt();
           System.out.println("Ingrese el siguiente valor: ");
       }
        System.out.println("Ingrese el primer valo de la segunda fila: ");
       for (int f = 0; f < vec1.length; f++) {
           
           vec1[f]=Usuario.nextInt();
           System.out.println("Ingrese el siguiente valor: ");
       }
       System.out.println("Ingrese el primer valor de la tecera fila: ");
       for (int f = 0; f < vec2.length; f++) {
           
           vec2[f]=Usuario.nextInt();
           System.out.println("Ingrese el siguiente valor: ");
       }
 
       System.out.println("--------------------------------------------------");
     int a= vec0[0];
     int b= vec1[0];
     int c= vec2 [0];
     int vecr0[]=new int[tam];
       for (int f = 0; f < vec0.length; f++) {//Primer fila
       vec0 [f]= vec0 [f] / a;
           System.out.println("cantidad de la primera fila: " + " posicion: " + f + " es: " + vec0[f]);
       }
        for (int f = 0; f < vec1.length; f++) {//Segunda fila
      vec1 [f]= vec0[f]*b-vec1[f];
      
      System.out.println("cantidad de la segunda fila : "+ " posicion: " + f  + " es: " + vec1[f]);
       }
        for (int f = 0; f < vec2.length; f++) {//Tercera fila
      vec2 [f]= vec0[f]*c - vec2[f];
      System.out.println("cantidad de la tercera fila: "+ " posicion: " + f +  " es: " + vec2[f]);
       }
        System.out.println("---------------------------");
                      System.out.println("si deseas salir presiona 0");
                      calculo = Usuario.nextInt();
                break;
            case 2:
                System.out.println("Salir");
                break;
                
                default:
                     System.out.println("Opcion no permitida");
        
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
        
        
        

   
