import java.util.Arrays;

public class App0 {

    public static void main(String[] args) {
////        int[][] arr = {{10,20,30,40,50}, {10,20,30,40,50}};
//        int[] arr = {10, 20, 30, 40, 50};
////        for (int k=0; k < arr.length; k ++){
////            System.out.println("" +k + ":" + arr[k]);
//        System.out.println(arr);
////        System.out.println(Arrays.deepToString(arr));
//
//        String a = "One";
//        String b = "two";
//        String c = "three";
//
//        System.out.println(a + "\n\r" + b + "\n\r" + c);
//
//        for (int i = 0; i < 10; i++) {
//            int sum = 10;
//            sum = sum + i;
//        }
//
//        int n, d, q;
//        n = 10;
//        d = 0;
//
//        if (d != 0 && (n % d) == 0) //Укороченная операция предотвращает деnенне на нуnь
//            System.out.println(d + " является делителем " + n);
////        d = 0; // установить для d нулевое значение // Второй операнд не вычисляется, поскольку значение // переменной d равно нулю
////        if (d != 0 && (n % d) == 0) System.out.println(d + " является делителем " + n);
////        /* А теперь те же самые действия выполняются без использования укороченного логического оператора. В результате возникнет ошибка "деление на нуль". */
////        if (d != 0 & (n % d) == 0) //Теперь вычисnяются о6а выражения, в резуnьтате------ - чеrо будет производиться
////            //деnение на нуnь
////            System.out.println(d + " является делителем " + n);

        //найти все простые числя от 2 до 100
        int i;

        for (i=1; i<100; i++){
         boolean isPrime = true;

         for (int j =2; j<i; j++){
            if (i%j==0){
             isPrime=false;
             break;
            }}
            if(isPrime) System.out.println(i + " ");
        }


    }


}
