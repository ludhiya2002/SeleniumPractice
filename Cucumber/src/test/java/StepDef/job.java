package StepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class job {
	

@Given("I am a {string} Tester")
public void i_am_a_tester(String string) {
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
	System.out.println("I am a" +string+ "Tester");
}

@When("I apply for a job")
public void i_apply_for_a_job() {
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
	System.out.println("I apply for a job");
}

@Then("I got a {string} paid job")
public void i_got_a_paid_job(String string) {
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
	System.out.println("I got a " +string+ "paid job");
}

@And("I am {string} satisfied with my salary")
public void i_am_satisfied_with_my_salary(String string) {
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
	System.out.println("I am" +string+ "satisfied with my salary");
}

@But("my parents are {string} satisfied")
public void my_parents_are_satisfied(String string) {
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
	System.out.println("my parents are" +string+ "satisfied");
}




}
