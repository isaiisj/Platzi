public class DataTypes {
    public static void main(String[] args) {

        int n = 1234567890;
        long nL = 12345678901L;

        double nD = 123.456;
        float nF = 123.456F;


        
        var salary = 1000; //int
        //pension 3%
        var pension = salary*0.03; //double
        var totalSalary = salary - pension; //double

        /*
        En este caso si imprimimos totalSalary al ser la resta de un INT menos un DOUBLE 
        nos devuelve el tipo de dato de mayor jerarquía para evitar alguna perdida de datos, 
        un int puede ser trabajado y operado como un double, mientras que un double al ser
        casteado a un int puede sufrir una perdida de datos.
        */

        System.out.println(salary);
        System.out.println(pension);
        System.out.println(totalSalary);

        var employeeName = "Anahí Salgado"; //string
        System.out.println("EMPLOYEE: " + employeeName + " SALARY: " + totalSalary);


    }
}
