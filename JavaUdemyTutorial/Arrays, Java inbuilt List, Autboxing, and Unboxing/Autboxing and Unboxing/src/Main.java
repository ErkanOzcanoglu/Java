import java.util.ArrayList;

class Intclass{
    private int MyValue;

    public Intclass(int myValue) {
        MyValue = myValue;
    }

    public int getMyValue() {
        return MyValue;
    }

    public void setMyValue(int myValue) {
        MyValue = myValue;
    }
}
public class Main {
    public static void main(String[] args) {
        String[] strArray = new String[10];
        int [] intArray = new int[10];

        ArrayList<String> strArrayList = new ArrayList<String>();
        strArrayList.add("Tim");

//        ArrayList<Integer> intArrayList = new ArrayList<Integer>();

        ArrayList<Intclass> intClassArrayList = new ArrayList<Intclass>();
        intClassArrayList.add(new Intclass(54));
        Integer integer = new Integer(54);
        Double doubleValue = new Double(12.4);

        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        for(int i = 0; i < 10; i++){
            intArrayList.add(Integer.valueOf(i));
        }
        for(int i = 0; i < 10; i++){
            System.out.println(i + " --> " + intArrayList.get(i).intValue());
        }

        Integer myIntValue = 56;
        int myInt = myIntValue.intValue();

        ArrayList<Double> myDoubleValues = new ArrayList<Double>();
        for(double dbl=0.0; dbl<= 10.0; dbl+=0.5){
            myDoubleValues.add(dbl);
        }
        for(int i=0; i<myDoubleValues.size(); i++){
            double value = myDoubleValues.get(i).doubleValue();
            System.out.println(i + " --> " + value);
        }

    }
}
