public class TryCatchFinally {
    public static void main(String[] args) {
        String[] strArray = new String[5];
        try{
            strArray[3] = "2332";
            System.out.println(strArray[8]);
        }
        catch (Exception e){
            System.out.println("........................Caught the exception");
            System.out.println("........................ERROR: " + e.getMessage());
        }
        finally {
            System.out.println("In finally block");
        }
    }
}
