public class ExMethodChaining {
    private String mName;
    private int mAge;

    public ExMethodChaining setName(String name){
        mName = name;
        return this;
    }
    public ExMethodChaining setAge(int age){
        mAge = age;
        return this;
    }
     public void show(){
        System.out.printf("Name: %s - Age: %d", mName,mAge);
        //return this;
    }

}
