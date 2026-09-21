class Time {
    int seconds;

    // Constructor for seconds
    Time(int s) {
        seconds = s;
        System.out.println("Time in seconds = " + seconds);
    }

    // Constructor for minutes
    Time(int m, int s) {
        seconds = m * 60 + s;
        System.out.println("Time in minutes = " + m + " minutes " + s + " seconds");
    }

    // Constructor for hours
    Time(int h, int m, int s) {
        seconds = h * 3600 + m * 60 + s;
        System.out.println("Time in hours = " + h + " hours " + m + " minutes " + s + " seconds");
    }

    public static void main(String[] args) {
        Time t1 = new Time(30);
        Time t2 = new Time(5, 30);
        Time t3 = new Time(2, 15, 20);
    }
}
