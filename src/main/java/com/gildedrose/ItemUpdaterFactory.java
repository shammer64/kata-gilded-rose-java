package com.gildedrose;

import java.util.HashMap;
import java.util.Map;

public class ItemUpdaterFactory {

    private static final Map<String, ItemUpdater> INSTANCE_MAP = new HashMap<>();
    private static final ItemUpdater DEFAULT_INSTANCE = new CommonItemUpdater();

    static {
        INSTANCE_MAP.put("Aged Brie", new AgedBrieItemUpdater());
        INSTANCE_MAP.put("Backstage passes to a TAFKAL80ETC concert", new BackstagePassItemUpdater());
        INSTANCE_MAP.put("Sulfuras, Hand of Ragnaros", new SulfurasItemUpdater());
        INSTANCE_MAP.put("Conjured Mana Cake", new ConjuredItemUpdater());
    }

    public ItemUpdater getInstance(String itemName) {
        return INSTANCE_MAP.getOrDefault(itemName, DEFAULT_INSTANCE);
    }
}
