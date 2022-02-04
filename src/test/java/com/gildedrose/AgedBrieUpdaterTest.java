package com.gildedrose;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class AgedBrieUpdaterTest {

    private final ItemUpdaterFactory itemUpdaterFactory = new ItemUpdaterFactory();

    @ParameterizedTest(name = "SellIn should decrease by 1 each day")
    @CsvSource({"2,1", "0,-1", "-2,-3"})
    void shouldDecreaseSellInByOne(int sellIn, int expected) {
        Item item = new Item("Aged Brie", sellIn, 1);

        Item updatedItem = itemUpdaterFactory.getInstance(item.name).update(item);

        assertEquals(expected, updatedItem.sellIn);
    }

    @ParameterizedTest(name = "Quality should increase by 1 before sellIn")
    @CsvSource({"3,4,5", "2,5,6", "1,6,7"})
    void shouldIncreaseQualityByOneOnOrBeforeSellInDate(int sellIn, int quality, int expected) {
        Item item = new Item("Aged Brie", sellIn, quality);

        Item updatedItem = itemUpdaterFactory.getInstance(item.name).update(item);

        assertEquals(expected, updatedItem.quality);
    }

    @ParameterizedTest(name = "Quality should increase by 2 after sellIn")
    @CsvSource({"0,4,6", "-1,6,8", "-2,8,10"})
    void shouldIncreaseQualityByTwoAfterSellInDate(int sellIn, int quality, int expected) {
        Item item = new Item("Aged Brie", sellIn, quality);

        Item updatedItem = itemUpdaterFactory.getInstance(item.name).update(item);

        assertEquals(expected, updatedItem.quality);
    }

    @ParameterizedTest(name = "Quality never exceeds 50")
    @CsvSource({"0,48,50", "-1,49,50", "-2,50,50"})
    void shouldNeverIncreaseQualityAbove50(int sellIn, int quality, int expected) {
        Item item = new Item("Aged Brie", sellIn, quality);

        Item updatedItem = itemUpdaterFactory.getInstance(item.name).update(item);

        assertEquals(expected, updatedItem.quality);
    }



}