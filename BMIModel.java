package com.example.hsdhillon13.bmi;

import ca.roumani.i2c.Utility;

public class BMIModel
{
   /* BMIModel myModel = new BMIModel("90","1.8");
    String myBMI = myModel.getBMI();*/
   private double weight;
   private double height;

   public BMIModel(String w, String h)
   {
       this.weight = Double.parseDouble(w);
       this.height = Double.parseDouble(h);
   }
    public String getBMI()
    {
        double index = this.weight / (this.height * this.height);
        String result = String.format("%.1f", index);
        return result;
    }

    public String toPound()
    {
        double poundw = Math.round(this.weight / 0.454);
        String poundresult = String.format("%.0f", poundw);
        return poundresult;
    }

    public String toFeetInch()
    {
        double feetInch = this.height;

        String heightresult = Utility.m2FtInch(feetInch);
        return heightresult;
    }

    public static void main(String[] args)
    {
        BMIModel myModel = new BMIModel("100", "1.8");
        System.out.println(myModel.getBMI());
        myModel = new BMIModel("45", "1.35");
        System.out.println(myModel.getBMI());
        myModel = new BMIModel("80", "1.2");
        System.out.println(myModel.getBMI());

        myModel = new BMIModel("70", "1.78");
        System.out.println(myModel.getBMI());
        System.out.println(myModel.toPound());
        System.out.println(myModel.toFeetInch());


    }
}

