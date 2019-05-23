package za.ac.cput.projectsss.controller.usercredentials;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.projectsss.domain.usercredentials.GymMember;
import za.ac.cput.projectsss.factory.usercredentials.GymMemberFactory;
import za.ac.cput.projectsss.service.usercredentials.GymMemberService;

@RestController
@RequestMapping("/GymSystemtwo/Gymmember")
public class GymMemberController {

    @Autowired
   // private GymMemberServiceImpl service;

    @PostMapping("/create/{title}/{username}")
    public @ResponseBody
       GymMember create (@PathVariable String title, @PathVariable String username){
        GymMember gymMember= GymMemberFactory.getGymMember(title,username);
        return service.create(gymMember);
    }

    @PostMapping("/update")
    @ResponseBody
    public GymMember update(GymMember gymMember){
        return service.update(gymMember);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id){
        service.delete(id);
    }

}
