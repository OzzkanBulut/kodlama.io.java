public class UserValidationManager implements UserValidationService {
    @Override
    public boolean validate(Gamer gamer) {
        if(gamer.getFirstName()=="Özkan" && gamer.getLastName()=="Bulut" &&
                gamer.getNationalIdentity()==12345 && gamer.getBirthYear()==1999){
            return true;
        }
        else {
            return false;
        }
    }
}
