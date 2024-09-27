class Billing {
    private static  double TAX_RATE = 0.08;

    static double calculateTotalPrice(double unitPrice, int quantity, int couponDiscount) {
        double totalPriceBeforeDiscount = unitPrice * quantity;
        double totalPriceAfterDiscount = totalPriceBeforeDiscount - couponDiscount;
        return totalPriceAfterDiscount * (1 + TAX_RATE);
    }

    public static void main(String[] args) {
        double price1 = calculateTotalPrice(23.2, 1, 0);
        double price2 = calculateTotalPrice(24.4, 2, 0);
        double price3 = calculateTotalPrice(40.45, 2, 10);

        System.out.println("Total price for the first bill: $" + price1);
        System.out.println("Total price for the second bill: $" + price2);
        System.out.println("Total price for the third bill: $" + price3);
    }
}
