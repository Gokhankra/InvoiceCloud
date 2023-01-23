import java.util.Arrays;
import java.util.Collections;

public class testing {
    public static void main(String[] args) {

//        You have two input strings A ={1,2,3,6}​​, B = {3,8,9}​​,
//
//        write a program which can output String C = {​​3}​​ , common between these two strings.


        //

        int [] a={1,2,3,6,3};
        int [] b={3,8,9};


        for (int i = 0; i <a.length ; i++) {


            for (int j = 0; j <b.length ; j++) {

                if (a[i]==b[j]){

                    if(Collections.frequency(a,a[i])==1  )
                    System.out.println("common integer values in both array" +"   "+a[i]);
                }

            }
        }

    }
}
