package com.rentaltool.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Represents a Rental Agreement for a rented tool.
 */
public class RentalAgreement {

    private String toolCode;
    private String toolType;
    private String toolBrand;
    private int rentalDays;
    private LocalDate checkoutDate;
    private LocalDate dueDate;
    private double dailyRentalCharge;
    private int chargeDays;
    private double preDiscountCharge;
    private int discountPercent;
    private double discountAmount;
    private double finalCharge;

    /**
     * Constructs a new Rental Agreement.
     *
     * @param toolCode          the tool code
     * @param toolType          the tool type
     * @param toolBrand         the tool brand
     * @param rentalDays        the number of rental days
     * @param checkoutDate      the checkout date
     * @param dueDate           the due date
     * @param dailyRentalCharge the daily rental charge
     * @param chargeDays        the number of chargeable days
     * @param preDiscountCharge the pre-discount charge
     * @param discountPercent   the discount percent
     * @param discountAmount    the discount amount
     * @param finalCharge       the final charge
     */
    public RentalAgreement(String toolCode, String toolType, String toolBrand, int rentalDays, LocalDate checkoutDate,
                           LocalDate dueDate, double dailyRentalCharge, int chargeDays, double preDiscountCharge,
                           int discountPercent, double discountAmount, double finalCharge) {
        this.toolCode = toolCode;
        this.toolType = toolType;
        this.toolBrand = toolBrand;
        this.rentalDays = rentalDays;
        this.checkoutDate = checkoutDate;
        this.dueDate = dueDate;
        this.dailyRentalCharge = dailyRentalCharge;
        this.chargeDays = chargeDays;
        this.preDiscountCharge = preDiscountCharge;
        this.discountPercent = discountPercent;
        this.discountAmount = discountAmount;
        this.finalCharge = finalCharge;
    }

    public String getToolCode() {
        return toolCode;
    }

    public String getToolType() {
        return toolType;
    }

    public String getToolBrand() {
        return toolBrand;
    }

    public int getRentalDays() {
        return rentalDays;
    }

    public LocalDate getCheckoutDate() {
        return checkoutDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public double getDailyRentalCharge() {
        return dailyRentalCharge;
    }

    public int getChargeDays() {
        return chargeDays;
    }

    public double getPreDiscountCharge() {
        return preDiscountCharge;
    }

    public int getDiscountPercent() {
        return discountPercent;
    }

    public double getDiscountAmount() {
        return discountAmount;
    }

    public double getFinalCharge() {
        return finalCharge;
    }

    /**
     * Prints the rental agreement details to the console.
     */
    public void print() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yy");
        System.out.println("Tool code: " + toolCode);
        System.out.println("Tool type: " + toolType);
        System.out.println("Tool brand: " + toolBrand);
        System.out.println("Rental days: " + rentalDays);
        System.out.println("Checkout date: " + checkoutDate.format(formatter));
        System.out.println("Due date: " + dueDate.format(formatter));
        System.out.println("Daily rental charge: $" + String.format("%.2f", dailyRentalCharge));
        System.out.println("Charge days: " + chargeDays);
        System.out.println("Pre-discount charge: $" + String.format("%.2f", preDiscountCharge));
        System.out.println("Discount percent: " + discountPercent + "%");
        System.out.println("Discount amount: $" + String.format("%.2f", discountAmount));
        System.out.println("Final charge: $" + String.format("%.2f", finalCharge));
    }
}
