package kr.hs.dgsw.web_3_19;

import java.util.List;

public interface UserService {
    List<User> list();
    User view(String name);
    boolean add(User user);
    User update(User user);
    boolean delete(String name);
    User viewById(String id);
    boolean addById(User user);
    User updateById(User user);
    boolean deleteById(String id);
}
