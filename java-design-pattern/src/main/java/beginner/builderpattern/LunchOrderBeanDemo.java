package beginner.builderpattern;

import beginner.builderpattern.LunchOrderBeanBuilder.Builder;

public class LunchOrderBeanDemo {

  public static void main(String[] args) {
    LunchOrderBean lunchOrderBean = new LunchOrderBean();

    lunchOrderBean.setBread("Wheat");
    lunchOrderBean.setCondiments("Lettuce");
    lunchOrderBean.setDressing("Mustard");
    lunchOrderBean.setMeat("Ham");

    System.out.println(lunchOrderBean.getBread());
    System.out.println(lunchOrderBean.getCondiments());
    System.out.println(lunchOrderBean.getDressing());
    System.out.println(lunchOrderBean.getMeat());


    //Now the problem is it has no contract what a valid lunch order signifies

    LunchOrderBean lunchOrderBean1 = new LunchOrderBean();

    System.out.println(lunchOrderBean1.getBread());
    System.out.println(lunchOrderBean1.getCondiments());
    System.out.println(lunchOrderBean1.getDressing());
    System.out.println(lunchOrderBean1.getMeat());

    // this will still give some value , which is null and which is not valid
    //

    // Let's try out telescopic constructor :- which won't resolve this problem

    System.out.println("------------------------------------------");
    System.out.println("------------------------------------------");
    System.out.println("-----------Telescopic Exmpl---------------");
    System.out.println("------------------------------------------");
    System.out.println("------------------------------------------");


    LunchOrderBeanTelescopic lunchOrderBeanTelescopic = new LunchOrderBeanTelescopic("White","Lettuce","Mustard","Ham");


    System.out.println(lunchOrderBeanTelescopic.getBread());
    System.out.println(lunchOrderBeanTelescopic.getCondiments());
    System.out.println(lunchOrderBeanTelescopic.getDressing());
    System.out.println(lunchOrderBeanTelescopic.getMeat());



    System.out.println("------------------------------------------");
    System.out.println("------------------------------------------");
    System.out.println("-----------Builder Exmpl---------------");
    System.out.println("------------------------------------------");
    System.out.println("------------------------------------------");

    LunchOrderBeanBuilder.Builder builder = new LunchOrderBeanBuilder.Builder();
    builder.bread("White").condiments("Lettuce").dressing("Mayo").meat("Turkey");


    LunchOrderBeanBuilder lunchOrderBeanBuilder = builder.build();

    System.out.println(lunchOrderBeanBuilder.getBread());
    System.out.println(lunchOrderBeanBuilder.getCondiments());
    System.out.println(lunchOrderBeanBuilder.getDressing());
    System.out.println(lunchOrderBeanBuilder.getMeat());



  }

}
