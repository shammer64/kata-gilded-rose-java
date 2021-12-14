package com.gildedrose;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

public abstract class ItemUpdater {
    final Item item;
    private static final Map<String, Class> CLASS_MAP = new HashMap<>();

    static {
        CLASS_MAP.put("Aged Brie", AgedBrieUpdater.class);
        CLASS_MAP.put("Backstage passes to a TAFKAL80ETC concert", BackstagePassUpdater.class);
        CLASS_MAP.put("Sulfuras, Hand of Ragnaros", SulfurasUpdater.class);
    }

    public ItemUpdater(Item item) {
        this.item = item;
    }

    public static ItemUpdater getInstance(Item item) {
        ItemUpdater itemUpdater = null;
        try {
            Class updaterClass = CLASS_MAP.getOrDefault(item.name, CommonItemUpdater.class);
            itemUpdater = (ItemUpdater) updaterClass.getDeclaredConstructor(Item.class).newInstance(item);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return itemUpdater;
    }

    public abstract ItemUpdater update();
}
