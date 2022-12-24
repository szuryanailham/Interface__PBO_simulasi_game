import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class Pheonix extends Hero {
    
    public Pheonix(){
        this.hitPoint = 200;
        this.energiPlayer =200;
        this.speedHero = 75.4;
    }
    @Override
    public void descHero(){
       
        try{
            PrintWriter output = new PrintWriter(new FileOutputStream("Pheonix.txt"));
            output.println("anda memilih Pheonix sebagai hero anda");
            output.println("DESCRIPTION HERO : ");
            output.println("=======================================");
            output.println("name   :Pheonix  ");
            output.println("type   : strength");
            output.println(   "HP    :" + this.energiPlayer + "%");
            output.println("Energi   :" + this.energiPlayer + "%");
            output.println("Speed    :" + this.speedHero + "%");
            output.println("=======================================");
            output.close();
        }catch(FileNotFoundException e){
           e.printStackTrace();
        }
       
    }
    
    @Override
    public void attack(float damage){
    
        this.energiPlayer -= damage;
        if (this.hitPoint == min_hitPoint) {
            System.out.println("you have dead");
        }else{
            if (this.energiPlayer == max_Energi) {
               System.out.println("uppss your Energy has fullfed");
              } else if (this.energiPlayer == min_Energi) {
                System.out.println("sorry you energy zero ");
              } else {
                try {
                    // Buka file teks untuk ditulis (mode tambah)
                    PrintWriter output = new PrintWriter(new FileOutputStream("output.txt", true));
              
                    // Tulis ke file teks
                    output.println("============= After ATTACK ================");
                    output.println("name   : Pheonix   ");
                    output.println("type   : strength");
                    output.println(   "HP    :" + this.hitPoint + "%");
                    output.println("Energi   :" + this.energiPlayer + "%");
                    output.println("Speed    :" + this.speedHero + "%");
                    output.println("=======================================");
              
                    // Tutup file teks
                    output.close();
                  } catch (Exception e) {
                    e.printStackTrace();
                  }
              }     
            
        }
        
        
    }
    @Override
    public void defense(float damageEnemy){
        this.hitPoint -= damageEnemy;
        if (this.hitPoint == min_hitPoint) {
            System.out.println("you have dead");
        }else{
        try {
            // Buka file teks untuk ditulis (mode tambah)
            PrintWriter output = new PrintWriter(new FileOutputStream("output.txt", true));
      
            // Tulis ke file teks
            output.println("============= AfTER DEFENSE ================");
            output.println("name   : Pheonix   ");
            output.println("type   : strength");
            output.println(   "HP     :" + this.hitPoint + "%");
            output.println("Energi   :" + this.energiPlayer + "%");
            output.println("Speed    :" + this.speedHero + "%");
            output.println("=======================================");
      
            // Tutup file teks
            output.close();
          } catch (Exception e) {
            e.printStackTrace();
          }
              
        }
        }

        @Override
        public void recall(){
            // jika hero me recall 7 detik ++ 15% of hp and ++10 % of energy
          
               
                  
                    try {
                        // Buka file teks untuk ditulis (mode tambah)
                        PrintWriter output = new PrintWriter(new FileOutputStream("output.txt", true));
                        this.hitPoint+=7.5;
                        this.energiPlayer+=5;
    
                        // Tulis ke file teks
                    output.println(" anda melakukan recall hero");
                    output.println(" hero mendapat buff hp 7,5% dan energi  5 %");
                    output.println("============= After recall  ================");
                    output.println("name   :Pheonix  ");
                    output.println("type   : strength");
                    output.println(   "HP    :" + this.hitPoint + "%");
                    output.println("Energi   :" + this.energiPlayer + "%");
                    output.println("Speed    :" + this.speedHero + "%");
                    output.println("===========================================");
                  
                        // Tutup file teks
                        output.close();
                      } catch (Exception e) {
                        e.printStackTrace();
                      }

    
                
    
        }
        @Override
        public void getWippon(){
            
            this.hitPoint += 3.2;
            this.energiPlayer+= 7.5;

            try {
                // Buka file teks untuk ditulis (mode tambah)
                PrintWriter output = new PrintWriter(new FileOutputStream("output.txt", true));
          
                // Tulis ke file teks
          output.println("you get specials wipon for your Hero");
            output.println("buff energy will add 3.2 %");
            output.println("buff energy will add 7.5 %");
    
    
            output.println("============= After get weapon ================");
            output.println("name   :Pheonix ");
            output.println("type   : strength");
            output.println(   "HP    :" + this.hitPoint + "%");
            output.println("Energi   :" + this.energiPlayer + "%");
            output.println("Speed    :" + this.speedHero + "%");
            output.println("===========================================");
          
                // Tutup file teks
                output.close();
              } catch (Exception e) {
                e.printStackTrace();
              }
            
          
    
    
        }




}
