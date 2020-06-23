package com.projectstarscream;

public class RegisterCalculator {
    private final int productPrice;
    private int customerPaid;

    private final int quarter = 25;
    private final int dime = 10;
    private final int nickel = 5;
    private final int penny = 1;

    public RegisterCalculator(int productPrice, int customerPaid) {
        this.productPrice = productPrice;
        this.customerPaid = customerPaid;
    }

    void changeBack() {
        //TODO format output
        int change = customerPaid - productPrice;
        int getQuarters = change / quarter;
        int getDimes = (change % quarter) / dime;
        int getNickels = (change % dime) / nickel;
        int getPennies = (change % nickel) / penny;

        System.out.println(getQuarters);
        System.out.println(getDimes);
        System.out.println(getNickels);
        System.out.println(getPennies);
    }



}
