package kr.hs.dgsw.web_3_19;

import java.util.List;

public interface UserService {
    List<User> list();
    User view(String name);
    User viewById(String id);
    boolean add(User user);
    boolean addById(User user);
    User update(User user);
    User updateById(User user);
    boolean delete(String name);
    boolean deleteById(String id);
}
