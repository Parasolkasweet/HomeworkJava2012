public class main {

        public static void main(String[] args) {

            int temperature1 = 120;
            int temperature2 = 76;

            boolean isKolbWork = checkKolb(temperature1, temperature2);

            if (isKolbWork) {
                System.out.println("true.");
            } else {
                System.out.println("fals.");
            }
        }
        public static boolean checkKolb(int temperature1, int temperature2){
            return temperature1 > 100 && temperature2 < 100;
        }

        //Со второй задачей запуталась и не решила.
}


