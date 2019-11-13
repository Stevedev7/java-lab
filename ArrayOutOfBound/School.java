class School {
    public static void main(String[] args) {
        Student s[] = new Student[10];
        for(int i = 0; i < 10; i++){
            s[i] = new Student();
            s[i].read(i);
        }
        try{
            for(int i = 0; i < 11; i++){
                s[i].display();
            }
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
