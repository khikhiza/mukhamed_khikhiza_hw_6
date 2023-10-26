public class Main {
    public static void main(String[] args) {
        Weapon bossweapon = new Weapon(WeaponType.Dissection, "Knife");

        Boss boss = new Boss();
        boss.setDamage(60);
        boss.setHealth(1000);
        boss.setWeapon(bossweapon);

        System.out.println(boss.printInfo());
        System.out.println("__________");


        Weapon skeweapon = new Weapon(WeaponType.FIREARM, "Bow");
        Skeleton skeleton1 = new Skeleton();
        skeleton1.setHealth(120);
        skeleton1.setDamage(7);
        skeleton1.setWeapon(skeweapon);
        skeleton1.setArrows(59);

        Skeleton skeleton2 = new Skeleton();
        skeleton2.setHealth(120);
        skeleton2.setDamage(10);
        skeleton2.setWeapon(skeweapon);
        skeleton2.setArrows(101);

        System.out.println(skeleton1.printInfo());
        System.out.println("__________");
        System.out.println(skeleton2.printInfo());
    }
}