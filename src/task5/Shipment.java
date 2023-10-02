package task5;

class Shipment {
    private Item[] items;
    private String deliveryMethod;
    private double maxWeightLimit;
    private double maxSizeLimit;
    private int itemCount;

    public Shipment() {
        items = new Item[10];
        itemCount = 0;
    }

    public void setDeliveryMethod(String deliveryMethod) {
        this.deliveryMethod = deliveryMethod;
        if (deliveryMethod.equals("Truck")) {
            maxWeightLimit = 20.0;
            maxSizeLimit = 30.0;
        } else if (deliveryMethod.equals("Train")) {
            maxWeightLimit = 30.0;
            maxSizeLimit = 40.0;
        } else if (deliveryMethod.equals("Bus")) {
            maxWeightLimit = 15.0;
            maxSizeLimit = 25.0;
        } else if (deliveryMethod.equals("BicycleCourier")) {
            maxWeightLimit = 5.0;
            maxSizeLimit = 10.0;
        }
    }

    public void addItem(Item item) {
        if (itemCount < items.length) {
            items[itemCount] = item;
            itemCount++;
        } else {
            System.out.println("Shipment is full, cannot add more items.");
        }
    }

    public void removeItem(int index) {
        if (index >= 0 && index < itemCount) {
            for (int i = index; i < itemCount - 1; i++) {
                items[i] = items[i + 1];
            }
            items[itemCount - 1] = null;
            itemCount--;
        } else {
            System.out.println("Invalid item index.");
        }
    }

    public String getDeliveryMethod() {
        return deliveryMethod;
    }
}
