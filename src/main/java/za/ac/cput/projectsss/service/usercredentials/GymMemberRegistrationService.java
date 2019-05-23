package za.ac.cput.projectsss.service.usercredentials;

import za.ac.cput.projectsss.domain.usercredentials.GymMemberRegistration;
import za.ac.cput.projectsss.service.IService;

import java.util.Set;

public interface GymMemberRegistrationService extends IService<GymMemberRegistration, String> {
    Set<GymMemberRegistration> getAll();

}
