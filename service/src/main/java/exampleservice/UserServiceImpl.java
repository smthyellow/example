package exampleservice;

import exampledao.dao.UserEntityDao;
import exampledao.dao.UserEntityDaoImpl;
import exampledao.entity.UserEntity;
import exaplemodel.User;

public class UserServiceImpl implements UserService {

    //Singleton

    private UserEntityDao userDao = UserEntityDaoImpl.getInstance();

    public void updateUser(User user){
        userDao.update(user);

    }
}
