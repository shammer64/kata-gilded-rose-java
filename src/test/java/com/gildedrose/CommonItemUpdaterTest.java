package com.gildedrose;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CommonItemUpdaterTest {

    private final ItemUpdaterFactory itemUpdaterFactory = new ItemUpdaterFactory();

    @ParameterizedTest(name = "SellIn should decrease by 1")
    @CsvSource({"1,10,0", "0,10,-1", "-1,10,-2"})
    void shouldDecreaseSellInByOne(int sellIn, int quality, int expected) {
        Item item = new Item("Common Item", sellIn, quality);

        Item updatedItem = itemUpdaterFactory.getInstance(item.name).update(item);

        assertEquals(expected, updatedItem.sellIn);
    }

    @ParameterizedTest(name = "Quality should decrease by 1")
    @CsvSource({"3,10,9", "2,9,8", "1,8,7"})
    void shouldDecreaseQualityByOneBeforeSellInDate(int sellIn, int quality, int expected) {
        Item item = new Item("Common Item", sellIn, quality);

        Item updatedItem = itemUpdaterFactory.getInstance(item.name).update(item);

        assertEquals(expected, updatedItem.quality);
    }

    @ParameterizedTest(name = "Quality should never decrease below 0")
    @CsvSource({"3,0,0", "0,0,0", "-1,1,0"})
    void shouldNotDecreaseQualityBelowZero(int sellIn, int quality, int expected) {
        Item item = new Item("Common Item", sellIn, quality);

        Item updatedItem = itemUpdaterFactory.getInstance(item.name).update(item);

        assertEquals(expected, updatedItem.quality);
    }

}
