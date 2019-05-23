package za.ac.cput.projectsss.service.usercredentials;

import za.ac.cput.projectsss.domain.usercredentials.GymMemberVerification;
import za.ac.cput.projectsss.service.IService;

import java.util.Set;

public interface GymMemberVerificationService extends IService<GymMemberVerificationService, String> {
   Set<GymMemberVerification> getAll();
}

