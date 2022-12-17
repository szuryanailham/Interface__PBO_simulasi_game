public class Zeus extends Hero implements IntelleganceHero{

    public Zeus(){
        this.hitPoint = 200;
        this.energiPlayer =200;
        this.speedHero = 60;
    }
    @Override
    public void descHero(){
        System.out.println("anda memilih Zeus sebagai hero anda");
        System.out.println("DESCRIPTION HERO : ");
        System.out.println("=======================================");
        System.out.println("name   : Zeus   ");
        System.out.println("type   :intellegance");
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
        System.out.println("name   : Zeus  ");
        System.out.println("type   :intellegance");
        System.out.println(   "HP    :" + this.hitPoint + "%");
        System.out.println("Energi   :" + this.energiPlayer + "%");
        System.out.println("Speed    :" + this.speedHero + "%");
        System.out.println("=======================================");
              }
        }
    }

    public void defense(float damageEnemy){
        this.hitPoint -= damageEnemy;
        if (this.hitPoint == min_hitPoint) {
            System.out.println("you have dead");
        }else{
         System.out.println("============= After defense ================");
        System.out.println("name   : Zeus  ");
        System.out.println("type   :intellegance");
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
    
                    System.out.println("============= After recall  ================");
                    System.out.println("name   : Zeus  ");
                    System.out.println("type   :intellegance");
                    System.out.println(   "HP    :" + this.hitPoint + "%");
                    System.out.println("Energi   :" + this.energiPlayer + "%");
                    System.out.println("Speed    :" + this.speedHero + "%");
                    System.out.println("===========================================");
    
        }
    
        public void getWippon(){
            
            System.out.println("you get specials wipon for your Hero");
            System.out.println("buff energy will add 3.2 %");
            System.out.println("buff energy will add 7.5 %");
    
            this.hitPoint += 3.2;
            this.energiPlayer+= 7.5;
    
            System.out.println("============= After get weapon ================");
            System.out.println("name   : Zeus  ");
            System.out.println("type   :intellegance");
            System.out.println(   "HP    :" + this.hitPoint + "%");
            System.out.println("Energi   :" + this.energiPlayer + "%");
            System.out.println("Speed    :" + this.speedHero + "%");
            System.out.println("===========================================");
    
    
        }

           
    public void heardofTeresque(){
        //  akan menambah hp 10 % dan speed 15
        double addHitPoint = 10 ;
        double addSpeed = 15;

        this.hitPoint+= addHitPoint;
        this.speedHero+=addSpeed;

        
        System.out.println("============= After use Heard of Teresque ================");
             //  akan menambah hp 10 % dan speed 15
             System.out.println("speed HP 10%  and Speed 15%");
             System.out.println();
        System.out.println("name   : Zeus  ");
        System.out.println("type   :intellegance");
        System.out.println(   "HP    :" + this.hitPoint + "%");
        System.out.println("Energi   :" + this.energiPlayer + "%");
        System.out.println("Speed    :" + this.speedHero + "%");
        System.out.println("==========================================================");


    }

    public  void CrimsonGuard(){
        //  akan menambah energy 15% dan speed 12%
        double addEnergy = 15 ;
        double addSpeed = 12;

        this.energiPlayer+=addEnergy;
        this.speedHero+=addSpeed;

        System.out.println("============= After use Crimson Guard ================");
         //  akan menambah energy 15% dan speed 12%
         System.out.println("add energy 15% ,and speed 12%");
         System.out.println();
        System.out.println("name   : Zeus  ");
        System.out.println("type   :intellegance");
        System.out.println(   "HP    :" + this.hitPoint  + "%");
        System.out.println("Energi   :" + this.energiPlayer + "%");
        System.out.println("Speed    :" + this.speedHero+"%");
        System.out.println("==========================================================");


    }
}
