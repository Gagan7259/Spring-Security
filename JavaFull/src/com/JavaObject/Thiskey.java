package com.JavaObject;

// THIS: is the
class Alien {
    private String name;
    private Long age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }

}

public class Thiskey {
    public static void main(String[] args) {
        Alien a = new Alien();
        a.setAge(699L);
        a.setName("Alen Rakesh");
        System.out.println(a.getAge() + ":" + a.getName());
    }
}
