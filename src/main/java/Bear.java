public class Bear {
    private String name;
    private int age;
    private double weight;

    public Bear(String name, int age, double weight){
        this.name = name;
        this.age =age;
        this.weight = weight;
    }

    public String getName() {
        return name;
        //setter will be this.name
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public boolean isReadyToHibernate(){
        return this.weight >= 80;

//        return this.weight >= 80 ? true : false;

//        if (this.weight >= 80){
//            return true;
//        }
//        return false;

//        else{
//            return false;
//        }
    }



}
