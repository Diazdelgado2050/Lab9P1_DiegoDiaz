/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab9p1_diegodiaz;

/**
 *
 * @author diego
 */
public class Savefile {

    int lives;
    boolean success;
    String[] bosses;
    int[] beaten;

    public Savefile(int lives, boolean success, String[] bosses, int[] beaten) {

        this.lives = lives;
        this.success = success;
        this.bosses = bosses;
        this.beaten = beaten;
    }
    
    // getters
    public int getLives() {
        return this.lives;
    }

    public boolean getSuccess() {
        return this.success;
    }

    public String[] getBosses() {
        return this.bosses;
    }

    public int[] getBeaten() {
        return this.beaten;
    }
// setter
    public void setLives(int lives) {
        this.lives = lives;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public void setBosses(String[] bosses) {
        this.bosses = bosses;
    }

    public void setBeaten(int[] beaten) {
        this.beaten = beaten;
    }
}
