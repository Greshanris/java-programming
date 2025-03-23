public class JavaMethodOverloading {
    // let's make a method
    public static int calcArea(int a, int b){
        int area = a + b;
        return area;
    }

    // we can even put String... strArr in parameter for array, or String[] args for an array

    // this method overloading, using same name as method with difference in parameter and calculation
    // we need to make some differences from initial method while doing method overloading
    public static int calcArea(int a, int b,int c){
        int area = a + b + c;
        return area;
    }

    // for instance, if we need to pass different data types such as float or String instead of int
    // we can use method overloading
    // Here, we changed parameter number
    public static double calcArea(double a){
        double area = a + a;
        return area;
    }

    public static void main(String[] args) {
        int result = calcArea(4, 5);
        int result1 = calcArea(4, 5, 8);
        double result2 = calcArea(5d);
        System.out.println("Area: " + result + " result1: " + result1 + " result2: " + result2);
    }
}
