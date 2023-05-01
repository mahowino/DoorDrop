package online.doordrop.kenya.DoorDrop.store.config;

import online.doordrop.kenya.DoorDrop.store.DTOMapper.StoreCategoryDTOMapper;
import online.doordrop.kenya.DoorDrop.store.DTOMapper.StoreDTOMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StoreConfig {

    @Bean
    public StoreCategoryDTOMapper storeCategoryDTOMapper() {
        return new StoreCategoryDTOMapper();
    }
    @Bean
    public StoreDTOMapper storeDTOMapper() {
        return new StoreDTOMapper();
    }

}
