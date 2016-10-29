/**
 * Created by Катя on 29.10.2016.
 */
public class third {
    public static double commision (double withdraw){
        return withdraw*0.05;
    }
    public static void main (String[]arg){
        double[] balances ={1200,250,2000,500,3200};
        String[] ownerNames={"Kate","Oleg","Marina","Anna","Alex"};
        double[] withdrawals={10,3000,60,1000,200};
        double[] commision= new double[balances.length];
        for (int i=0; i<balances.length; i++){
            commision[i]=  commision(withdrawals[i]);
        }
        for(int i=0; i<balances.length; i++){
        if(balances[i]>=(withdrawals[i]+commision[i])){
            System.out.println();
            System.out.println(ownerNames[i]);
            System.out.println("Sum of withdrawal: "+withdrawals[i]);
            double res=balances[i]-withdrawals[i]-commision[i];
            System.out.println("Balance after withdrawal "+res);

        }
        else {
            System.out.println();
            System.out.println(ownerNames[i]);
            System.out.println("NO");}}
    }
}
