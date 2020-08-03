public class SpeedOfLight {
    public static void main(String[] args) {
        int speed = 299792458;
        int second;
        int distance;

        second = 24 * 60 * 60;
        distance = second * speed;

        System.out.println(distance);   // incorrect answer (overflow)

        long speed2 = 299792458;
        long second2 = 24 * 60 * 60;
        long distance2;

        distance2 = second2 * speed2;

        System.out.println(distance2);  // correct
        int f = 1 + 1;
    }
}
