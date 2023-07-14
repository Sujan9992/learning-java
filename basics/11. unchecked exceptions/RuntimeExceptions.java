public class RuntimeExceptions {
    public static void main(String[] args) {
        int[] array = new int[3];

      // do not catch unchecked exceptions
      // try{
      //   System.out.println(array[5]);
      // }catch (ArrayIndexOutOfBoundsException e){
      //   System.out.println(e.getMessage());
      // }
      System.out.println(array[2]);
    }
}
