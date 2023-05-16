package com.booleanuk.core;

import com.booleanuk.core.models.Item;
import com.booleanuk.core.models.Receipt;
import org.junit.jupiter.api.Test;

public class ReceiptTest {
    Inventory inventory = new Inventory();
    @Test
    public void printReceiptTest() {
        Basket basket = new Basket();
        basket.setCapacity(100);
        Item bagel = inventory.bagels.get(0);
        basket.add(bagel, 6);


        Receipt receipt = new Receipt(basket);
        receipt.printReceipt();
    }
}