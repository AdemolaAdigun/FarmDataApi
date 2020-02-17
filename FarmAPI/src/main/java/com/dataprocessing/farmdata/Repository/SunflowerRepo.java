package com.dataprocessing.farmdata.Repository;

import com.dataprocessing.farmdata.Model.SunflowerFarm;
import org.springframework.data.repository.CrudRepository;

public interface SunflowerRepo extends CrudRepository<SunflowerFarm, Long> {
}
