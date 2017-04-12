package tw_training.db;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by tghe on 4/12/17.
 */
@Repository
public interface StudentRepo extends CrudRepository<Student,String> {
    Student findById(String id);
}
