public class pair <K, V>{
    private K name;
    private V num;

    public pair(K name, V num){
        this.name = name;
        this.num = num;
    }

    public void setName(K name) {
        this.name = name;
    }
    public void setNum(V num) {
        this.num = num;
    }

    public <K, V> K getName() {
        return (K) name;
    }
    public <K, V> V getNum() {
        return (V) num;
    }

    public String toString(){
        return "Имя: " + name + ", телефон: " + num;
    }
}
