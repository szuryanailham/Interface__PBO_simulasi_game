
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class Razor extends Hero implements AgilityHero{

    public Razor(){
        this.hitPoint = 100;
        this.energiPlayer =100;
        this.speedHero = 52.1;
    }

    @Override
    public void descHero(){
        System.out.println("anda memilih Pheonix sebagai hero anda");
        System.out.println("DESCRIPTION HERO : ");
        System.out.println("=======================================");
        System.out.println("name   :Razor ");
        System.out.println("type   :Agility");
        System.out.println(   "HP    :" + this.hitPoint + "%");
        System.out.println("Energi   :" + this.energiPlayer + "%");
        System.out.println("Speed    :" + this.speedHero + "%");
        System.out.println("=======================================");
    };
    
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
                System.out.println("=======================================");
                System.out.println("============= AFTER ATTACK  ===========");
                System.out.println("=======================================");
                System.out.println("name   :Razor  ");
                System.out.println("type   :Agility");
                System.out.println(   "HP    :" + this.hitPoint + "%");
                System.out.println("Energi   :" + this.energiPlayer + "%");
                System.out.println("Speed    :" + this.speedHero + "%");
                System.out.println("=======================================");
        }
    }
    };

    public void defense(float damageEnemy){
        this.hitPoint -= damageEnemy;
        if (this.hitPoint == min_hitPoint) {
            System.out.println("you have dead");
        }else{
            System.out.println("=======================================");
            System.out.println("============= AFTER DEFENSE  ===========");
            System.out.println("=======================================");
            System.out.println("name   :Razor  ");
            System.out.println("type   :Agility");
            System.out.println(   "HP    :" + this.hitPoint + "%");
            System.out.println("Energi   :" + this.energiPlayer + "%");
            System.out.println("Speed    :" + this.speedHero + "%");
            System.out.println("=======================================");
        }
        }


    public void recall(){
        // jika hero me recall 7 detik ++ 15% of hp and ++10 % of energy
      
           
        this.hitPoint+=7.5;
        this.energiPlayer+=5;

        System.out.println(" anda melakukan recall hero");
        System.out.println(" hero mendapat buff hp 7,5% dan energi  5 %");

        System.out.println("=======================================");
        System.out.println("============= AFTER RECALL  ===========");
        System.out.println("=======================================");
        System.out.println("name   :Razor  ");
        System.out.println("type   :Agility");
        System.out.println(   "HP    :" + this.hitPoint + "%");
        System.out.println("Energi   :" + this.energiPlayer + "%");
        System.out.println("Speed    :" + this.speedHero + "%");
        System.out.println("=======================================");
        }

    public void getWippon(){
        
        System.out.println("you get specials wipon for your Hero");
        System.out.println("buff energy will add 3.2 %");
        System.out.println("buff energy will add 7.5 %");

        this.hitPoint += 3.2;
        this.energiPlayer+= 7.5;

        System.out.println("=======================================");
        System.out.println("============= AFTER GETWEPPON =========");
        System.out.println("=======================================");
        System.out.println("name   :Razor  ");
        System.out.println("type   :Agility");
        System.out.println(   "HP    :" + this.hitPoint + "%");
        System.out.println("Energi   :" + this.energiPlayer + "%");
        System.out.println("Speed    :" + this.speedHero + "%");
        System.out.println("=======================================");
    };
    

    public void  AddSpeedHero(){
        double Speed = 20;
        this.speedHero += Speed;
        System.out.println("congratulations your hero speed will add Special Item");
        System.out.println("speed will  add 20%");
        System.out.println("============================================");
        System.out.println("============= AFTER SPECIAL DAMAGE =========");
        System.out.println("============================================");
        System.out.println("name   :Razor  ");
        System.out.println("type   :Agility");
        System.out.println(   "HP    :" + this.hitPoint + "%");
        System.out.println("Energi   :" + this.energiPlayer + "%");
        System.out.println("Speed    :" + this.speedHero + "%");
        System.out.println("=======================================");
        

    }
    public void  SpesialArmor(){
        double armor = 21;
        this.hitPoint += armor;
        System.out.println("congratulations your hero speed will add Special Item");
        System.out.println("hit point add 21 %");
        System.out.println("============================================");
        System.out.println("============= AFTER SPECIAL DAMAGE =========");
        System.out.println("============================================");
        System.out.println("name   :Razor  ");
        System.out.println("type   :Agility");
        System.out.println(   "HP    :" + this.hitPoint + "%");
        System.out.println("Energi   :" + this.energiPlayer + "%");
        System.out.println("Speed    :" + this.speedHero + "%");
        System.out.println("=======================================");
        

    }

    @Override
    public void PrintDescHero(){
      try{

        PrintWriter output = new PrintWriter(new FileOutputStream("Razor.txt"));
        output.println("=======================================");
        output.println("============= DESC HERO  ==============");
        output.println("=======================================");
        output.println("name   :Razor  ");
        output.println("type   :Agility");
        output.println(   "HP    :" + this.hitPoint + "%");
        output.println("Energi   :" + this.energiPlayer + "%");
        output.println("Speed    :" + this.speedHero + "%");
        output.println("=======================================");
        output.close();
    }catch(FileNotFoundException e){
       e.printStackTrace();
    }
    }
}

