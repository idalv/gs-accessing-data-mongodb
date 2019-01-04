package hello;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.annotation.Version;

import java.util.Date;


public class Customer {

    @Id
    public String id;

    public String firstName;
    public String lastName;

    @CreatedDate
    public Date createdDate;
    @LastModifiedDate
    public Date updatedDate;

    @Version
    public Long version;

    public Customer() {}

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return String.format(
                "Customer[id=%s, firstName='%s', lastName='%s']",
                id, firstName, lastName);
    }

}

