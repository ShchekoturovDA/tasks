public class PizzaOrder {
   Size size;
   boolean Sauce;
   String Adress;
   boolean GotIt;

   public void PizzaOrder(Size s, boolean sauce, String ad){
       this.size = s;
       this.Sauce = sauce;
       this.Adress = ad;
   }

   public void order(){
       if (GotIt) {
           System.out.println("Заказ уже принят");
       } else {
           GotIt = true;
           String so = "Заказ принят, Ваша свежая";
           switch (size) {
               case Big -> so += " БОЛЬШАЯ";
               case Medium -> so += " средняя";
               case Small ->  so += " маленькая";
           }
           so += " пицца с пепперони и сыром";
           if (Sauce) {
               so += ", а главное с соусом песто,";
           };
           so += " уже скоро отправится по адресу " + Adress;
           System.out.println(so);
       }
   }

   public void cancel(){
       if (GotIt) {
           GotIt = false;
           System.out.println("Заказ отменён");
       } else {
           System.out.println("Заказ не был принят");
       }
   }

    public void setSize(Size s) {
        this.size = s;
    }

    public void setAdress(String adress) {
        this.Adress = adress;
    }

    public void setSauce(boolean sauce) {
        this.Sauce = sauce;
    }

    public String getAdress() {
        return Adress;
    }

    public Size getSize() {
        return size;
    }

    public boolean isSauce() {
        return Sauce;
    }

    public String toString(){
        String so = "Пицца размера " + size + ", ";
        if (Sauce) {
            so += "с соусом";
        } else {
            so += "без соуса";
        }
        so += ", должна быть доставлена на адрес: " + Adress;
        return so;
    }

}
