import java.util.Scanner;

public class Item {
    protected String name;
    protected int power;
    protected float scale;
    protected int gold;
    protected int attack;

    public Item() {

    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public float getScale() {
        return scale;
    }

    public void setScale(int scale) {
        this.scale = scale;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }



    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap vao ten vat pham: ");
        this.name = sc.nextLine();
        System.out.println("Moi nhap vao chi so suc manh vat pham: ");
        this.power = sc.nextInt();
        System.out.println("Moi nhap vao he so suc manh vat pham: ");
        this.scale = sc.nextFloat();
        System.out.println("Moi nhap vao so vang quy doi/suc cong pha vat pham: ");
        this.gold = sc.nextInt();

    }

    public void xuat(){
        System.out.println("Ten vat pham: " + this.name);
        System.out.println("Chi so suc manh: " + this.power);
        System.out.println("He so suc manh: " + this.scale);
        System.out.println("So vang quy doi/suc cong pha: " + this.gold);
        System.out.println("Suc cong pha cua " + this.name + " la: " + this.calcAttack());
    }

    public int calcAttack(){
        attack = (int) (power * scale);
        return attack;
    }

    public int calcGold(){
        return attack * gold;
    }
}
