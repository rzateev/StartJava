public class Wolf {	
    private String name;
    private Integer age;
    private Integer weight;
    private String sex;
    private String color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        if (age > 8) {
            System.out.println("Некорректный возраст");
        } else {
           this.age = age;
        }
    }


    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer  weight) {
        this.weight = weight;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void move() {
        System.out.println("moving");
    } 

    public void run() {
        System.out.println("running");
    } 

    public void sit() {
        System.out.println("sitting");
    }

    public void hunt() {
        System.out.println("hunting");
    }

    public void howl() {
        System.out.println("howling");
    }



}