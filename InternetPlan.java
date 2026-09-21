class InternetPlan {
    String planName;
    int data;
    int price;

    // Default constructor
    InternetPlan() {
        this("Basic", 10, 299);
    }

    // Constructor with plan name
    InternetPlan(String planName) {
        this(planName, 20, 399);
    }

    // Main constructor
    InternetPlan(String planName, int data, int price) {
        this.planName = planName;
        this.data = data;
        this.price = price;
    }

    void display() {
        System.out.println("Plan Name = " + planName);
        System.out.println("Data = " + data + " GB");
        System.out.println("Price = Rs." + price);
        System.out.println();
    }

    public static void main(String[] args) {
        InternetPlan p1 = new InternetPlan();
        InternetPlan p2 = new InternetPlan("Premium");
        InternetPlan p3 = new InternetPlan("Unlimited", 100, 999);

        p1.display();
        p2.display();
        p3.display();
    }
}
