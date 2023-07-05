/* extending interface */
interface gill
{
    void add();
}
interface raj extends gill
{
    void sub();
}
class abhi implements raj /*in place of raj if we write gill then error will come*/
{
    @Override
    public void add()
    {
        int a=10,b=20,c;
        c=a+b;
        System.out.println("Addition "+c);
    }
        @Override
        public void sub()
        {
            int a=20,b=10,c;
            c=a-b;
            System.out.println("Subtraction "+c);
        }
}
class main 
{
    public static void main(String[] args) {
        raj r=new abhi();
        r.add(); r.sub();   
    }
}
