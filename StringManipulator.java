public class StringManipulator {
    public static void main (String[] args) {
        StringManipulatorTesting manipulator = new StringManipulatorTesting();

        //
        String str = manipulator.trimAndConcat("   Vinson  ", "  Aiono  ");
        System.out.println(str);

        //get the index position of the given string
        Character target = 'i';
        String index = manipulator.getIndexOrNull("This is the coding dojo yes!", target);
        System.out.println(index);

        String substr = manipulator.concatSubstring("Vinson", 1, 3, "Aiono");
        System.out.println(substr);
        
    }
}