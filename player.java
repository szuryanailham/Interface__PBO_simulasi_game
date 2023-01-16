// import java.util.Scanner;
   
import java.util.Scanner;

//  LIBRARY BUFFERREADER 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
   
class player {
  public static void main(String args[]) throws IOException{
            
    Scanner input = new Scanner(System.in);

    // INPUT BUFFERREADER 
      InputStreamReader isr = new InputStreamReader(System.in);

      BufferedReader br = new BufferedReader(isr);

     
    int pilihan,hero,utullity;
    char ulang;  
    Razor razor =  new Razor();
    Zeus zeus = new Zeus();
    Pheonix Pheonix = new Pheonix();

    
    String username = "player";
    String password = "player123";

    System.out.print("Masukkan username: ");
    String userInput = br.readLine();
    System.out.print("Masukkan password: ");
    String passInput = input.nextLine();

    if(username.equals(userInput) && password.equals(passInput)){
          System.out.println("=================================");
          System.out.println(" ......WELCOME TO DOTA 2........ ");
          System.out.println("=================================\t\t");
          System.out.println();
          System.out.println("choose Spesial Charakter :");
          System.out.println("1. RAZOR");
          System.out.println("2. ZUES");
          System.out.println("3. PHEONIX");
           
          System.out.print("choose  your hero : ");
          hero = input.nextInt();
          System.out.println();
        
        switch(hero){
            case 1:
            //  ================================= ACTION HERO ONE =========================
            do {
              System.out.println("======== Hallo"+" "+userInput + " ==============");
                System.out.println("1.   description hero");
                System.out.println("2.   begin attack ");
                System.out.println("3.   defense from enemy");
                System.out.println("4.   recall your hero");
                System.out.println("5.   get weapon for hero");
                System.out.println("6.   print Description");
                System.out.println("=================================");
                 
                System.out.print("Pilihan anda: ");
                pilihan = input.nextInt();
              
                switch(pilihan){
                  case 1:
                  razor.descHero();
                    break;
                  case 2:
                  System.out.println("=================================");
                  System.out.println(" choose your Utullity Damage");
                  System.out.println("=================================");
                  System.out.println("1.Special Add Speed Hero");
                  System.out.println("2.Special Armor ");
                  System.out.print(" choose by number :");
                  utullity = input.nextInt();

                  if (utullity == 1) {
                   
                    razor.AddSpeedHero();
                  } else if(utullity ==2 ){
                   
                    razor.SpesialArmor();
                  }else{
                    System.out.println("You dont use Utullity");
                  }
                  System.out.print("input your damage for your enemy  :");
                  float damage = input.nextFloat();
                  razor.attack(damage);
                    break;
                  case 3:
                  System.out.print("input your enemy damage  :");
                   float damageEnemy = input.nextFloat();
                   razor.defense(damageEnemy);
                    break;
                  case 4:
                  razor.recall();
                    break;
                    case 5:
                    razor.getWippon();
                    break;
                    case 6:
                    razor.PrintDescHero();
                    break;
                  
                  default:
                    System.out.println("nothing action for this input");
                }
              
                System.out.println();
              
                System.out.print("Ingin memilih menu lain (y/t)? ");
                ulang = input.next().charAt(0);
                 
                System.out.println();
              }
              while (ulang!= 't');
              
              System.out.println("Terimakasih...");
               //  =================================  AKHIR ACTION HERO ONE =========================

               //  ================================= ACTION HERO TWO ================================
               break;
               case 2:
               do {
             
                System.out.println("======== Hallo"+" "+userInput + " ==============");
                System.out.println("1.   description hero");
                System.out.println("2.   begin attack ");
                System.out.println("3.   defense from enemy");
                System.out.println("4.   recall your hero");
                System.out.println("5.   get weapon for hero");
                System.out.println("6.   print Description");
                System.out.println("=================================");
                 
                System.out.print("Pilihan anda: ");
                pilihan = input.nextInt();
              
                switch(pilihan){
                  case 1:
                  zeus.descHero();
                    break;
                  case 2:
                  System.out.println("=================================");
                  System.out.println(" choose your Utullity Damage");
                  System.out.println("=================================");
                  System.out.println("1.Heard of Teresque");
                  System.out.println("2.Crimson Guard");
                  System.out.print(" choose by number :");
                  utullity = input.nextInt();

                  if (utullity == 1) {
                 
                    zeus.heardofTeresque();
                  } else if(utullity ==2 ){
                    
                    zeus.CrimsonGuard();
                  }else{
                    System.out.println("You dont use Utullity");
                  }
                  System.out.print("input your damage for your anemy  :");
                  float damage = input.nextFloat();
                  zeus.attack(damage);
                    break;
                  case 3:
                  System.out.print("input your enemy damage  :");
                   float damageEnemy = input.nextFloat();
                   zeus.defense(damageEnemy);
                    break;
                  case 4:
                  zeus.recall();
                    break;
                    case 5:
                    zeus.getWippon();
                    break;
                    case 6:
                    zeus.PrintDescHero();
                    break;
                  
                  default:
                    System.out.println("nothing action for this input");
                }
              
                System.out.println();
              
                System.out.print("Ingin memilih menu lain (y/t)? ");
                ulang = input.next().charAt(0);
                 
                System.out.println();
              }
              while (ulang!= 't');
              
              System.out.println("Terimakasih...");

              break;
               //  =================================  akhir ACTION HERO TWO =======================

                   //  ================================= ACTION HERO three =========================
                    case 3:
                    do {
                      System.out.println("======== Hallo"+" "+userInput + " ==============");
                        System.out.println("1.   description hero");
                        System.out.println("2.   begin attack ");
                        System.out.println("3.   defense from enemy");
                        System.out.println("4.   recall your hero");
                        System.out.println("5.   get weapon for hero");
                        System.out.println("6.   print Description");
                        System.out.println("=================================");
                         
                        System.out.print("Pilihan anda: ");
                        pilihan = input.nextInt();
                      
                        switch(pilihan){
                          case 1:
                          Pheonix.descHero();
                            break;
                          case 2:
                          System.out.print("you damage for enemy :");
                          float damage = input.nextFloat();
                          Pheonix.attack(damage);
                            break;
                          case 3:
                          System.out.print("input your enemy damage  :");
                           float damageEnemy = input.nextFloat();
                           Pheonix.defense(damageEnemy);
                            break;
                          case 4:
                          Pheonix.recall();
                            break;
                            case 5:
                            Pheonix.getWippon();
                            break;
                            case 6:
                            Pheonix.PrintDescHero();
                            break;
                          
                          default:
                            System.out.println("nothing action for this input");
                        }
                      
                        System.out.println();
                      
                        System.out.print("Ingin memilih menu lain (y/t)? ");
                        ulang = input.next().charAt(0);
                         
                        System.out.println();
                      }
                      while (ulang!= 't');
                      
                      System.out.println("Terimakasih...");
                       break ;

                      //  ================================= akhir  ACTION HERO three ================

                      default:
                      System.out.println(" your input is wrong");
                      break;
        }
            }else{
              System.out.println("Your name and password still wrong");

            }
  
          }
  }


