//642115022
//Thanapong yamkamol

class Lab24x1 {
    public static void main(String[] args) {
        GenericStack<String> gI = new GenericStack<String>();

        gI.push("Mister 1");
        gI.push("Mister 2");
        gI.push("Mister 3");
        gI.push("Mister 4");

        System.out.println(gI.toString());
        System.out.println("Size: " + gI.getSize());
        System.out.println(gI.peek());
        System.out.println(gI.pop());
        System.out.println(gI.peek());
    }
}