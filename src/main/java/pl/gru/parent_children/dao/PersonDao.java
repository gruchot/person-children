package pl.gru.parent_children.dao;

import pl.gru.parent_children.model.Person;

import java.util.List;

public interface PersonDao {
    boolean savePerson (Person person);
    boolean deletePerson (Person person);
    boolean updatePerson (Person person);
    List<Person> getAllPersons ();

}
