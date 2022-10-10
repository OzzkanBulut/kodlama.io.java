public class GamerManager implements GamerService{
    private UserValidationService userValidationService;

    public GamerManager(UserValidationService userValidationService) {
        this.userValidationService = userValidationService;
    }

    @Override
    public void add(Gamer gamer) {
        if(userValidationService.validate(gamer) == true) {
            System.out.println(gamer.getFirstName() + " is added");
        }
        else {
            System.out.println(gamer.getFirstName()+" is wrong");
        }
    }

    @Override
    public void update(Gamer gamer) {
        System.out.println(gamer.getFirstName()+" is updated.");

    }

    @Override
    public void delete(Gamer gamer) {
        System.out.println(gamer.getFirstName()+" is deleted");

    }
}
