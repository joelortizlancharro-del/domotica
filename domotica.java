import java.util.Scanner;
public class domotica {

    public static void habitaciones(){
      System.out.println("Vols controlar una única habitació, quina vols controlar");
                       System.out.println(" a) Sala d'estar. ");
                       System.out.println(" b) Cuina. ");
                       System.out.println(" c) Habitació 1. ");
                       System.out.println(" d) Habitació 2. ");
                       System.out.println(" e) Habitació 3. ");
                       System.out.println(" f) Lavabo. ");
}



//public static void a fer una funcio per el dir la habitacio que s'encen

    public static void main(String[] args){
   
Scanner escaner = new Scanner(System.in);
 String queFer, queFerLlums, quinaHabitacio, queFerTemperatura, queFerFinestre, queFerVentilador, queFerAltaveu;
  boolean encendreApagarLlums, llumSalaEstar, llumCuina, llumHabitacioUn, llumHabitacioDos, llumHabitacioTres, llumLavabo, encendreApagarCalefaccio, calefaccioSalaEstar, calefaccioCuina, calefaccioHabitacioUn, calefaccioHabitacioDos, calefaccioHabitacioTres, calefaccioLavabo;
 

  encendreApagarLlums= false; //canviar
  llumSalaEstar= false;
  llumCuina = false;
  llumHabitacioUn = false;
  llumHabitacioDos = false;
  llumHabitacioTres = false;
  llumLavabo = false;

  encendreApagarCalefaccio= false; //canviar
  calefaccioCuina= false;
  calefaccioHabitacioDos = false;
  calefaccioHabitacioTres = false;
  calefaccioHabitacioUn = false;
  calefaccioLavabo = false;
  calefaccioSalaEstar = false;



do{ //aqui diem que dispositiu volem utilitzar
  
     System.out.println("Que vols fer?");
     System.out.println(" a) Canviar llums. ");
     System.out.println(" b) Canviar temperatura. ");
     System.out.println(" c) Canviar finestres. ");
     System.out.println(" d) Canviar ventiladors. ");
     System.out.println(" e) Canviar altaveus. ");
     queFer = escaner.nextLine();
   

  
         switch (queFer) {  //aqui diem que opcio volem per a les llums
            case "a":
                System.out.println("Vols canviar les llums, que opció vols ara? ");
                System.out.println(" a) Controlar una habitació. ");
                System.out.println(" b) Controlar totes les habitacions ");
                System.out.println(" c) Mostrar estat actual de les llums .");
                System.out.println(" x) Sortir. ");
               
                queFerLlums = escaner.nextLine();
                 
            
                switch (queFerLlums) { //aqui selecciones 1 habitació
                    case "a":

                       habitaciones();
                       quinaHabitacio = escaner.nextLine();
                      
                       switch (quinaHabitacio) { //aqui selecciones si vols encendre o apagar la llum de la habitacio seleccionada
                        case "a":
                           System.out.println("Vols encendre el dispositiu de la sala d'estar?");
                           llumSalaEstar = escaner.nextBoolean();
                           escaner.nextLine(); 
                            break;
                       
                        case "b":
                         System.out.println("Vols encendre el dispositiu de la cuina?");
                           llumCuina = escaner.nextBoolean();
                           escaner.nextLine();
                           break;

                        case "c":
                          System.out.println("Vols encendre el dispositiu de la habitació 1?");
                           llumHabitacioUn = escaner.nextBoolean();
                           escaner.nextLine();
                           break;

                        case "d":
                          System.out.println("Vols encendre el dispositiu de la habitació 2?");
                           llumHabitacioDos = escaner.nextBoolean();
                           escaner.nextLine();
                           break;

                        case "e":
                          System.out.println("Vols encendre el dispositiu de la habitació 3?");
                           llumHabitacioTres = escaner.nextBoolean();
                           escaner.nextLine();
                           break;

                        case "f":
                          System.out.println("Vols encendre el dispositiu del lavabo?");
                           llumLavabo = escaner.nextBoolean();
                           escaner.nextLine();
                           break;
                        default:
                            break;
                       }
                    break;
                    case "b": //Aqui mirem totes les habitacions

                       System.out.println("Vols controlar totes les habitacions. ");
                       System.out.println("Vols encendre totes les llums (true/false)"); //crear boolean 
                       encendreApagarLlums = escaner.nextBoolean();
                       escaner.nextLine();

                       break;

                    case "c": //aqui mirem el estat de les habitacions
            
                    if (encendreApagarLlums == true){
                        llumSalaEstar = true;
                        llumLavabo = true;
                        llumCuina = true;
                        llumHabitacioDos = true;
                        llumHabitacioUn = true;
                        llumHabitacioTres = true;
                    }
                       System.out.println("Vols veure el estat actual de les habitacions. ");
                       System.out.println("Els estats son:");
                       System.out.println("Sala de estar: " + llumSalaEstar);
                       System.out.println("Cuina: " + llumCuina);
                       System.out.println("Habitació 1: " + llumHabitacioUn);
                       System.out.println("Habitació 2: " + llumHabitacioDos);
                       System.out.println("Habitació 3: " + llumHabitacioTres);
                       System.out.println("Lavabo: " + llumLavabo);

                      break;

                    case "x":
                    
                    System.out.println("Sortint ");

                    default:
                        break;
                }

            break;


            

            
            
            
            
            
            
            case "b": //aqui mirem la temperatura

                System.out.println("Vols encendre la calefacció, quina opció vols ara? "); //Haurem de preguntar que temperatura
                System.out.println(" a) Encendre calefacció de una habitació. ");      
                System.out.println(" b) Encendre calefacció de totes les habitacions. ");
                System.out.println(" c) Mostrar estat actual de la calefacció. ");
                System.out.println(" x) Sortir. ");

                queFerTemperatura = escaner.next();

                  switch (queFerTemperatura) { //aqui selecciones 1 habitació
                    case "a":

                       habitaciones();
                       quinaHabitacio = escaner.nextLine();
                      
                       switch (quinaHabitacio) { //aqui selecciones si vols encendre o apagar la llum de la habitacio seleccionada
                        case "a":
                           System.out.println("Vols encendre el dispositiu de la sala d'estar?");
                           calefaccioSalaEstar = escaner.nextBoolean();
                           escaner.nextLine(); 
                            break;
                       
                        case "b":
                         System.out.println("Vols encendre el dispositiu de la cuina?");
                           calefaccioCuina = escaner.nextBoolean();
                           escaner.nextLine();
                           break;

                        case "c":
                          System.out.println("Vols encendre el dispositiu de la habitació 1?");
                           calefaccioHabitacioUn = escaner.nextBoolean();
                           escaner.nextLine();
                           break;

                        case "d":
                          System.out.println("Vols encendre el dispositiu de la habitació 2?");
                           calefaccioHabitacioDos = escaner.nextBoolean();
                           escaner.nextLine();
                           break;

                        case "e":
                          System.out.println("Vols encendre el dispositiu de la habitació 3?");
                           calefaccioHabitacioTres = escaner.nextBoolean();
                           escaner.nextLine();
                           break;

                        case "f":
                          System.out.println("Vols encendre el dispositiu del lavabo?");
                           calefaccioLavabo = escaner.nextBoolean();
                           escaner.nextLine();
                           break;
                        default:
                            break;
                       }
                    
                    case "b": //Aqui mirem totes les habitacions

                       System.out.println("Vols controlar totes les habitacions. ");
                       System.out.println("Vols encendre totes les calefaccions (true/false)"); //crear boolean 
                       encendreApagarCalefaccio = escaner.nextBoolean();
                       escaner.nextLine();

                       break;

                    case "c": //aqui mirem el estat de les habitacions
            
                    if (encendreApagarCalefaccio == true){
                        calefaccioSalaEstar = true;
                        calefaccioCuina = true;
                        calefaccioHabitacioDos = true;
                        calefaccioHabitacioTres = true;
                        calefaccioHabitacioUn = true;
                        calefaccioLavabo = true;
                    }
                       System.out.println("Vols veure el estat actual de les habitacions. ");
                       System.out.println("Els estats son:");
                       System.out.println("Sala de estar: " + calefaccioSalaEstar);
                       System.out.println("Cuina: " + calefaccioCuina);
                       System.out.println("Habitació 1: " + calefaccioHabitacioUn);
                       System.out.println("Habitació 2: " + calefaccioHabitacioDos);
                       System.out.println("Habitació 3: " + calefaccioHabitacioTres);
                       System.out.println("Lavabo: " + calefaccioLavabo);

                      break;

                    case "x":
                    
                    System.out.println("Sortint ");

                    default:
                        break;
                }

            break; //aqui acaba la temperatura
        

          
          
          
          
          
          
          
          
          
            case "c":

                System.out.println("Vols canviar les finestres, quina opció vols ara? ");
                System.out.println(" a) Canviar finestres de una habitació. ");
                System.out.println(" b) Canviar finestres de totes les habitacions. ");
                System.out.println(" c) Mostrar estat actual de les finestres. ");
                System.out.println(" x) Sortir. ");

                queFerFinestre = escaner.next();

                break;

            case "d":
            
                System.out.println("Vols canviar ventiladors, quina opció vols ara? ");
                System.out.println(" a) Canviar ventilador de una habitació. ");
                System.out.println(" b) Canviar el ventilador de totes les habitacions. ");
                System.out.println(" c) Monstrar estat actual dels ventiladors. ");
                System.out.println(" x) Sortir. ");

                queFerVentilador = escaner.next();

                break;

            case "e":

                System.out.println("Vols Canviar altaveus, quina opció vols ara? ");
                System.out.println(" a) Vols canviar el altaveu de una habitació. ");
                System.out.println(" b) Vols canviar el altaveu de totes les habitacions. ");
                System.out.println(" c) Mostrar estat actual del altaveus. ");
                System.out.println(" x) Sortir. ");

                queFerAltaveu = escaner.next();

            default:
                break;
        }
     } while (!queFer.equals("x"));
    
       
    }    
}
