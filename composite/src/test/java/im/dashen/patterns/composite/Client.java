package im.dashen.patterns.composite;

import org.junit.Test;

import static org.junit.Assert.*;

public class Client {

    @Test
    public void testOrganization() throws Exception {
        Employee dash = new Developer("dash", 123.1);
        Employee rc = new Designer("rc", 123.1);

        Organization organization = new Organization();
        organization.addEmployees(dash);
        organization.addEmployees(rc);

        System.out.println("Net salary: " + organization.getNetSalary());
    }
}