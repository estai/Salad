import java.util.List;

/**
 * Created by User on 01.11.14.
 */
public class ChiefCook {
    private String name;

    public ChiefCook(String name) {
        this.name = name;
    }


    public Salad createSalad(String s){
        Salad salad=new Salad();

       NameSalad nameSalad=NameSalad.valueOf(s.toUpperCase());
        switch (nameSalad){
            case OLIVIE: { System.out.println("Sostav salata "+NameSalad.OLIVIE);
                salad.add(new Carrot());
                         salad.add(new Cabbage());
                break;
            }
            case PODSHUBOY:{System.out.println("Sostav salata " + NameSalad.PODSHUBOY);
                    salad.add(new Carrot());
                break;}
        default: throw new EnumConstantNotPresentException(NameSalad.class,s.toUpperCase());
        }

  return salad;
}

    public void setName(String name) {
        this.name = name;}
    }
