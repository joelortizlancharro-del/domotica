import java.util.Scanner;
public class domotica {



   static boolean encendreApagarLlums, llumSalaEstar, llumCuina, llumHabitacioUn, llumHabitacioDos, llumHabitacioTres, llumLavabo, encendreApagarCalefaccio,  calefaccioSalaEstar, calefaccioCuina, calefaccioHabitacioUn, calefaccioHabitacioDos, calefaccioHabitacioTres, calefaccioLavabo, encendreApagarFinestres, finestresCuina, finestresSalaEstar, finestresLavabo, finestresHabitacioUn, finestresHabitacioDos, finestresHabitacioTres, encendreApagarVentilador, ventiladorCuina, ventiladorSalaEstar, ventiladorLavabo, ventiladorHabitacioUn, ventiladorHabitacioDos, ventiladorHabitacioTres, encendreApagarAltaveus, altaveuCuina, altaveuSalaEstar, altaveuLavabo, altaveuHabitacioUn, altaveuHabitacioDos, altaveuHabitacioTres;
   static int calefaccioCuinaInt, calefaccioHabitacioDosInt, calefaccioHabitacioTresInt, calefaccioHabitacioUnInt, calefaccioLavaboInt, calefaccioSalaEstarInt, tempActualSalaEstar, tempActualCuina, tempActualLavabo, tempActualHabitacioUn, tempActualHabitacioDos, tempActualHabitacioTres, encendreApagarCalefaccioInt ;
    public static void main(String[] args){

      domotica p = new domotica();
      p.principal();
    }
Scanner escaner = new Scanner(System.in);
    public  void habitaciones(){
      System.out.println("Vols controlar una única habitació, quina vols controlar");
                       System.out.println(" a) Sala d'estar. ");
                       System.out.println(" b) Cuina. ");
                       System.out.println(" c) Habitació 1. ");
                       System.out.println(" d) Habitació 2. ");
                       System.out.println(" e) Habitació 3. ");
                       System.out.println(" f) Lavabo. ");
}

