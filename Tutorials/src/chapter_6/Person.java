package chapter_6;

/**
 * @overview Person is who bought a specific model of mobile phone.
 * @attributes
 *      id Integer
 *      name String
 *      phone MobilePhone
 * @object A typical person is person=(id,name,phone).
 * @abstract_properties
 *     mutable(id) = False /\ optional(id) = False /\ min(id) = 1
 *     mutable(name) = True /\ optional(name) = False /\ length(name) = 30
 *     name = f + " " + l where:
 *          c is letter for all c in f /\
 *          c is letter for all c in l
 *     mutable(phone) = False /\ optional(phone) = True
 */
public class Person {
    private int id;
    private String name;
    private MobilePhone phone;

    public Person(int id, String name, MobilePhone phone) {
        this.id = id;
        this.name = name;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MobilePhone getPhone() {
        return phone;
    }

    public void setPhone(MobilePhone phone) {
        this.phone = phone;
    }
}
