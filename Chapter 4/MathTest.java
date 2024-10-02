public class MathTest {
    public static void main(String[] args) {
        double number = 37;
        int minNum = 68;
        int maxNum = 71;
        
        System.out.println("\n\n\tSQRT: " + Math.sqrt(number));
        System.out.println("\tSIN: " + Math.sin(300));
        System.out.println("\tCOS: " + Math.cos(300));
        System.out.println("\tFLOOR: " + Math.floor(22.7));
        System.out.println("\tCEIL: " + Math.ceil(22.3));
        System.out.println("\tROUND: " + Math.round(22.5));
        System.out.println("\tMAX: " + Math.max(minNum, maxNum));
        System.out.println("\tMIN: " + Math.min(minNum, maxNum));
        System.out.println("\tRANDOM: " + (Math.random() * 1000000));
    }
}
