package task5;

public class Task5 {
    public static void main(String[] args) {
        Item item1 = new Item("Laptop", 2.5, 15.0);
        Item item2 = new Item("Phone", 0.3, 5.0);

        Shipment shipment = new Shipment();
        shipment.setDeliveryMethod("Truck");
        shipment.addItem(item1);
        shipment.addItem(item2);

        Customer customer = new Customer("Kate", "Svobody 1");
        ReceivePoint receivePoint = new ReceivePoint("Doroshenka 21");
        DeparturePoint departurePoint = new DeparturePoint("Bandery 17");

        if (shipment.getDeliveryMethod().equals("BicycleCourier")) {
            System.out.println("Delivering by BicycleCourier to: " + receivePoint.getAddress());
        } else {
            System.out.println("Delivering by " + shipment.getDeliveryMethod() + " to: " + receivePoint.getAddress());
        }
    }
}
