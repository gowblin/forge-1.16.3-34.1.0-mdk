package com.udemy.mccourse.item;

import com.udemy.mccourse.util.Registration;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;

public class ModItems
{
    public static final RegistryObject<Item> CHALCEDONY_INGOT =
            Registration.ITEMS.register("chalcedony_ingot",
            () -> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static void register() { }
}
