public class product {
    String pcode;
    String pname;
    int price;
    public product(String pcode_get,String pname_get,int price_get){
        pcode = pcode_get;
        pname = pname_get;
        price = price_get;
    }
    public int get_price()
    {
        return price;
    }
    public static void main(String[]args)
    {
        product p_1=new product("A123","TV",2);
        product p_2=new product("B123","RADIO",21);
        product p_3=new product("C123","DVD",3);
        if(p_1.price<=p_3.price&&p_1.price<=p_2.price)
            System.out.println("Lowest product ID is:"+p_1.pcode);
        if(p_3.price<=p_1.price&&p_3.price<=p_2.price)
            System.out.println("Lowest product ID is:"+p_3.pcode);
        if(p_2.price<=p_3.price&&p_2.price<=p_1.price)
            System.out.println("Lowest product ID is:"+p_2.pcode);

    }
}

                                                                                        _______Output________
C:\Users\mlm\.jdks\openjdk-21.0.2\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2023.3.3\lib\idea_rt.jar=64512:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2023.3.3\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\mlm\IdeaProjects\athulya\out\production\athulya product
Lowest product ID is:A123

Process finished with exit code 0