 public void gestionaLlums(String queFerLlums, String quinaHabitacio){
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

                       encendreLlums(encendreApagarLlums);
                       break;

                    case "c": //aqui mirem el estat de les habitacions
            
         
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
                    
                    sortirApp();

                    default:
                        break;
                }

         
 }
 
 public void gestionaCalefaccio(String queFerTemperatura, String quinaHabitacio){
   
                System.out.println("Vols canviar la calefacció, quina opció vols ara? "); //Haurem de preguntar que temperatura
                System.out.println(" a) Canviar calefacció de una habitació. ");      
                System.out.println(" b) Canviar calefacció de totes les habitacions. ");
                System.out.println(" c) Mostrar estat actual de la calefacció. ");
                System.out.println(" x) Sortir. ");

                queFerTemperatura = escaner.nextLine();

                  switch (queFerTemperatura) { //aqui selecciones 1 habitació
                    case "a":

                       habitaciones();
                       quinaHabitacio = escaner.nextLine();
                      
                       switch (quinaHabitacio) { //aqui selecciones si vols encendre o apagar la llum de la habitacio seleccionada
                        case "a":
                           System.out.println("Vols canviar la temperatura de la sala d'estar.");
                           calefaccioSalaEstarInt = escaner.nextInt();
                           escaner.nextLine(); 
                        
                             forTempSalaEstar();
                         break;
                     
                         
                        case "b":
                         System.out.println("Vols canviar la temperatura de la cuina.");
                           calefaccioCuinaInt = escaner.nextInt();
                           escaner.nextLine();

                           forTempCuina();
                           break;

                        case "c":
                          System.out.println("Vols canviar la temperatura de la habitació 1.");
                           calefaccioHabitacioUnInt = escaner.nextInt();
                           escaner.nextLine();

                           forTempHabitacioUn();
                           break;

                        case "d":
                          System.out.println("Vols canviar la temperatura de la habitació 2.");
                           calefaccioHabitacioDosInt = escaner.nextInt();
                           escaner.nextLine();

                           forTempHabitacioDos();
                           break;

                        case "e":
                          System.out.println("Vols canviar la temperatura de la habitació 3.");
                           calefaccioHabitacioTresInt = escaner.nextInt();
                           escaner.nextLine();

                           forTempHabitacioTres();
                           break;

                        case "f":
                          System.out.println("Vols canviar la temperatura del lavabo.");
                           calefaccioLavaboInt = escaner.nextInt();
                           escaner.nextLine();

                           forTempLavabo();
                           break;
                        default:
                            break;
                       }
                    break;
                    case "b": //Aqui mirem totes les habitacions

                       System.out.println("Vols canviar la temperatura de totes les habitacions. ");
                       System.out.println("Quina teperatura vols posar en la casa?"); //crear boolean 
                       encendreApagarCalefaccioInt = escaner.nextInt();
                       escaner.nextLine();

                       encendreCalefaccio(encendreApagarCalefaccioInt);

                       break;

                    case "c": //aqui mirem el estat de les habitacions
            //falta posar el igual
                       System.out.println("Vols veure el estat actual de les habitacions. ");
                       System.out.println("Els estats son:");
                       System.out.println("Sala de estar: " + calefaccioSalaEstarInt);
                       System.out.println("Cuina: " + calefaccioCuinaInt);
                       System.out.println("Habitació 1: " + calefaccioHabitacioUnInt);
                       System.out.println("Habitació 2: " + calefaccioHabitacioDosInt);
                       System.out.println("Habitació 3: " + calefaccioHabitacioTresInt);
                       System.out.println("Lavabo: " + calefaccioLavaboInt);

                      break;

                    case "x":
                    
                    sortirApp();

                    default:
                        break;
                }
    
 }

 public void gestionaFinestres(String queFerFinestre, String quinaHabitacio){
   
                System.out.println("Vols canviar les finestres, quina opció vols ara? ");
                System.out.println(" a) Canviar finestres de una habitació. ");
                System.out.println(" b) Canviar finestres de totes les habitacions. ");
                System.out.println(" c) Mostrar estat actual de les finestres. ");
                System.out.println(" x) Sortir. ");

                queFerFinestre = escaner.nextLine();

                  switch (queFerFinestre) { //aqui selecciones 1 habitació
                    case "a":

                       habitaciones();
                       quinaHabitacio = escaner.nextLine();
                      
                       switch (quinaHabitacio) { //aqui selecciones si vols encendre o apagar la llum de la habitacio seleccionada
                        case "a":
                           System.out.println("Vols encendre el dispositiu de la sala d'estar?");
                           finestresSalaEstar = escaner.nextBoolean();
                           escaner.nextLine(); 
                            break;
                       
                        case "b":
                         System.out.println("Vols encendre el dispositiu de la cuina?");
                           finestresCuina = escaner.nextBoolean();
                           escaner.nextLine();
                           break;

                        case "c":
                          System.out.println("Vols encendre el dispositiu de la habitació 1?");
                           finestresHabitacioUn = escaner.nextBoolean();
                           escaner.nextLine();
                           break;

                        case "d":
                          System.out.println("Vols encendre el dispositiu de la habitació 2?");
                           finestresHabitacioDos = escaner.nextBoolean();
                           escaner.nextLine();
                           break;

                        case "e":
                          System.out.println("Vols encendre el dispositiu de la habitació 3?");
                           finestresHabitacioTres = escaner.nextBoolean();
                           escaner.nextLine();
                           break;

                        case "f":
                          System.out.println("Vols encendre el dispositiu del lavabo?");
                           finestresLavabo = escaner.nextBoolean();
                           escaner.nextLine();
                           break;
                        default:
                            break;
                       }
                    break;
                    case "b": //Aqui mirem totes les habitacions

                       System.out.println("Vols controlar totes les habitacions. ");
                       System.out.println("Vols encendre totes les finestres? (true/false)"); //crear boolean 
                       encendreApagarFinestres = escaner.nextBoolean();
                       escaner.nextLine();
                       
                       encendreFinestre(encendreApagarFinestres);
                       break;

                    case "c": //aqui mirem el estat de les habitacions
            
                  
            
                       System.out.println("Vols veure el estat actual de les habitacions. ");
                       System.out.println("Els estats son:");
                       System.out.println("Sala de estar: " + finestresSalaEstar);
                       System.out.println("Cuina: " + finestresCuina);
                       System.out.println("Habitació 1: " + finestresHabitacioUn);
                       System.out.println("Habitació 2: " + finestresHabitacioDos);
                       System.out.println("Habitació 3: " + finestresHabitacioTres);
                       System.out.println("Lavabo: " + finestresLavabo);

                      break;

                    case "x":
                    
                   sortirApp();

                    default:
                        break;
                }
 }
 
