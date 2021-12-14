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
    }

    public ItemUpdater(Item item) {
        this.item = item;
    }

    public static ItemUpdater getInstance(Item item) {
        ItemUpdater itemUpdater = null;
        try {
            switch (item.name) {
                case "Aged Brie":
                    itemUpdater = (ItemUpdater) CLASS_MAP.get(item.name).getDeclaredConstructor(Item.class).newInstance(item);
                    break;
                case "Backstage passes to a TAFKAL80ETC concert":
                    itemUpdater = (ItemUpdater) CLASS_MAP.get(item.name).getDeclaredConstructor(Item.class).newInstance(item);
                    break;
                case "Sulfuras, Hand of Ragnaros":
                    itemUpdater = new SulfurasUpdater(item);
                    break;
                default:
                    itemUpdater = new CommonItemUpdater(item);
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return itemUpdater;
    }

    public abstract void update();
}
