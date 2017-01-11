/**
 * Created by Thando Mini on 1/11/2017.
 */
public class Switch {
    public static void main(String [] args){
        int value = 1;

        if(value == 1){
            System.out.println("Value was 1");
        }else if(value == 2){
            System.out.println("Value was 2");
        }else{
            System.out.println("Value was 1 or 2");
        }

        int switchValue = 1;

        switch (switchValue){
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3:
                System.out.println("value was 3");
                break;

            default:
                System.out.println("Value was 1, 2 or 3");
                break;
        }
    }
}
