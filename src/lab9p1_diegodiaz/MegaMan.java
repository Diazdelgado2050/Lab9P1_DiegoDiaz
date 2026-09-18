/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab9p1_diegodiaz;

/**
 *
 * @author diego
 */
public class MegaMan {
    
    double baseStrength;
    double baseHp;
    int healthUpgrade;
    int strengthUpgrade;
    
    
    public MegaMan(double baseStrenght, double baseHp, int healthUpgrade,int strenghtUpgrade){
        
        this.baseStrength = baseStrenght;
        this.baseHp = baseHp;
        this.strengthUpgrade = strenghtUpgrade;
        this.healthUpgrade = healthUpgrade;
 
    }
    public double Gbase(){
        return this.baseHp;
    }
    public double GStrenght(){
        return this.baseStrength;
    }
    public int Ghealth(){
        return this.healthUpgrade;
    }
    public int GstrenghtUp(){
        return this.strengthUpgrade;
    }

    public void sHealth(int healthUpgrade){
        this.healthUpgrade = healthUpgrade;
        
    }
    public void sStrenghtUp(int strenghtUpgrade){
        this.strengthUpgrade = strenghtUpgrade;
    }
}
