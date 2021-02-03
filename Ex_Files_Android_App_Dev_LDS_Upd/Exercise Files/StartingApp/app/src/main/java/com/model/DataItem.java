package com.model;

public class DataItem {
    private String itemId;
    private String itemName;
    private String category;
    private String description;
    private String image;
    private int sortPosition;
    private double price;

    public DataItem(String itemId, String itemName, String category, String description,  String image, int sortPosition, double price) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.category = category;
        this.description = description;
        this.image = image;
        this.sortPosition = sortPosition;
        this.price = price;
    }

    public DataItem(String itemId, String quinoa_salmon_salad, String salads, String description, int i, int sortPosition, String s) {
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getSortPosition() {
        return sortPosition;
    }

    public void setSortPosition(int sortPosition) {
        this.sortPosition = sortPosition;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "DataItem{" +
                "itemId='" + itemId + '\'' +
                ", itemName='" + itemName + '\'' +
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                ", image='" + image + '\'' +
                ", sortPosition=" + sortPosition +
                ", price=" + price +
                '}';
    }
}
