package pages;

import cucumber.api.java.en.Given;


public class MystepDefs {
    @Given("I have (\\d+) cukes in my belly")
    public void i_have_n_cukes_in_my_belly(int cukes) {
        System.out.println("Cukes: %n\n"+cukes);
    }
}
