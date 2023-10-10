

public class New {
    public static void main(String args[]){
        try {
            int i = 100/0;
        } catch (Exception e) {
            e.printStackTrace();
            //added loggers 
            system.out.println("added the loggers");
        }
    }
}
