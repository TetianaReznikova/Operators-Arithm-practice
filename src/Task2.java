public class Task2 {
    static float mornTemperature;
    static float noonTemperature;
    static float eveningTemperature;
    static float total;
    static double averTemperature;
    static int timeCount;
    private final static String MEASURE = "degree(s)";

    public static void main (String[] args) {
        timeCount++;
        mornTemperature = 14.5f;
        System.out.printf("%n1) morning temperature is %.1f %s.",
                mornTemperature, MEASURE);
        timeCount++;
        noonTemperature = 21.3f;
        System.out.printf("%n2) noon temperature is %.1f %s.",
                noonTemperature, MEASURE);
        timeCount++;
        eveningTemperature = 17.6f;
        System.out.printf("%n3) evening temperature is %.1f %s.",
                eveningTemperature, MEASURE);
        total = mornTemperature + noonTemperature + eveningTemperature;
        averTemperature = total / timeCount;

        System.out.printf("%nAverage day temperature is %.1f %s.",
                averTemperature, MEASURE);
    }
}
