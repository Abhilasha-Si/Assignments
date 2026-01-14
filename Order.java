class Order {
    protected int orderId;
    protected String orderDate;

    public Order(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    public String getOrderStatus() {
        return "Order placed.";
    }

    public void displayInfo() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Order Date: " + orderDate);
    }
}

class ShippedOrder extends Order {
    protected String trackingNumber;

    public ShippedOrder(int orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    public String getOrderStatus() {
        return "Order has been shipped. Tracking Number: " + trackingNumber;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Tracking Number: " + trackingNumber);
    }
}

class DeliveredOrder extends ShippedOrder {
    private String deliveryDate;

    public DeliveredOrder(int orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    public String getOrderStatus() {
        return "Order delivered on " + deliveryDate;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Delivery Date: " + deliveryDate);
    }
}

public class OrderManagement {
    public static void main(String[] args) {
        Order order = new Order(101, "2025-11-10");
        ShippedOrder shipped = new ShippedOrder(102, "2025-11-09", "TRK56789");
        DeliveredOrder delivered = new DeliveredOrder(103, "2025-11-08", "TRK12345", "2025-11-11");

        order.displayInfo();
        System.out.println(order.getOrderStatus());
        System.out.println("------------------------------");

        shipped.displayInfo();
        System.out.println(shipped.getOrderStatus());
        System.out.println("------------------------------");

        delivered.displayInfo();
        System.out.println(delivered.getOrderStatus());
    }
}
