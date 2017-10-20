public class Prm {

    public static void main(String[] args) {

        for (int i = 2; i <= 10000; i++){

            boolean c = true;
            for(int j = 2; j<i; j++){

                if (i%j ==0)
                    c = false;
            }
            if (c == true)
                System.out.println(i);
            if((i%1000)==0)
                System.out.println(i+" *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        }

    }
}