/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ameer;

/**
 *
 * @author Alaa
 */
public class Bought {

    String id;
    String name;
    String type;
    String phoneNumber;
    String number;
    String price;
    String paid;
    String notes;
    String payingWay;
    String restOfMoney;
    String date;
    String totalPrice;

    public Bought(String name, String type, String phoneNumber, String number, String price, String paid, String notes, String payingWay, String date) {
        this.name = name;
        this.type = type;
        this.phoneNumber = phoneNumber;
        this.number = number;
        this.price = price;
        this.paid = paid;
        this.notes = notes;
        this.payingWay = payingWay;
        this.date = date;
    }

    public Bought() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPaid() {
        return paid;
    }

    public void setPaid(String paid) {
        this.paid = paid;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getPayingWay() {
        return payingWay;
    }

    public void setPayingWay(String payingWay) {
        this.payingWay = payingWay;
    }

    public String getRestOfMoney() {
        return restOfMoney;
    }

    public void setRestOfMoney(String restOfMoney) {
        this.restOfMoney = restOfMoney;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "Bought{" + "id=" + id + ", name=" + name + ", type=" + type + ", phoneNumber=" + phoneNumber + ", number=" + number + ", price=" + price + ", paid=" + paid + ", notes=" + notes + ", payingWay=" + payingWay + ", restOfMoney=" + restOfMoney + ", date=" + date + ", totalPrice=" + totalPrice + '}';
    }

  }
