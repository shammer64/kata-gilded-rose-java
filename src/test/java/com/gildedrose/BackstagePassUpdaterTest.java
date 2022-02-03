package com.gildedrose;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class BackstagePassUpdaterTest {

    @ParameterizedTest(name = "SellIn should decrease by 1")
    @CsvSource({"2,1", "0,-1", "-2,-3"})
    void shouldDecreaseSellInByOne(int sellIn, int expected) {
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", sellIn, 10);

        Item updatedItem = ItemUpdater.getInstance(item).update(item);

        assertEquals(expected, updatedItem.sellIn);
    }

    @ParameterizedTest(name = "Quality should increase by 1 up to 10 days prior to sellIn")
    @CsvSource({"13,4,5", "12,5,6", "11,6,7"})
    void shouldIncreaseQualityByOneUpTo10DaysBeforeSellInDate(int sellIn, int quality, int expected) {
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", sellIn, quality);

        Item updatedItem = ItemUpdater.getInstance(item).update(item);

        assertEquals(expected, updatedItem.quality);
    }

    @ParameterizedTest(name = "Quality should increase by 2 up to 5 days prior to sellIn")
    @CsvSource({"10,4,6", "7,12,14", "6,14,16"})
    void shouldIncreaseQualityByTwoUpTo5DaysBeforeSellInDate(int sellIn, int quality, int expected) {
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", sellIn, quality);

        Item updatedItem = ItemUpdater.getInstance(item).update(item);

        assertEquals(expected, updatedItem.quality);
    }

    @ParameterizedTest(name = "Quality should increase by 3 in last 5 days prior to sellIn")
    @CsvSource({"5,16,19", "2,25,28", "1,28,31"})
    void shouldIncreaseQualityByThreeUpToSellInDate(int sellIn, int quality, int expected) {
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", sellIn, quality);

        Item updatedItem = ItemUpdater.getInstance(item).update(item);

        assertEquals(expected, updatedItem.quality);
    }

    @ParameterizedTest(name = "Quality should never exceed 50")
    @CsvSource({"11,50,50", "6,49,50", "1,48,50"})
    void shouldNotIncreaseQualityAboveFifty(int sellIn, int quality, int expected) {
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", sellIn, quality);

        Item updatedItem = ItemUpdater.getInstance(item).update(item);

        assertEquals(expected, updatedItem.quality);
    }

    @ParameterizedTest(name = "Quality should drop to 0 after concert")
    @CsvSource({"0,10", "-1,10", "-10,10"})
    void shouldBDecreaseQualityToZeroAfterConcert(int sellIn, int quality) {
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", sellIn, quality);

        Item updatedItem = ItemUpdater.getInstance(item).update(item);

        assertEquals(0, updatedItem.quality);
    }



}