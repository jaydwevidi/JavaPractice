package JavaPractice.rand;

public class Tushar {

    static Boolean fun(int a , int b[]){

        for(int i=0;i<b.length;i++){
            for (int j=i;j<b.length;j++){
                if(b[i]==b[j])
                    return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = {5,4,3,2,1};
        System.out.println(fun(7 , arr));

    }


}
