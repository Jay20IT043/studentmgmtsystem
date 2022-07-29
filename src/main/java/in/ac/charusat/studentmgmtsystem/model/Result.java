package in.ac.charusat.studentmgmtsystem.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Result {
    @Id
   private Integer id;
   private String name;

   public Result(){

   }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
