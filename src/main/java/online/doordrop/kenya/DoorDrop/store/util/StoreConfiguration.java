package online.doordrop.kenya.DoorDrop.store.util;

import online.doordrop.kenya.DoorDrop.goods.dao.ItemRepository;
import online.doordrop.kenya.DoorDrop.goods.model.Item;
import online.doordrop.kenya.DoorDrop.store.models.Store;
import online.doordrop.kenya.DoorDrop.store.repository.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;



@Component
public class StoreConfiguration implements CommandLineRunner {

    @Autowired
    private StoreRepository storeRepository;

    @Override
    public void run(String... args) throws Exception {
        // Create some users

        Store store=Store.builder()
                .storeName("my store1")
                .storeUrl("www.store.com")
                .storeDeliveryCost(23)
                .build();


        // Save the users to the database
        storeRepository.save(store);

    }

}
