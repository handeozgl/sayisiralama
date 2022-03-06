import java.util.Scanner;
public class Siralama {
    public static void main(String[] args) {
        int firstnum, secnum, thirdnum;
        Scanner input= new Scanner(System.in);
        System.out.println("ilk sayiyi giriniz:");
        firstnum= input.nextInt();
        System.out.println("ikinci sayiyi giriniz:");
        secnum= input.nextInt();
        System.out.println("ucuncu sayiyi giriniz:");
        thirdnum= input.nextInt();

        if ((firstnum> secnum)&& (firstnum>thirdnum)){
            if (secnum>thirdnum){
                System.out.println("firsnum> secnum> thirdnum");
            }else{
                System.out.println("firsnum> thirdnum> secnum");
            }
        }else if ((secnum>firstnum) && (secnum>thirdnum)){
            if (firstnum>thirdnum){
                System.out.println("secnum> firstnum> thirdnum");
            }else {
                System.out.println("secnum> thirdnum> firstnum");
            }
        }else{
            if (firstnum>secnum){
                System.out.println("thirdnum>firstnum>secnum");
            }else
                System.out.println("thirdnum>secnum>firstnum");
        }



    }
}
