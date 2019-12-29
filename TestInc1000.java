/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testinc1000;

/**
 *
 * @author admin
 */
public class TestInc1000 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        
        Inc1000 i1 = new Inc1000();
        Inc1000 i2 = new Inc1000();
        i1.start();
        i2.start();
        i1.join();
        i2.join();
        System.out.println(Inc1000.count);
    }
    
}
