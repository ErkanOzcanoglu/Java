public class Main {
    public static void main(String[] args) {
        int count = 1;
         while(count != 6){
             System.out.println("Count value is " + count);
             count++;
         }
        System.out.println("**********************************************************");
//         for(int i = 1; i < 7; i++){
//             System.out.println("Count value is " + i);
//         }
//    count = 1;
//    while(true){
//        if(count == 6){
//            break;
//        }
//        System.out.println("Count value is " + count);
//        count++;
//    }

        int number = 4;
        int firstNumber = 20;

        while(number <= firstNumber)
        {
            number++;
            if(!isEvenNumber(number))
            {
                continue;
            }
            System.out.println("Even number is " + number);
        }
    }
        public static boolean isEvenNumber(int number){
            if(number % 2 == 0){
                return true;
            }else {
            return false;
        }
    }

}
