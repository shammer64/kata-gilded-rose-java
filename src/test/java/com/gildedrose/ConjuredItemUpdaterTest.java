package com.gildedrose;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConjuredItemUpdaterTest {

    @ParameterizedTest(name = "SellIn should decrease by 1 each day")
    @CsvSource({"10,10,9", "9,9,8", "8,8,7"})
    void shouldDecreaseSellInByOneEachDay(int sellIn, int quality, int expected) {
        Item item = new Item("Conjured Mana Cake", sellIn, quality);

        Item updatedItem = ItemUpdater.update(item);

        assertEquals(expected, updatedItem.sellIn);
    }

    @ParameterizedTest(name = "Quality should decrease by 2 each day")
    @CsvSource({"10,10,8", "9,8,6", "8,6,4"})
    void shouldDecreaseQualityByTwoEachDay(int sellIn, int quality, int expected) {
        Item item = new Item("Conjured Mana Cake", sellIn, quality);

        Item updatedItem = ItemUpdater.update(item);

        assertEquals(expected, updatedItem.quality);
    }

    @ParameterizedTest(name = "Quality should not decrease below 0")
    @CsvSource({"10,1,0", "9,0,0"})
    void shouldNotDecreaseQualityBelowZero(int sellIn, int quality, int expected) {
        Item item = new Item("Conjured Mana Cake", sellIn, quality);

        Item updatedItem = ItemUpdater.update(item);

        assertEquals(expected, updatedItem.quality);
    }

}
