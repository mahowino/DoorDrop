package online.doordrop.kenya.DoorDrop.goods.util.data;

import online.doordrop.kenya.DoorDrop.goods.dao.ItemRepository;
import online.doordrop.kenya.DoorDrop.goods.dao.ItemTypesRepository;
import online.doordrop.kenya.DoorDrop.goods.dao.SubItemsRepository;
import online.doordrop.kenya.DoorDrop.goods.model.Item;
import online.doordrop.kenya.DoorDrop.goods.model.ItemTypes;
import online.doordrop.kenya.DoorDrop.goods.model.SubItems;
import online.doordrop.kenya.DoorDrop.store.models.Store;
import online.doordrop.kenya.DoorDrop.store.models.StoreCategory;
import online.doordrop.kenya.DoorDrop.store.repository.StoreCategoryRepository;
import online.doordrop.kenya.DoorDrop.store.repository.StoreRepository;
import online.doordrop.kenya.DoorDrop.store.util.StoreCategoriesExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
public class ItemsStarterData implements CommandLineRunner {

    @Autowired
    private ItemRepository itemRepository;
    @Autowired
    private ItemTypesRepository itemTypesRepository;
    @Autowired
    private StoreCategoryRepository repository;
    @Autowired
    private StoreRepository storeRepository;

    @Autowired
    private SubItemsRepository subItemsRepository;
    @Override
    public void run(String... args) throws Exception {

        //add store categories

        int categoryNo= StoreCategoriesExample.values().length;
        for (int x=0;x<categoryNo;x++){
            repository.save(StoreCategory.builder()
                    .storeCategoryId(x)
                    .storeCategoryName(StoreCategoriesExample.values()[x].toString())
                    .build());
        }


        //add stores
       List<Store> stores=getStores();
        for (Store store : stores) {
            storeRepository.save(store);
        }


        //add item types
        int itemTypeNo= ItemTypesExample.values().length;
        for (int x=0;x<itemTypeNo;x++){
            itemTypesRepository.save(ItemTypes.builder()
                    .name(ItemTypesExample.values()[x].name())
                    .build());
        }

        List<Item> items=getItems();
        for (int x=0;x<items.size();x++){
            List<SubItems> subItems= getSubItems(x);
            for (SubItems subItem : subItems) {
                subItemsRepository
                        .save(subItem);
            }
        }
        //add Sub-items



        //add items

        List<SubItems> items=new ArrayList<>();
        items.add(
                SubItems.builder().subItemID(1).build()
        );
        Item item=Item.builder()
                .itemId(1)
                .itemName("trial")
                .itemImage("www.kuja.com")
                .store(Store.builder().storeId(1).build())
                .subItems(items)
                .build();
        itemRepository.save(item);

    }

    private List<Store> getStores()
    {
        List<Store> stores=new ArrayList<>();

        /*
        *   0.ALCOHOL,
            1.FOOD,
            2.GROCERIES,
            3.OTHER
         */

        stores.add(
                Store
                        .builder()
                        .storeId()
                        .storeUrl()
                        .storeName()
                        .storeDeliveryCost()
                        .category()
                        .build()
                );

        return stores;
    }

    private List<SubItems> getSubItems(int x)
    {
        List<SubItems> subItems=new ArrayList<>();
        switch (x){

            case 1:

                subItems.add(
                        SubItems
                                .builder()
                                .subItemID()
                                .name()
                                .itemPrice()
                                .description()
                                .build()
                );

                return subItems;
                break;
            case 2:
                subItems.add(
                        SubItems
                                .builder()
                                .subItemID()
                                .name()
                                .itemPrice()
                                .description()
                                .build()
                );

                return subItems;
                break;
            case 3:
                subItems.add(
                        SubItems
                                .builder()
                                .subItemID()
                                .name()
                                .itemPrice()
                                .description()
                                .build()
                );

                return subItems;
                break;
            case 4:
                subItems.add(
                        SubItems
                                .builder()
                                .subItemID()
                                .name()
                                .itemPrice()
                                .description()
                                .build()
                );

                return subItems;
                break;
            case 5:
                subItems.add(
                        SubItems
                                .builder()
                                .subItemID()
                                .name()
                                .itemPrice()
                                .description()
                                .build()
                );

                break;
            case 6:
                subItems.add(
                        SubItems
                                .builder()
                                .subItemID()
                                .name()
                                .itemPrice()
                                .description()
                                .build()
                );
                break;
            case 7:
                subItems.add(
                        SubItems
                                .builder()
                                .subItemID()
                                .name()
                                .itemPrice()
                                .description()
                                .build()
                );
                break;
            case 8:
                subItems.add(
                        SubItems
                                .builder()
                                .subItemID()
                                .name()
                                .itemPrice()
                                .description()
                                .build()
                );
                break;
        }
      return subItems;
    }
    private List<Item> getItems()
    {
        List<Item> items=new ArrayList<>();

        items.add(
                Item.builder()
                        .itemName()
                        .itemImage()
                        .store()
                        .subItems()
                        .build()
        );

        return items;
    }



}
