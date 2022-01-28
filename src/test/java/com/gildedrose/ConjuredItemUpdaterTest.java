package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConjuredItemUpdaterTest {

    @Test
    void conjuredItemShouldDecreaseSellInByOneEachDay() {
        Item item = new Item("Conjured Mana Cake", 10, 10);
        ItemUpdater itemUpdater = ItemUpdater.getInstance(item);

        itemUpdater.update();

        assertEquals(9, item.sellIn);
    }

    @Test
    void conjuredItemShouldDecreaseQualityByTwoEachDay() {
        Item item = new Item("Conjured Mana Cake", 10, 10);
        ItemUpdater itemUpdater = ItemUpdater.getInstance(item);

        itemUpdater.update();

        assertEquals(8, item.quality);
    }


}
