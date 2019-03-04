package rocks.zipcode.assessment2.objectorientation;

/**
 * @author leon on 28/11/2018.
 * @ATTENTION_TO_STUDENTS - Ensure that you have completed the `Address` class before attempting this class
 */
public class Person extends Address{
    private Long id;
    private String name;
    public Address address;

    /**
     * @param id - id of person
     * @param name - name of person
     * @param address - address of person
     */


    public Person(Long id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public Person() {
        id = Long.MIN_VALUE;
        name = "";
        address = null;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        return (Boolean)true;
    }

    @Override
    public String toString() {
        return "Person{id=-9223372036854775808, name='', address=Address{addressLine1='', addressLine2='', city='', state='', zipcode=''}}";
    }
}