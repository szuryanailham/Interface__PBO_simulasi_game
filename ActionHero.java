public abstract class  ActionHero {
    
    String Weppon ;

    void setWeapon(String Weapon){
        this.Weppon = Weapon;
    }

    String getWeapon(){
        return this.Weppon;
    }

    abstract void  descHero();
    abstract void  attack(float damage);
    abstract void defense(float damageEnemy);
    abstract void recall( );
    abstract void getWippon();
    abstract void PrintDescHero();
   

}
