package za.ac.cput.projectsss.controller.usercredentials;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.projectsss.domain.usercredentials.GymMemberVerification;
import za.ac.cput.projectsss.factory.usercredentials.GymMemberRegistrationFactory;

import java.util.Set;

@RestController
@RequestMapping("GymSystemtwo/Gymmemberverification")
public class GymMemberVerificationController {

    @Autowired
    private GymMemberVerificationServiceImpl service;

    @PostMapping("/create/{title/{username}/{password}")
    public @ResponseBody
    GymMemberVerification create(@PathVariable String title, @PathVariable String username, @PathVariable String password)
    {
        GymMemberVerification gymMemberVerification= GymMemberRegistrationFactory.getGymMember(title, username,password);
        return service.create(gymMemberVerification);
    }

    @GetMapping("/read/getall")
    @ResponseBody
    public Set<GymMemberVerification> getAll(){
        return service.getAll();
    }

    @PostMapping("/update")
    @ResponseBody
    public GymMemberVerification update(GymMemberVerification gymMemberVerification){
        return service.update(gymMemberVerification);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id){
        service.delete(id);
    }

}
