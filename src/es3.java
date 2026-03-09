public class es3 {
    static void main() {
        perimetroRettangolo(2, 3);

        System.out.println(pariDispari(8));
        System.out.println(pariDispari(5));
    }

    static void perimetroRettangolo(int lato1, int lato2){
        System.out.println((lato1 + lato2) * 2);
    }

    static int pariDispari(int num){
        return num % 2;
    }

//    static double perimetroTriangolo(double lato1, double lato2, double lato3){
//        return;
//    }
}
