package online.doordrop.kenya.DoorDrop.goods.util;

import online.doordrop.kenya.DoorDrop.goods.dao.ItemTypesRepository;
import online.doordrop.kenya.DoorDrop.goods.model.ItemTypes;
import online.doordrop.kenya.DoorDrop.goods.util.data.ItemTypesExample;
import online.doordrop.kenya.DoorDrop.store.util.StoreCategoriesExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ItemsTypePopulator implements CommandLineRunner {

    @Autowired
    private ItemTypesRepository itemTypesRepository;
    @Override
    public void run(String... args) throws Exception {


    }
}
