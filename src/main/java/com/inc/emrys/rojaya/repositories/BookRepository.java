package com.inc.emrys.rojaya.repositories;

import com.inc.emrys.rojaya.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long> {
}
