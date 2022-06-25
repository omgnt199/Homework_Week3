import javax.security.auth.login.LoginContext;
import java.util.*;

public class Duplicate {
    private  ArrayList<Long> arr1 = new ArrayList<Long>();
    private  ArrayList<Long> arr2 = new ArrayList<Long>();
    private  ArrayList<Long> rs = new ArrayList<Long>();
    private  Set<Long> s = new HashSet<Long>();

    public Duplicate() {
    }

    private void searchDup(){

        int k = 0;
        for(Long it:arr1){
            s.add(it);
        }
        for(Long it:arr2){
            s.add(it);
        }
        for (long it:s
             ) {
            rs.add(it);
        }
        rs.sort(Comparator.naturalOrder());
    }
    public static void main(String[] args) {
        Duplicate d = new Duplicate();
        Scanner sc = new Scanner(System.in);
        int n1,n2;
        System.out.println("Nhap so phan tu trong danh sach thu 1 :");
        n1 = sc.nextInt();
        for(int i=0;i<n1;i++){
            System.out.print("Nhap phan tu thu" + (i+1)+":" );
            d.arr1.add(sc.nextLong());
        }

        System.out.println("Nhap so phan tu trong danh sach thu 2 :");
        n2 = sc.nextInt();
        for(int i=0;i<n2;i++){
            System.out.print("Nhap phan tu thu" + (i+1)+":" );
            d.arr2.add(sc.nextLong());
        }
        d.searchDup();
        System.out.println(d.rs);
    }
}