public void gestionaVentiladors(String queFerVentilador, String quinaHabitacio){
   
                System.out.println("Vols canviar ventiladors, quina opció vols ara? ");
                System.out.println(" a) Canviar ventilador de una habitació. ");
                System.out.println(" b) Canviar el ventilador de totes les habitacions. ");
                System.out.println(" c) Monstrar estat actual dels ventiladors. ");
                System.out.println(" x) Sortir. ");

                queFerVentilador = escaner.nextLine();

             switch (queFerVentilador) { //aqui selecciones 1 habitació
                    case "a":

                       habitaciones();
                       quinaHabitacio = escaner.nextLine();
                      
                       switch (quinaHabitacio) { //aqui selecciones si vols encendre o apagar la llum de la habitacio seleccionada
                        case "a":
                           System.out.println("Vols encendre el dispositiu de la sala d'estar?");
                           ventiladorSalaEstar = escaner.nextBoolean();
                           escaner.nextLine(); 
                            break;
                       
                        case "b":
                         System.out.println("Vols encendre el dispositiu de la cuina?");
                           ventiladorCuina = escaner.nextBoolean();
                           escaner.nextLine();
                           break;

                        case "c":
                          System.out.println("Vols encendre el dispositiu de la habitació 1?");
                           ventiladorHabitacioUn = escaner.nextBoolean();
                           escaner.nextLine();
                           break;

                        case "d":
                          System.out.println("Vols encendre el dispositiu de la habitació 2?");
                           ventiladorHabitacioDos = escaner.nextBoolean();
                           escaner.nextLine();
                           break;

                        case "e":
                          System.out.println("Vols encendre el dispositiu de la habitació 3?");
                           ventiladorHabitacioTres = escaner.nextBoolean();
                           escaner.nextLine();
                           break;

                        case "f":
                          System.out.println("Vols encendre el dispositiu del lavabo?");
                           ventiladorLavabo = escaner.nextBoolean();
                           escaner.nextLine();
                           break;
                        default:
                            break;
                       }
                    break;
                    case "b": //Aqui mirem totes les habitacions

                       System.out.println("Vols controlar totes les habitacions. ");
                       System.out.println("Vols encendre tots els ventiladors? (true/false)"); //crear boolean 
                       encendreApagarVentilador = escaner.nextBoolean();
                       escaner.nextLine();

                       encendreVentilador(encendreApagarVentilador);
                       break;

                    case "c": //aqui mirem el estat de les habitacions

                    
                       System.out.println("Vols veure el estat actual de les habitacions. ");
                       System.out.println("Els estats son:");
                       System.out.println("Sala de estar: " + ventiladorSalaEstar);
                       System.out.println("Cuina: " + ventiladorCuina);
                       System.out.println("Habitació 1: " + ventiladorHabitacioUn);
                       System.out.println("Habitació 2: " + ventiladorHabitacioDos);
                       System.out.println("Habitació 3: " + ventiladorHabitacioTres);
                       System.out.println("Lavabo: " + ventiladorLavabo);

                      break;

                    case "x":
                    
                    System.out.println("Sortint ");

                    default:
                        break;
                }
}

