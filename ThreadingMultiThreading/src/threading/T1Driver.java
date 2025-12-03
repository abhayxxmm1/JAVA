package threading;

public class T1Driver {
    public static void main(String[] args) {
        String name= Thread.currentThread().getName();
        int priority= Thread.currentThread().getPriority();
        long id= Thread.currentThread().getId();

        System.out.println(name);
        System.out.println(priority);
        System.out.println(id);
    }
}
