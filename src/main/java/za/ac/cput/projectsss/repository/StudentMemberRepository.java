package za.ac.cput.projectsss.repository;

import za.ac.cput.projectsss.domain.StudentMember;

public interface StudentMemberRepository {

    StudentMember create(StudentMember studentMember);
    //StudentMember create(StudentMember studentMember);
    void delete(String studentMemberID);

}
