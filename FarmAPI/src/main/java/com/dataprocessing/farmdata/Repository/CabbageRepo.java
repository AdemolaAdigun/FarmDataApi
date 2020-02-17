package com.dataprocessing.farmdata.Repository;

import com.dataprocessing.farmdata.Model.CabbageFarm;
import org.springframework.data.repository.CrudRepository;

public interface CabbageRepo extends CrudRepository<CabbageFarm, Long> {
}
