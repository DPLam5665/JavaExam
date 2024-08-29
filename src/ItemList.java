import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ItemList {
    private List<Item> array;
    Scanner sc = new Scanner(System.in);
    public ItemList(){
        this.array =new ArrayList<>();

    }

    public void nhap(){
        for (int i = 0; i < 5; i++){
            System.out.println("\n#####################################");
            System.out.println("Item thu " + (i + 1));
            Item a = new Item();
            a.nhap();
            array.add(a);
        }
    }

    public void xuat(){
        for(Item a : this.array){
            System.out.println("\n#####################################");
            a.xuat();
            System.out.println("Tong gia tri quy doi ra vang cua " + a.name + " la: " + a.calcGold() + " xu");
        }
    }

    public void checkGold(){
        int sponGold;
        int allGold = 0;
        System.out.println("Hay nhap vao so vang ma Spon co: ");
        sponGold = sc.nextInt();
        for (Item a : this.array){
            allGold += a.calcGold();
        }
        if (sponGold > allGold){
            System.out.println("Chuc mung Spon da giai cuu thanh cong dong doi!!");
        } else{
            System.out.println("Chuc ban may man lan sau");
        }
    }
}
