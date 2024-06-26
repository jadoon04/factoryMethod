
package personfactory;


    
    public class PersonFactory {
    public IPerson getPerson(PersonType type) {
        switch (type) {
            case Rural:
                return new Villager();
            case Urban:
                return new CityPerson();
            default:
                throw new IllegalArgumentException("Unsupported PersonType: " + type);
        }
    }
}

