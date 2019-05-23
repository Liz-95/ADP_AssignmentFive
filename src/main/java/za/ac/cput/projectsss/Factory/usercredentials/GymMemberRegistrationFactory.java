package za.ac.cput.projectsss.factory.usercredentials;

import za.ac.cput.projectsss.domain.usercredentials.GymMember;
import za.ac.cput.projectsss.domain.usercredentials.GymMemberRegistration;

public class GymMemberRegistrationFactory {
    public static GymMemberRegistration gymMemberRegistration(String title, String firstname, String lastname, String password)
    {
        return new GymMemberRegistration.Builder().title(title)
                .firstname(firstname)
                .lastname(lastname)
                .password(password)
                .build();
    }
}
