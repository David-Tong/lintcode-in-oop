import command.CurtainCommand;
import controller.Remote;
import entity.Curtain;

public class Main {

    public static void main(String[] args) {

        CurtainCommand command = new CurtainCommand(new Curtain());
        Remote remote = new Remote(command);

        System.out.print("Action 1: ");
        remote.action("open");
        System.out.print("Action 2: ");
        remote.action("close");

    }

}
