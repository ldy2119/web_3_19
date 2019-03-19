package kr.hs.dgsw.web_3_19;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    List<User> userList;

    public UserServiceImpl()
    {
        this.userList = new ArrayList<>();
        userList.add(new User("user1", "user111@dgsw.hs.kr", "stu1"));
        userList.add(new User("user2", "user222@dgsw.hs.kr", "stu2"));
        userList.add(new User("user3", "user333@dgsw.hs.kr", "stu3"));
    }


    @Override
    public List<User> list() {
        return userList;
    }

    @Override
    public User view(String name) {
        User found = null;
        for(int i = 0; i < userList.size(); i++)
        {
            if(userList.get(i).getName().equals(name))
            {
                found = this.userList.get(i);
                break;
            }
        }
        return found;
    }

    @Override
    public User viewById(String id) {
        User found = null;
        for(int i = 0; i < userList.size(); i++)
        {
            if(userList.get(i).getId().equals(id))
            {
                found = this.userList.get(i);
                break;
            }
        }
        return found;
    }

    public User find1(String name) {
        Iterator<User> iterator = this.userList.iterator();
        while(iterator.hasNext())
        {
            User found = iterator.next();
            if(found.getName().equals(name))
            {
                return found;
            }
        }
        return null;
    }

    public User find2(String name) {
        for(User found : userList)
        {
            if(found.getName().equals(name))
            {
                return found;
            }
        }
        return null;
    }

    public User find3(String name)
    {
        User found = userList.stream().filter(user -> user.getName().equals(name)).findAny().orElse(null);
        return found;
    }

    @Override
    public boolean add(User user) {
        return this.userList.add(user);
    }

    @Override
    public boolean addById(User user) {
        if(viewById(user.getId()) != null)
            return false;
        return this.userList.add(user);
    }

    @Override
    public User update(User user) {
        User found = view(user.getName());
        if(found != null)
            found.setEmail(user.getEmail());

        return found;
    }

    @Override
    public User updateById(User user) {
        User found = viewById(user.getId());
        if(found != null)
        {
            found.setEmail(user.getEmail());
            found.setName(user.getName());
        }
        return found;
    }

    @Override
    public boolean delete(String name) {
        User found = view(name);
        return this.userList.remove(found);
    }

    @Override
    public boolean deleteById(String id) {
        User found = viewById(id);
        return this.userList.remove(found);
    }
}
