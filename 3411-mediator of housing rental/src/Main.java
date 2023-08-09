import ext.HouseOwner;
import ext.MediatorStructure;
import ext.Tenant;

public class Main {

    public static void main(String[] args) {

        MediatorStructure mediator = new MediatorStructure();
  
        HouseOwner houseOwner = new HouseOwner("Tom", mediator);
        
        Tenant tenant = new Tenant("Jerry", mediator);

        mediator.setHouseOwner(houseOwner);
        mediator.setTenant(tenant);

        tenant.contact("Need a house with a big swimming pool.");
        houseOwner.contact("I have a house with a big swimming pool.");

    }

}