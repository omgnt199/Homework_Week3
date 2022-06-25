import javax.security.auth.login.LoginContext;
import java.util.*;

public class Duplicate {
    private  ArrayList<Long> arr1 = new ArrayList<Long>();// Danh sách phần tử thứ nhất
    private  ArrayList<Long> arr2 = new ArrayList<Long>();// Danh sách phần tử thứ hai
    private  ArrayList<Long> rs = new ArrayList<Long>(); // Danh sách kết quả
    private  Set<Long> s = new HashSet<Long>();// Sử dụng set để lưu các phần tử không trùng lặp

    public Duplicate() {
    }

    // Phương thức tim danh sách kết quả bài toán
    private void searchDup(){

        int k = 0;
        // Thêm các phần tử ds1 vào Set
        for(Long it:arr1){
            s.add(it);
        }
        // Thêm các phần tử ds2 vào Set
        for(Long it:arr2){
            s.add(it);
        }
        //Lưu các phần tử không trùng lặp vào ds kết quả
        for (long it:s
             ) {
            rs.add(it);
        }
        // Sắp xếp các phần tử theo thứ tự tăng dần
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
