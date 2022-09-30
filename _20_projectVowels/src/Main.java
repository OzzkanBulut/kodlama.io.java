public class Main {
    public static void main(String[] args) {
        char harf= 'x';
        char [] kalin = {'a','ı','o','u','A','I','O','U'};
        char[] ince = {'e','i','ö','ü','E','İ','Ö','Ü'};

        for(int i = 0 ; i<kalin.length;i++){
            if(harf==kalin[i]){
                System.out.println(harf + " is kalin");
            }
        }
        for(int i = 0 ; i<ince.length;i++){
            if(harf== ince[i]){
                System.out.println(harf + " is ince");
            }
        }

        switch(harf){
            case 'A':
            case 'I':
            case 'O':
            case 'U':
            case 'a':
            case 'ı':
            case 'o':
            case 'u':
                System.out.println("kalın");
                break;
            case 'e':
            case 'i':
            case 'ö':
            case 'ü':
            case 'E':
            case 'İ':
            case 'Ö':
            case 'Ü':
                System.out.println("ince");
                break;
            default:
                System.out.println("ne kalin ne ince");



        }



    }
}