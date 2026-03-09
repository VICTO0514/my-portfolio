package oopAssignment;

public class SmartPhone {
    private String brand;
    private String model;
    private int storageCapacity;

    public String getBrand() { return brand; }
    public String getModel() { return model; }
    public int getStorageCapacity() { return storageCapacity; }

    public void setBrand(String brand) { this.brand = brand; }
    public void setModel(String model) { this.model = model; }
    public void setStorageCapacity(int storageCapacity) { this.storageCapacity = storageCapacity; }

    public void increaseStorage(int value) {
        this.storageCapacity += value;
    }

    public static void main(String[] args) {
        SmartPhone phone = new SmartPhone();
        phone.setBrand("Samsung");
        phone.setModel("Galaxy S21 Ultra");
        phone.setStorageCapacity(256);

        System.out.println("Brand: "   + phone.getBrand());
        System.out.println("Model: "   + phone.getModel());
        System.out.println("Storage: " + phone.getStorageCapacity() + "GB");

        phone.increaseStorage(256);
        System.out.println("After increase: " + phone.getStorageCapacity() + "GB");
    }
}