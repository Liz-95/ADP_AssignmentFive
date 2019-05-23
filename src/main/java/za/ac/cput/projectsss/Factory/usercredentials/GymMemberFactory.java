package za.ac.cput.projectsss.factory.usercredentials;

import za.ac.cput.projectsss.domain.usercredentials.GymMember;

public class GymMemberFactory {
    public static GymMember getGymMember(String title, String username){
        return new GymMember.Builder().title(title)
                .username(username)
                .build();
    }
}
