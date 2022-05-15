package com.company;

public class array {
  public void Array()
  {
      int numbers[]={0,10,20,30,40,50,60,70,80,90};
      for(int i=0;i<10;i++)
      {
          System.out.println("Array List : "+numbers[i]);
      }

  }
  public void reverseArray()
  {
      int numbers[]={0,10,20,30,40,50,60,70,80,90};
      for(int i=10;i>0;i--)
      {
          System.out.println("Array List : "+numbers[i]);
      }


  }
  public void evenArray()
  {
      int numbers[]={0,1,2,3,4,5,6,7,8,9};
      for(int i=0;i<10;i++)
      {
            if(i%2==0)
            {
                System.out.println("Even Array :"+numbers[i]);
            }
      }
  }
    public void oddArray()
    {
        int numbers[]={0,1,2,3,4,5,6,7,8,9};
        for(int i=0;i<=10;i++)
        {
            if(i%2!=0)
            {
                System.out.println("Even Array :"+numbers[i]);
            }
        }
    }

}
