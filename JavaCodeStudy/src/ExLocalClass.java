// This Code is from http://bit.ly/3hhCDPB //
public class ExLocalClass {
        public void display(){
            int num = 23;

            class Inner{
                public void printMe(){
                    System.out.println("This is method inner class " + num);
                }
            }

            Inner Obj = new Inner();
            Obj.printMe();
        }

    public static void main(String[] args){
            ExLocalClass outer = new ExLocalClass();
            outer.display();
        }

}

