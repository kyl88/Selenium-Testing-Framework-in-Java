import org.testng.annotations.Test;

public class DependencyExample {

    @Test(dependsOnMethods = {"start"})
    void drive(){

        System.out.println("Car drives");



    }

    @Test()
    void start(){

        System.out.println("Car starts");


    }

    @Test(dependsOnMethods = {"drive"})
    void stop(){

        System.out.println("Car stops");
    }

    @Test(dependsOnMethods = {"drive","stop"},alwaysRun = true)
    void park(){

        System.out.println("Car is stationery");

    }
}
