package exampledao.dao;

import exampledao.entity.UserEntity;
import exaplemodel.User;

import static exampledao.entity.UserEntity.getUserEntity;

public class UserEntityDaoImpl implements UserEntityDao {

    public static class Singleton {
        static UserEntityDao HOLDER_INSTANCE = new UserEntityDaoImpl();
    }

    public static UserEntityDao getInstance(){
        return UserEntityDaoImpl.Singleton.HOLDER_INSTANCE;
    }

    @Override
    public void update(User user){
        UserEntity userEntity = getUserEntity(user);
        //some code
    }
}