public void gestionaAltaveu(String queFerAltaveu, String quinaHabitacio){
                   System.out.println("Vols Canviar altaveus, quina opció vols ara? ");
                System.out.println(" a) Vols canviar el altaveu de una habitació. ");
                System.out.println(" b) Vols canviar el altaveu de totes les habitacions. ");
                System.out.println(" c) Mostrar estat actual del altaveus. ");
                System.out.println(" x) Sortir. ");

                queFerAltaveu = escaner.nextLine();


                             switch (queFerAltaveu) { //aqui selecciones 1 habitació
                    case "a":

                       habitaciones();
                       quinaHabitacio = escaner.nextLine();
                      
                       switch (quinaHabitacio) { //aqui selecciones si vols encendre o apagar la llum de la habitacio seleccionada
                        case "a":
                           System.out.println("Vols encendre el dispositiu de la sala d'estar?");
                           altaveuSalaEstar = escaner.nextBoolean();
                           escaner.nextLine(); 
                            break;
                       
                        case "b":
                         System.out.println("Vols encendre el dispositiu de la cuina?");
                           altaveuCuina = escaner.nextBoolean();
                           escaner.nextLine();
                           break;

                        case "c":
                          System.out.println("Vols encendre el dispositiu de la habitació 1?");
                           altaveuHabitacioUn = escaner.nextBoolean();
                           escaner.nextLine();
                           break;

                        case "d":
                          System.out.println("Vols encendre el dispositiu de la habitació 2?");
                           altaveuHabitacioDos = escaner.nextBoolean();
                           escaner.nextLine();
                           break;

                        case "e":
                          System.out.println("Vols encendre el dispositiu de la habitació 3?");
                           altaveuHabitacioTres = escaner.nextBoolean();
                           escaner.nextLine();
                           break;

                        case "f":
                          System.out.println("Vols encendre el dispositiu del lavabo?");
                           altaveuLavabo = escaner.nextBoolean();
                           escaner.nextLine();
                           break;
                        default:
                            break;
                       }
                    break;
                    case "b": //Aqui mirem totes les habitacions

                       System.out.println("Vols controlar totes les habitacions. ");
                       System.out.println("Vols encendre tots els altaveus? (true/false)"); //crear boolean 
                       encendreApagarAltaveus = escaner.nextBoolean();
                       escaner.nextLine();

                       encendreAltaveus(encendreApagarAltaveus);
                       break;

                    case "c": //aqui mirem el estat de les habitacions
            
                       System.out.println("Vols veure el estat actual de les habitacions. ");
                       System.out.println("Els estats son:");
                       System.out.println("Sala de estar: " + altaveuSalaEstar);
                       System.out.println("Cuina: " + altaveuCuina);
                       System.out.println("Habitació 1: " + altaveuHabitacioUn);
                       System.out.println("Habitació 2: " + altaveuHabitacioDos);
                       System.out.println("Habitació 3: " + altaveuHabitacioTres);
                       System.out.println("Lavabo: " + altaveuLavabo);

                      break;

                    case "x":
                    
                    System.out.println("Sortint ");

                    default:
                        break;
             
     } 
}



public void forTempSalaEstar(){
                             if(calefaccioSalaEstarInt < tempActualSalaEstar){
                           System.out.println("La temperatura esta baixant.");
                           for(; calefaccioSalaEstarInt <= tempActualSalaEstar; tempActualSalaEstar--){
                              System.out.println(tempActualSalaEstar);
                              }
                            
                             System.out.println("La temperatura actual es: " + calefaccioSalaEstarInt);
                             calefaccioSalaEstarInt = tempActualSalaEstar;
                        }
                       
                        else if(calefaccioSalaEstarInt > tempActualSalaEstar){
                           System.out.println("La temperatura esta puixant.");
                           for(; calefaccioSalaEstarInt >= tempActualSalaEstar; tempActualSalaEstar++){
                              System.out.println(tempActualSalaEstar);

                           }
                            System.out.println("La temperatura actual es: " + calefaccioSalaEstarInt);
                            calefaccioSalaEstarInt = tempActualSalaEstar;
                        }      
}

public void forTempCuina(){
                             if(calefaccioCuinaInt < tempActualCuina){
                           System.out.println("La temperatura esta baixant.");
                           for(; calefaccioCuinaInt <= tempActualCuina; tempActualCuina--){
                              System.out.println(tempActualCuina);
                               }
                               
                              System.out.println("La temperatura actual es: " + calefaccioCuinaInt);
                              calefaccioCuinaInt = tempActualCuina;
                        }
                        else if(calefaccioCuinaInt > tempActualCuina){
                           System.out.println("La temperatura esta puixant.");
                           for(; calefaccioCuinaInt >= tempActualCuina; tempActualCuina++){
                              System.out.println(calefaccioCuinaInt);
                            }
                             
                             System.out.println("La temperatura actual es: " + calefaccioCuinaInt);
                             calefaccioCuinaInt = tempActualCuina;
                        }      
}

public void forTempHabitacioUn(){
                             if(calefaccioHabitacioUnInt < tempActualHabitacioUn){
                           System.out.println("La temperatura esta baixant.");
                           for(; calefaccioHabitacioUnInt <= tempActualHabitacioUn; tempActualHabitacioUn--){
                              System.out.println(tempActualHabitacioUn);
                               }
                               
                              System.out.println("La temperatura actual es: " + calefaccioHabitacioUnInt);
                              calefaccioHabitacioUnInt = tempActualHabitacioUn;
                        }
                        else if(calefaccioHabitacioUnInt > tempActualHabitacioUn){
                           System.out.println("La temperatura esta puixant.");
                           for(; calefaccioHabitacioUnInt >= tempActualHabitacioUn; tempActualHabitacioUn++){
                              System.out.println(calefaccioHabitacioUnInt);
                            }
                             
                             System.out.println("La temperatura actual es: " + calefaccioHabitacioUnInt);
                             calefaccioHabitacioUnInt = tempActualHabitacioUn;
                        }      
}

