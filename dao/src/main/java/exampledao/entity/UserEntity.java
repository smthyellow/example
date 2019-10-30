package exampledao.entity;

import exaplemodel.User;

import javax.persistence.*;

@Entity
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String name;

    public UserEntity(String name) {
        this.name = name;
    }

    public UserEntity(String name, int id) {
        this.name = name;
        this.id = id;
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

    public static UserEntity getUserEntity(User user){
        UserEntity userEntity = new UserEntity(user.getName(), user.getId());
        return userEntity;
    }
}
