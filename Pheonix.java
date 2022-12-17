public class Pheonix extends Hero {
    
    public Pheonix(){
        this.hitPoint = 200;
        this.energiPlayer =200;
        this.speedHero = 75.4;
    }
    @Override
    public void descHero(){
        System.out.println("anda memilih Pheonix sebagai hero anda");
        System.out.println("DESCRIPTION HERO : ");
        System.out.println("=======================================");
        System.out.println("name   :Pheonix  ");
        System.out.println("type   : strength");
        System.out.println(   "HP    :" + this.energiPlayer + "%");
        System.out.println("Energi   :" + this.energiPlayer + "%");
        System.out.println("Speed    :" + this.speedHero + "%");
        System.out.println("=======================================");
       
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
         System.out.println("============= After attact ================");
        System.out.println("name   : Pheonix   ");
        System.out.println("type   : strength");
        System.out.println(   "HP    :" + this.hitPoint + "%");
        System.out.println("Energi   :" + this.energiPlayer + "%");
        System.out.println("Speed    :" + this.speedHero + "%");
        System.out.println("=======================================");
              }
        }
    }
    @Override
    public void defense(float damageEnemy){
        this.hitPoint -= damageEnemy;
        if (this.hitPoint == min_hitPoint) {
            System.out.println("you have dead");
        }else{
         System.out.println("============= After defense ================");
        System.out.println("name   :Pheonix  ");
        System.out.println("type   : strength");
        System.out.println(   "HP    :" + this.hitPoint + "%");
        System.out.println("Energi   :" + this.energiPlayer + "%");
        System.out.println("Speed    :" + this.speedHero + "%");
        System.out.println("=======================================");
              
        }
        }

        @Override
        public void recall(){
            // jika hero me recall 7 detik ++ 15% of hp and ++10 % of energy
          
               
                    this.hitPoint+=7.5;
                    this.energiPlayer+=5;
    
                    System.out.println(" anda melakukan recall hero");
                    System.out.println(" hero mendapat buff hp 7,5% dan energi  5 %");
    
                    System.out.println("============= After recall  ================");
                    System.out.println("name   :Pheonix  ");
                    System.out.println("type   : strength");
                    System.out.println(   "HP    :" + this.hitPoint + "%");
                    System.out.println("Energi   :" + this.energiPlayer + "%");
                    System.out.println("Speed    :" + this.speedHero + "%");
                    System.out.println("===========================================");
    
        }
        @Override
        public void getWippon(){
            
            System.out.println("you get specials wipon for your Hero");
            System.out.println("buff energy will add 3.2 %");
            System.out.println("buff energy will add 7.5 %");
    
            this.hitPoint += 3.2;
            this.energiPlayer+= 7.5;
    
            System.out.println("============= After get weapon ================");
            System.out.println("name   :Pheonix ");
            System.out.println("type   : strength");
            System.out.println(   "HP    :" + this.hitPoint + "%");
            System.out.println("Energi   :" + this.energiPlayer + "%");
            System.out.println("Speed    :" + this.speedHero + "%");
            System.out.println("===========================================");
    
    
        }




}
