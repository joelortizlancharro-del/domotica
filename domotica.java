import java.util.Scanner;
public class domotica {

    public static void main(String[] args){
   
Scanner escaner = new Scanner(System.in);
 String queFer, queFerLlums, queFerTemperatura, queFerFinestre, queFerVentilador, queFerAltaveu;
  boolean encendreApagarLlums, llumSalaEstar, llumCuina, llumHabitacioUn, llumHabitacioDos, llumHabitacioTres, llumLavabo;
 
  encendreApagarLlums= false; //canviar
     System.out.println("Que vols fer?");
     System.out.println(" a) Canviar llums. ");
     System.out.println(" b) Canviar temperatura. ");
     System.out.println(" c) Canviar finestres. ");
     System.out.println(" d) Canviar ventiladors. ");
     System.out.println(" e) Canviar altaveus. ");
     queFer = escaner.next();
    
        switch (queFer) {
            case "a":
                System.out.println("Vols canviar les llums, que opció vols ara? ");
                System.out.println(" a) Controlar una habitació. ");
                System.out.println(" b) Controlar totes les habitacions ");
                System.out.println(" c) Mostrar estat actual de les llums .");
                System.out.println(" d) Sortir. ");
               
                queFerLlums = escaner.next();

                switch (queFerLlums) {
                    case "a":

                       System.out.println("Vols controlar una única habitació, quina vols controlar");
                       System.out.println(" a) Sala d'estar. ");
                       System.out.println(" b) Cuina. ");
                       System.out.println(" c) Habitació 1. ");
                       System.out.println(" d) Habitació 2. ");
                       System.out.println(" e) Habitació 3. ");
                       System.out.println(" f) Lavabo. ");
                        
                        break;
                    
                    case "b":

                       System.out.println("Vols controlar totes les habitacions. ");
                       System.out.println("Vols encendre totes les llums (true/false)"); //crear boolean 
                       encendreApagarLlums = escaner.nextBoolean();

                       break;

                    case "c":
            
                    if (encendreApagarLlums == true)//canviar a futur
                       System.out.println("Vols veure el estat actual de les habitacions. ");
                       System.out.println("Els estats son:");
                       System.out.println("Sala de estar" + llumSalaEstar);


                    default:
                        break;
                }

            break;

            case "b":

                System.out.println("Vols canviar la temperatura, quina opció vols ara? "); //Haurem de preguntar que temperatura
                System.out.println(" a) Canviar la temperatura de una habitació. ");      
                System.out.println(" b) Canviar la temperatura de totes les habitacions. ");
                System.out.println(" c) Mostrar estat actual de la temperatura. ");
                System.out.println(" d) Sortir. ");

                queFerTemperatura = escaner.next();

                break;
        

            case "c":

                System.out.println("Vols canviar les finestres, quina opció vols ara? ");
                System.out.println(" a) Canviar finestres de una habitació. ");
                System.out.println(" b) Canviar finestres de totes les habitacions. ");
                System.out.println(" c) Mostrar estat actual de les finestres. ");
                System.out.println(" d) Sortir. ");

                queFerFinestre = escaner.next();

                break;

            case "d":
            
                System.out.println("Vols canviar ventiladors, quina opció vols ara? ");
                System.out.println(" a) Canviar ventilador de una habitació. ");
                System.out.println(" b) Canviar el ventilador de totes les habitacions. ");
                System.out.println(" c) Monstrar estat actual dels ventiladors. ");
                System.out.println(" d) Sortir. ");

                queFerVentilador = escaner.next();

                break;

            case "e":

                System.out.println("Vols Canviar altaveus, quina opció vols ara? ");
                System.out.println(" a) Vols canviar el altaveu de una habitació. ");
                System.out.println(" b) Vols canviar el altaveu de totes les habitacions. ");
                System.out.println(" c) Mostrar estat actual del altaveus. ");
                System.out.println(" d) Sortir. ");

                queFerAltaveu = escaner.next();

            default:
                break;
        }
    }
}