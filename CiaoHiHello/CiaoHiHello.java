/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package say;

/**
 *
 * @author admin
 */
public class CiaoHiHello {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Say s1 = new Say("ciao");
        Say s2 = new Say("Hi");
        Say s3 = new Say("Hello");
        s1.start();
        s2.start();
        s3.start();
    }

}
