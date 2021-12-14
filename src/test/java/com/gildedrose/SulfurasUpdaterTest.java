package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SulfurasUpdaterTest {

    @Test
    void sulfurasNeverDecreaseSellInDate() {
        Item item = new Item("Sulfuras", 10, 10);
        ItemUpdater itemUpdater = new SulfurasUpdater(item);

        itemUpdater.update();

        assertEquals(10, item.sellIn);
    }

    @Test
    void sulfurasQualityIsAlways80() {
        Item item = new Item("Sulfuras", 10, 10);
        ItemUpdater itemUpdater = new SulfurasUpdater(item);

        itemUpdater.update();

        assertEquals(80, item.quality);
    }

}