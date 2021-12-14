package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConjuredItemUpdaterTest {

    @Test
    void conjuredItemShouldDecreaseSellInByOneEachDay() {
        Item item = new Item("Conjured Mana Cake", 10, 10);
        ConjuredItemUpdater updater = new ConjuredItemUpdater(item);

        updater.update();

        assertEquals(9, item.sellIn);
    }
}
