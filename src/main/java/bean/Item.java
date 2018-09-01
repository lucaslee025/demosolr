package bean;

import org.apache.solr.client.solrj.beans.Field;

/**
 * @Author LucasLee
 * @Created 2018/9/1
 */
public class Item {
    @Field
    private Long id;

    @Field
    private String product_catalog_name;

    @Field("product_price")
    private double price;

    @Field("product_name")
    private String name;

    @Field("product_picture")
    private String picture;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProduct_catalog_name() {
        return product_catalog_name;
    }

    public void setProduct_catalog_name(String product_catalog_name) {
        this.product_catalog_name = product_catalog_name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", product_catalog_name='" + product_catalog_name + '\'' +
                ", price=" + price +
                ", name='" + name + '\'' +
                ", picture='" + picture + '\'' +
                '}';
    }
}
