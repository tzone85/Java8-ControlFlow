/**
 * Created by Thando Mini on 1/11/2017.
 */
public class Switch {
    public static void main(String [] args){
        /*int value = 1;

        if(value == 1){
            System.out.println("Value was 1");
        }else if(value == 2){
            System.out.println("Value was 2");
        }else{
            System.out.println("Value was 1 or 2");
        }

        int switchValue = 4;

        switch (switchValue){
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3:case 4:case 5:
                System.out.println("Value was 3, 4, 5");
                System.out.println("The actual value was " + switchValue);
                break;

            default:
                System.out.println("Value was 1 or 2");
                break; */
        char value = 'A';

        switch (value){
            case 'A':
                System.out.println("Letter is A");
                break;

            case 'B':
                System.out.println("Letter is B");
                break;

            case 'C':
                System.out.println("Letter is C");
                break;

            case 'D':
                System.out.println("Letter is D");
                break;

            default:
                System.out.println("Not found");
                break;
        }

        String months = "july";

        switch (months.toLowerCase()){
            case "january":
                System.out.println("Jan");
                break;

            case "october":
                System.out.println("October");
                break;

            case "july":
                System.out.println("Jul");
                break;

            default:
                System.out.println("Not sure");
                break;
        }
    }
}
