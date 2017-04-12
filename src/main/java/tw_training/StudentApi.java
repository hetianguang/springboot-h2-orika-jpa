package tw_training;

import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tw_training.db.Student;
import tw_training.db.StudentRepo;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Created by tghe on 4/12/17.
 */
@Component
@Path("/")
public class StudentApi {
    private MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();

    private StudentRepo studentRepo;
    @Autowired
    public StudentApi(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    @Path("addStudent")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Student addStudent(Student student) {
        studentRepo.save(student);
        return student;
    }

    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public ResultStudent addStudent(@PathParam("id") String id) {
        mapperFactory.classMap(Student.class, ResultStudent.class)
                .field("id", "studentNumber")
                .field("name", "studentName")
                .field("classNumber", "classNo")
                .byDefault()
                .register();
        MapperFacade mapper = mapperFactory.getMapperFacade();
        ResultStudent result = mapper.map(studentRepo.findById(id), ResultStudent.class);
        return result;
    }
}

