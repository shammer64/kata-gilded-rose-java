package com.gildedrose;

import java.util.HashMap;
import java.util.Map;

public abstract class ItemUpdater {
    protected Item item = null;
    private static final Map<String, Class> CLASS_MAP = new HashMap<>();

    static {
        CLASS_MAP.put("Aged Brie", AgedBrieUpdater.class);
        CLASS_MAP.put("Backstage passes to a TAFKAL80ETC concert", BackstagePassUpdater.class);
        CLASS_MAP.put("Sulfuras, Hand of Ragnaros", SulfurasUpdater.class);
        CLASS_MAP.put("Conjured Mana Cake", ConjuredItemUpdater.class);
    }

    public ItemUpdater(Item item) {
        super();
        this.item = item;
    }

    public ItemUpdater() {
        super();
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

    public static ItemUpdater getInstance(String itemName) {
        ItemUpdater itemUpdater = null;
        try {
            Class updaterClass = CLASS_MAP.getOrDefault(itemName, CommonItemUpdater.class);
            itemUpdater = (ItemUpdater) updaterClass.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return itemUpdater;
    }

    public abstract Item update();

//    public abstract Item update(Item item);
}
