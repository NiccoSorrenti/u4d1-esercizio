public class es1 {
    static void main() {

        int risultato = prodotto(2,3);
        System.out.println(risultato);

        concatena("Il numero è: ", 4);
    }

    static int prodotto(int num1, int num2) {
        int risultato = num1 * num2;

        return risultato;
    }

    static void concatena (String string, int num1){
        System.out.println(string + num1);
    }

    static void inserisciInArray(String[] array, String string){

    }


}