public void forTempHabitacioDos(){
                             if(calefaccioHabitacioDosInt < tempActualHabitacioDos){
                           System.out.println("La temperatura esta baixant.");
                           for(; calefaccioHabitacioDosInt <= tempActualHabitacioDos; tempActualHabitacioDos--){
                              System.out.println(tempActualHabitacioDos);
                               }
                               
                              System.out.println("La temperatura actual es: " + calefaccioHabitacioDosInt);
                              calefaccioHabitacioDosInt = tempActualHabitacioDos;
                        }
                        else if(calefaccioHabitacioDosInt > tempActualHabitacioDos){
                           System.out.println("La temperatura esta puixant.");
                           for(; calefaccioHabitacioDosInt >= tempActualHabitacioDos; tempActualHabitacioDos++){
                              System.out.println(calefaccioHabitacioDosInt);
                            }
                             
                             System.out.println("La temperatura actual es: " + calefaccioHabitacioDosInt);
                             calefaccioHabitacioDosInt = tempActualHabitacioDos;
                        }      
}

public void forTempHabitacioTres(){
                             if(calefaccioHabitacioTresInt < tempActualHabitacioTres){
                           System.out.println("La temperatura esta baixant.");
                           for(; calefaccioHabitacioTresInt <= tempActualHabitacioTres; tempActualHabitacioTres--){
                              System.out.println(tempActualHabitacioTres);
                               }
                               
                              System.out.println("La temperatura actual es: " + calefaccioHabitacioTresInt);
                              calefaccioHabitacioTresInt = tempActualHabitacioTres;
                        }
                        else if(calefaccioHabitacioTresInt > tempActualHabitacioTres){
                           System.out.println("La temperatura esta puixant.");
                           for(; calefaccioHabitacioTresInt >= tempActualHabitacioTres; tempActualHabitacioTres++){
                              System.out.println(calefaccioHabitacioTresInt);
                            }
                             
                             System.out.println("La temperatura actual es: " + calefaccioHabitacioTresInt);
                             calefaccioHabitacioTresInt = tempActualHabitacioTres;
                        }      
}

public void forTempLavabo(){
                             if(calefaccioLavaboInt < tempActualLavabo){
                           System.out.println("La temperatura esta baixant.");
                           for(; calefaccioLavaboInt <= tempActualLavabo; tempActualLavabo--){
                              System.out.println(tempActualLavabo);
                               }
                               
                              System.out.println("La temperatura actual es: " + calefaccioLavaboInt);
                              calefaccioLavaboInt = tempActualLavabo;
                        }
                        else if(calefaccioLavaboInt > tempActualLavabo){
                           System.out.println("La temperatura esta puixant.");
                           for(; calefaccioLavaboInt >= tempActualLavabo; tempActualLavabo++){
                              System.out.println(calefaccioLavaboInt);
                            }
                             
                             System.out.println("La temperatura actual es: " + calefaccioLavaboInt);
                             calefaccioLavaboInt = tempActualLavabo;
                        }      
}



 public void encendreLlums(boolean encendreApagarLlums){
       
         llumCuina=encendreApagarLlums;
         llumHabitacioDos = encendreApagarLlums;
         llumHabitacioTres = encendreApagarLlums;
         llumHabitacioUn = encendreApagarLlums;
         llumLavabo = encendreApagarLlums;
         llumSalaEstar = encendreApagarLlums;
     
    }
  
 public void encendreCalefaccio(int encendreApagarCalefaccioInt){
      calefaccioCuinaInt = encendreApagarCalefaccioInt;
      calefaccioHabitacioDosInt = encendreApagarCalefaccioInt;
      calefaccioHabitacioTresInt = encendreApagarCalefaccioInt;
      calefaccioHabitacioUnInt = encendreApagarCalefaccioInt;
      calefaccioLavaboInt = encendreApagarCalefaccioInt;
      calefaccioSalaEstarInt = encendreApagarCalefaccioInt;
   }

 public void encendreFinestre(boolean encendreApagarFinestres){
   finestresCuina = encendreApagarFinestres;
   finestresHabitacioDos = encendreApagarFinestres;
   finestresHabitacioTres = encendreApagarFinestres;
   finestresHabitacioUn = encendreApagarFinestres;
   finestresLavabo = encendreApagarFinestres;
   finestresSalaEstar = encendreApagarFinestres;
 }
   
 public void encendreAltaveus(boolean encendreApagarAltaveus){
   altaveuCuina = encendreApagarAltaveus;
   altaveuHabitacioDos = encendreApagarAltaveus;
   altaveuHabitacioTres = encendreApagarAltaveus;
   altaveuHabitacioUn = encendreApagarAltaveus;
   altaveuLavabo = encendreApagarAltaveus;
   altaveuSalaEstar = encendreApagarAltaveus;
 }

 public void encendreVentilador(boolean encendreApagarVentilador){
   ventiladorCuina = encendreApagarVentilador;
   ventiladorHabitacioDos = encendreApagarVentilador;
   ventiladorHabitacioTres = encendreApagarVentilador;
   ventiladorHabitacioUn = encendreApagarVentilador;
   ventiladorLavabo = encendreApagarVentilador;
   ventiladorSalaEstar = encendreApagarVentilador;
 }

 public void sortirApp(){
      System.out.println("Estas sortint");
   }
   

