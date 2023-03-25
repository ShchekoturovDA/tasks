public class Main {
    public static void main(String[] args) {
        pair<String, Integer> ph1 = new pair<String, Integer>("Mihail", Integer.valueOf(654978));
        pair<String, Integer> ph2 = new pair<>("Alexey", Integer.valueOf(245872));
        System.out.println(ph1);
        System.out.println(ph2);
        pair<String, Integer> ph3 = new pair<>(ph1.getName(), ph2.getNum());
        ph2.setName("Nikolay");
        ph2.setNum(ph1.getNum());
        System.out.println(ph3);
        System.out.println(ph2);
    }
}