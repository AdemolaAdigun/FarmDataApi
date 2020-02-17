package com.dataprocessing.farmdata.Repository;

import com.dataprocessing.farmdata.Model.PotatoFarm;
import org.springframework.data.repository.CrudRepository;

public interface PotatoRepo extends CrudRepository<PotatoFarm, Long> {
}
