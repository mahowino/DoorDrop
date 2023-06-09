package online.doordrop.kenya.DoorDrop.goods.dao;

import online.doordrop.kenya.DoorDrop.goods.model.Item;
import online.doordrop.kenya.DoorDrop.store.models.Store;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {

    @Query("SELECT g FROM Item g  WHERE g.storeId = :storeId")
    Optional<List<Item>> getItemsByStore(@Param("storeId") Long storeId);

    @Query("SELECT s FROM Item g WHERE g.categoryId = :categoryId")
    Optional<List<Item>> getItemsByCategory(@Param("categoryId")long categoryId);

    @Query("SELECT g FROM Item g  WHERE g.id = :id")
    Optional<Item> getItemById(@Param("id") Long id);
}
