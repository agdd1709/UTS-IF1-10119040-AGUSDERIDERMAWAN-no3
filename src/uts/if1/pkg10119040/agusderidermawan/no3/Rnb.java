/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.if1.pkg10119040.agusderidermawan.no3;

/**
 *
 * @author User
 */
public class Rnb extends MusikGenre implements Blues, Jazz{
    
    @Override
    public void genreJazz(String artistName) {
        System.out.println("Jazz");
    }
    
    @Override
    public void genreBlues(String artistName) {
        System.out.println("Blues");
    }
}
