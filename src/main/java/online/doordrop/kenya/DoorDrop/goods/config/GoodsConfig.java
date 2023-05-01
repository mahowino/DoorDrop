package online.doordrop.kenya.DoorDrop.goods.config;

import online.doordrop.kenya.DoorDrop.goods.dtoMapper.ItemTypesDTOMapper;
import online.doordrop.kenya.DoorDrop.goods.dtoMapper.ItemsDTOMapper;
import online.doordrop.kenya.DoorDrop.goods.dtoMapper.SubItemsDTOMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GoodsConfig {

    @Bean
    public ItemsDTOMapper itemsDTOMapper() {
        return new ItemsDTOMapper();
    }
    @Bean
    public ItemTypesDTOMapper itemTypesDTOMapper() {
        return new ItemTypesDTOMapper();
    }
    @Bean
    public SubItemsDTOMapper subItemsDTOMapper() {
        return new SubItemsDTOMapper();
    }
}
