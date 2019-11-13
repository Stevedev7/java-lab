class Deadlock {
    public static void main(String[] args) {
        SharedResource r = new SharedResource("s1", "s2");
        Thread1 t1 = new Thread1(r);
        Thread2 t2 = new Thread2(r);
        t1.start();
        t2.start();
    }
}
