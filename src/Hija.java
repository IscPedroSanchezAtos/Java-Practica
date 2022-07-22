public final class Hija extends Padre{
    private String atrH1;
    private String atrH2;

    public Hija(String atributo1, String atributo2) {
        atrH1 = atributo1;
        atrH2 = atributo2;
    }



    @Override
    protected void setAtr1(){
       super.setAtr1();
    }
    @Override
    protected void setAtr2(){
        super.setAtr1();

    }

    public void hija1 (){
    System.out.println("atributo 1 de clase hija");
    }

    public void hija2(){
        System.out.println("atributo 2 de clase hija");

    }

}
