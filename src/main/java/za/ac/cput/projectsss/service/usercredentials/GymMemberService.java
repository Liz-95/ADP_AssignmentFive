package za.ac.cput.projectsss.service.usercredentials;

import za.ac.cput.projectsss.domain.usercredentials.GymMember;
import za.ac.cput.projectsss.service.IService;

import java.util.Set;

public interface GymMemberService extends IService<GymMember, String> {
    Set<GymMember> getAll();
}
