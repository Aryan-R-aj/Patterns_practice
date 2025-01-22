import java.security.spec.RSAOtherPrimeInfo;

public class pattern_no3 {
    public static void main(String args[]){
        for(int row =1; row <= 5; row ++){
            for(int col =1; col <= 5+1-row; col++){
                System.out.print("*" + "");
            }
            System.out.println("");
        }

    }
}
/*

* * * * *
* * * *
* * *
* *
*
            */