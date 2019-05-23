package za.ac.cput.projectsss.repository;

public interface InterfaceRepository<TYPE, ID> {
    TYPE create(TYPE type);
    TYPE update(TYPE type);
    void delete(ID id);
    TYPE reads(ID id);
}