public void principal(){
   

     
 String queFer, queFerLlums, quinaHabitacio, queFerTemperatura, queFerFinestre, queFerVentilador, queFerAltaveu;

  //Iniciar les variables
 
  encendreApagarLlums= false; 
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

  encendreApagarFinestres = false;
  finestresSalaEstar = false;
  finestresCuina = false;
  finestresHabitacioUn = false;
  finestresHabitacioDos = false;
  finestresHabitacioTres = false;
  finestresLavabo = false;

  encendreApagarAltaveus = false;
  altaveuCuina = false;
  altaveuLavabo = false;
  altaveuSalaEstar = false;
  altaveuHabitacioUn = false;
  altaveuHabitacioDos = false;
  altaveuHabitacioTres = false;

  encendreApagarVentilador = false;
  ventiladorCuina = false;
  ventiladorLavabo= false;
  ventiladorSalaEstar = false;
  ventiladorHabitacioUn = false;
  ventiladorHabitacioDos = false;
  ventiladorHabitacioTres = false;

   //canviar
  calefaccioCuinaInt = 20;
  calefaccioHabitacioDosInt = 20;
  calefaccioHabitacioTresInt = 20;
  calefaccioHabitacioUnInt = 20;
  calefaccioLavaboInt = 20;
  calefaccioSalaEstarInt = 20;

  tempActualCuina = 20;
  tempActualHabitacioDos = 20;
  tempActualHabitacioTres = 20;
  tempActualHabitacioUn = 20;
  tempActualLavabo = 20;
  tempActualSalaEstar = 20;

  queFerLlums = "a";
  quinaHabitacio = "a";
  queFerTemperatura = "a";
  queFerAltaveu = "a";
  queFerFinestre ="a";
  queFerVentilador = "a";

//Aqui acaba el iniciar les variables

do{ //Començem bucle
  
     System.out.println("Que vols fer?");
     System.out.println(" a) Canviar llums. ");
     System.out.println(" b) Canviar temperatura. ");
     System.out.println(" c) Canviar finestres. ");
     System.out.println(" d) Canviar ventiladors. ");
     System.out.println(" e) Canviar altaveus. ");
     queFer = escaner.nextLine();
   

  
         switch (queFer) {  //aqui diem que opcio volem per a les llums
            case "a":
             
                gestionaLlums(queFerLlums, quinaHabitacio);
               
             break; //aqui acaba les llums

           
          
           
             case "b": //aqui mirem la temperatura

               gestionaCalefaccio(queFerTemperatura, quinaHabitacio);
          
               break; //aqui acaba la temperatura
        

            
             case "c": //aqui mirem finestres

               gestionaFinestres(queFerFinestre, quinaHabitacio);

            break; //aqui acaba les finestres
        


            case "d": //aqui mirem ventiladors
            
              gestionaVentiladors(queFerVentilador, quinaHabitacio);

            break; //aqui acaba els ventiladors

           
           
            case "e"://aqui mirem altaveus

            gestionaAltaveu(queFerAltaveu, quinaHabitacio);

       
          }//aqui acaba el switch principal   

       }while (!queFer.equals("x")); //aqui acaba el do i es posa el while
 
    }//aqui acaba el void principal

}//aqui acaba tot



