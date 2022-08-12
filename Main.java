/**
 * Main
 */

public class Main {

    public static void main(String[] args) {
        int[] list = {3,2,5,6,4};
        double ort = 0;
        double toplam ;
        for (int i: list){
            ort += 1d / i;
            
        }
        toplam = list.length / ort;
        System.out.println(toplam);

    }
}