public class pattern_no1 {
    public static void main(String[] args){
        int row = 4;
        for(row =1; row <= 4; row++){
            for(int col =1; col <= row; col++){
                System.out.print("*" + " ");
            }
            System.out.println("");
        }
    }
}
/*pattern Output
*
* *
* * *
*  * * *


 */