package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kosuri
 */
public class PersonDirectory {
    
    private List<Person> personDirectory;
	
	
	public PersonDirectory ()
	{
		personDirectory = new ArrayList<>();
	}
	
	
	
	public void addPerson(Person person)
	{
		personDirectory.add(person);
	}


	
	public List<Person> getPersonDirectory() {
		return personDirectory;
	}
	
    
}
