public class Test {
    public static void main(String[] args){
        String fullName = getFullName("mahesh", "guttedar ","maheshkg@gmail.com");
        System.out.println(fullName);
    }
    private  static String getFullName(String firstName,String lastName, String Email){
        String fullName = firstName + " " + lastName + " " + " is id " + Email;
        System.out.println(fullName);
        return fullName;
    }
}
