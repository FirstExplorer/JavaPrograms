public class SpeedConverter {

    public static long toMilesperHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        }


        return Math.round(kilometersPerHour / 1.609);

    }
}
