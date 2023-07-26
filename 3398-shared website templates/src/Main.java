import client.Demand;
import factory.Template;
import factory.WebsiteFactory;
import map.ContentMap;

public class Main {

    static {
        ContentMap.CONTENT_TOM.put("Title", "Tom's Blog.");
        ContentMap.CONTENT_TOM.put("Desc", "Welcome to My Blog.");
        ContentMap.CONTENT_JERRY.put("Title", "News Website.");
        ContentMap.CONTENT_JERRY.put("Desc", "Free for Everyone!");
        ContentMap.CONTENT_MIKE.put("Title", "Copy a News Website.");
        ContentMap.CONTENT_MIKE.put("Content", "Copy from Jerry's.");
    }

    public static void main(String[] args) {

        WebsiteFactory factory = new WebsiteFactory();

        Demand tom = new Demand("Tom", "Blog", ContentMap.CONTENT_TOM);
        Template templateTom = factory.createWebsite(tom.getUsername());
        templateTom.create(tom);

        Demand jerry = new Demand("Jerry", "News", ContentMap.CONTENT_JERRY);
        Template templateJerry = factory.createWebsite(jerry.getUsername());
        templateJerry.create(jerry);


        Demand mike = new Demand("Mike", "News", ContentMap.CONTENT_MIKE);
        Template templateMike = factory.createWebsite(jerry.getUsername());
        templateMike.create(mike);

        System.out.println("\nSize of Pool: " + factory.getSize());

    }

}