
package com.gamelog.GameLog.Service;

import com.gamelog.GameLog.Entity.User;
import java.util.List;


public interface UserService {
    User save(User pUser);
    List<User> findAll();
    User findById(Integer pUserId);
    void deleteById(Integer pUserId);
    User update(User pUser);
}
