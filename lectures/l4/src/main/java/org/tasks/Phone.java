class Phone
{
    public String number;
    public String model;
    public double weight;

    public void ReciveCall(String Name) {
        System.out.println("Вам звонит " + Name);
    }

    public String getNumber() {
        return number;
    }

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
        this.weight = 0.0;
    }

    public Phone() {
        this.number ="default";
        this.model = "default";
        this.weight = 0.0;
    }

    public void ReciveCall(String name, Phone p) {
        ReciveCall(name);
        System.out.println(p.getNumber());
    }

    public void SendMessage(Phone[] arrP) {
        for (int i = 0; i < arrP.length; i++) {
            System.out.println(arrP[i].getNumber());
        }
    }

    @Override
    public String toString() {
        String sph = "Номер: " + number + ", модель: " + model + ", вес: " + weight;
        return sph;
    }
}


