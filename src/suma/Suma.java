package suma;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class Suma {
    

       
     public static void main(String[]arg) {
         int d[]={1,2,3,4};
         int r = suma (d);
         System.out.println(r);
	}

    public static int suma (int [] vector){ 
        int r=0;
        for (int i=0; i<vector.length; i++);
        r += vector [1];
        return r;
    }

}
