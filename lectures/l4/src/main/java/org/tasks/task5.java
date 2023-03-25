public class task5 {
    public static void main(String[] args) {
        PizzaOrder p = new PizzaOrder();
        p.PizzaOrder(Size.Small, true, "Ярославская 10");
        System.out.println(p);
        p.order();
        p.order();
        p.cancel();
        p.cancel();
        p.setAdress("Архангельская 2А");
        p.setSauce(false);
        p.setSize(Size.Big);
        System.out.println(p.getAdress());
        System.out.println(p.getSize());
        System.out.println(p.isSauce());

    }
}