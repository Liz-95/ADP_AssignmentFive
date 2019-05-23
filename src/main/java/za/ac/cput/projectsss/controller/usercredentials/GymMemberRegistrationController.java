package za.ac.cput.projectsss.controller.usercredentials;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.projectsss.domain.usercredentials.GymMemberRegistration;
import za.ac.cput.projectsss.factory.usercredentials.GymMemberRegistrationFactory;

import java.util.Set;

@RestController
@RequestMapping("gymsystemtwo/gymmemberregistration")
public class GymMemberRegistrationController {

    @Autowired
    private GymMemberRegistrationController;

    @RequestMapping(value="/create/{title}/{firstname}/{lastname}/{password}", method= RequestMethod.POST)
    public GymMemberRegistration create (@PathVariable String title, @PathVariable String firstname, @PathVariable String lastname, @PathVariable String password)
    {
        GymMemberRegistration gymMemberRegistration = GymMemberRegistrationFactory.getGymMember(title, firstname, lastname, password);
        return service.create(gymMemberRegistration);
    }

    @RequestMapping(value="/read/{id}", method=RequestMethod.GET)
    public GymMemberRegistration read(@PathVariable String id)
    {
        return service.read(id);
    }

    @GetMapping("/read/getall")
    @ResponseBody
    public Set<GymMemberRegistration> getAll(){
        return service.getAll();
    }

    @PostMapping
    @ResponseBody
    public GymMemberRegistration update(GymMemberRegistration gymMemberRegistration)

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id){
        service.delete(id);
    }
}
