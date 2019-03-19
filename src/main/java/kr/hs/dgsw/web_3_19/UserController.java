package kr.hs.dgsw.web_3_19;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

//    @GetMapping("/user")
//    @ResponseBody
//    public List<User> list()
//    {
//        return userService.list();
//    }
//
//    @GetMapping("/user/{name}")
//    @ResponseBody
//    public User view(@PathVariable String name)
//    {
//        return userService.view(name);
//    }
//
//    @PostMapping("/user")
//    @ResponseBody
//    public boolean add(@RequestBody User user)
//    {
//        return this.userService.add(user);
//    }
//
//    @PutMapping("/user")
//    @ResponseBody
//    public User update(@RequestBody User user)
//    {
//        return this.userService.update(user);
//    }
//
//    @DeleteMapping("/user/{name}/")
//    @ResponseBody
//    public boolean delete(@PathVariable String name)
//    {
//        return this.userService.delete(name);
//    }

    @GetMapping("/user")
    @ResponseBody
    public List<User> list()
    {
        return userService.list();
    }

    @GetMapping("/user/{id}")
    @ResponseBody
    public User view(@PathVariable String id)
    {
        return userService.viewById(id);
    }

    @PostMapping("/user")
    @ResponseBody
    public boolean add(@RequestBody User user)
    {
        return this.userService.addById(user);
    }

    @PutMapping("/user")
    @ResponseBody
    public User update(@RequestBody User user)
    {
        return this.userService.updateById(user);
    }

    @DeleteMapping("/user/{id}/")
    @ResponseBody
    public boolean delete(@PathVariable String id)
    {
        return this.userService.deleteById(id);
    }
}
