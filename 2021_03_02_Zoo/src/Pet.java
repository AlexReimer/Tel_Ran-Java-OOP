abstract class Pet {
    //инвентаризация приборов
    //объект дата, лицензия, серийный номер
    abstract void moves ();
    public String name;

   public Pet (String name) {
       this.name = name;
   }

    public void eats (){
        System.out.println("Трехразовое питание");
    }

    abstract void sleep ();


}
