package com.xworkz.list.dto;

public class BiggBoss {
    private String names;
    private int salary;
    private boolean isRealityShow;
    private long Id;

    public BiggBoss(long id, boolean isRealityShow, String names, int salary) {
       this.Id = id;
        this.isRealityShow = isRealityShow;
        this.names = names;
        this.salary = salary;
    }

   public void setId(long Id){
       this.Id=Id;
   }
   public long getId(){
        return Id;
   }
   public void setNames(String names){
       this.names=names;
   }
   public String getNames(){
        return names;
   }
   public void setSalary(int salary){
        this.salary=salary;
   }
   public int getSalary(){
        return salary;
   }
   public void setRealityShow(boolean isRealityShow){
       this. isRealityShow=isRealityShow;
   }
   public boolean isRealityShow(){
        return isRealityShow;
   }
   @Override
   public String toString(){
        return "BiggBoss{" + "names='" + names + '\'' + ", salary=" + salary + ", realityShow=" + isRealityShow + ", id=" + Id + '}';
   }
}
