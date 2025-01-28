package kevat25.backend_vko2.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import kevat25.backend_vko2.domain.Friend;



@Controller
public class FriendController {

    private List<Friend> friends = new ArrayList<>();

    @GetMapping("add")
    public String addFriend(Model model) {
        model.addAttribute("friend", new Friend());
        return "add";
    }
    
    @PostMapping("add")
    public String addFriend(Friend friend) {
        friends.add(friend);
        return "redirect:/friends";
    }
    
    @GetMapping("friends")
    public String showFriends(Model model) {
        System.out.println("Friends: " + friends);
        model.addAttribute("friends", friends);
        return "friends";
    }  
}
