package online.doordrop.kenya.DoorDrop.store.util;

import online.doordrop.kenya.DoorDrop.goods.dao.ItemRepository;
import online.doordrop.kenya.DoorDrop.goods.model.Item;
import online.doordrop.kenya.DoorDrop.store.models.Store;
import online.doordrop.kenya.DoorDrop.store.models.StoreCategory;
import online.doordrop.kenya.DoorDrop.store.repository.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;



@Component
public class StoreConfiguration implements CommandLineRunner {

    //declare all the stores to put in the postgres db


    @Override
    public void run(String... args) throws Exception {


    }

}
