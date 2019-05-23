package za.ac.cput.projectsss.factory.usercredentials;

import za.ac.cput.projectsss.domain.usercredentials.GymMemberVerification;

public class GymMemberVerificationFactory {
    public static GymMemberVerification getGymMember(String title, String username, String password){
        return new GymMemberVerification.Builder().title(title)
                .username(username)
                .password(password)
                .build();
    }
}
