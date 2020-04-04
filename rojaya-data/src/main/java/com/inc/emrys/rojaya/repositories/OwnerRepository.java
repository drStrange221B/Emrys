package com.inc.emrys.rojaya.repositories;

import com.inc.emrys.rojaya.model.Owner;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OwnerRepository extends CrudRepository<Owner,Long> {

    Owner findByLastName(String lastName);

//    @Query(value = "select * from owners where upper(last_name) like ?1", nativeQuery = true)
//    List<Owner> findAllByLastNameLike( String lastName);

    @Query(value ="select * from owners where upper(last_name) like :lastName", nativeQuery=true)
    List<Owner> findAllByLastNameLike(@Param("lastName") String lastName);


}
