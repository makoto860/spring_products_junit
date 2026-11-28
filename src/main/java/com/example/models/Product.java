package com.example.models;

import java.time.LocalDateTime;

public class Product {
	private Long id;
    private String name;
    private int price;
    private LocalDateTime reservation_date;
    private String caption;

	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    public LocalDateTime getReservationDate() {
        return reservation_date;
    }

    public void setReservationDate(LocalDateTime reservation_date) {
        this.reservation_date = reservation_date;
    }
    
    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }
}
